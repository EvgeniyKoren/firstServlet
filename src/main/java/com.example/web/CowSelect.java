package com.example.web;

import com.example.model.Cow;
import com.example.model.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//
public class CowSelect extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws IOException, ServletException {

        String number = request.getParameter("number");
        // Cow cow = new Cow();
        // cow.setCowId(2);
        // cow.setCowNumber(number);
        // cow.setAge(3.8);
        String query = "SELECT * FROM cows WHERE cownum = \'" + number + "\';";
        Service service = new Service();
        Cow cow = new Cow();
        try {
            Statement statement = service.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                cow.setCowId(resultSet.getInt(1));
                cow.setCowNumber(resultSet.getString(2));
                cow.setAge(resultSet.getDouble(3));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        request.setAttribute("styles", cow);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }
}