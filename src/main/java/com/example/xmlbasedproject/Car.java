package com.example.xmlbasedproject;

public class Car {

    private String brand;

    public Car (String brand){
        this.brand=brand;
        System.out.println("Car is building...");
    }
    public void getBrand (){
        System.out.println("Car brand: "+this.brand);
    }
}
