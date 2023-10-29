package com.TheTroisMousquetaires.GetFit.entity;

public class User {
    String name;
    String email;
    String phoneNumber;
    String location;
    String gender;
    double height;
    double weight;
    double bodyFatPecentage;
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void set_email(String email){

        this.email = email;
    }
    public String get_email(){
        return email;
    }

    public void set_phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String get_phoneNumber(){
        return phoneNumber;
    }

    public void set_location(String location){
        this.location = location;
    }

    public String get_location(){
        return location;
    }

    public void set_gender(String gender){
        this.gender = gender
    }
    public String get_gender(){
        return gender;
    }

    public void set_height(double height){
        this.height = height;
    }

    public double get_height(){
        return height;
    }
    public void set_weight(double weight){
        this.weight = weight;
    }
    public double get_weight(){
        return weight;
    }
    public void set_bodyFatPecentage(double bodyFatPecentage){
        this.bodyFatPercentage = bodyFatPercentage;
    }
    public double get_bodyFatPercentage(){
        return bodyFatPercentage;
    }
}
