<%@ page import="com.example.model.*" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>Result cows info</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="wrapper">
        <div>
            <h1 align="center">Cow information:</h1>
            <p>
                <%
                  Cow cow = (Cow) request.getAttribute("styles");
                %>
                <table border="1">
                    <tr>
                        <th>Cow's number</th>
                        <th>Cow's age</th>
                    </tr>
                    <tr>
                        <td><%= cow.getCowNumber() %></td>
                        <td><%= cow.getAge() %></td>
                    </tr>
                </table>
            </p>
        </div>
    </div>
</body>

</html>