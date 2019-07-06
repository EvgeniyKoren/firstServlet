package com.example.model;

import java.lang.*;
public class Cow {

    private String cowNumber;
    private Double age;
    private int cowId;

    // Cow (String num){
    //     cowNumber = this.num;
    // }
    public void setCowNumber (String number) {
        cowNumber = number;
    }
    public String getCowNumber () {
        return cowNumber;
    }
    public void setAge (Double years) {
        age = years;
    }
    public Double getAge () {
        return age;
    }
    public void setCowId (int id) {
        cowId = id;
    }
    public int getCowId () {
        return cowId;
    }
    // public void toString(){
    //     System.out.println("cow id " + cowId +
    //                        " cow num " + cowNumber +
    //                        " cow age " + age);
    // }
}