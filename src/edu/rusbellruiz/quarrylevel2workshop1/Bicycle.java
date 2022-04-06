package edu.rusbellruiz.quarrylevel2workshop1;

public class Bicycle {
    private String brand;
    private String color;
    private double speed;

    public Bicycle(){
        this.brand = "GW";
        this.color = "Gris";
        this.speed = 0;
    }

    public Bicycle(String brand, String color, double initialSpeed){
        this.brand = brand;
        this.color = color;
        this.speed = initialSpeed;
    }

    public String getMarca(){
        return brand;
    }
    public void setMarca(String brand){
        this.brand = brand;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getSpeed(){
        return speed;
    }
    public void pedaling(double acceleration){
        this.speed = this.speed + acceleration;
    }
    public void brake(){
        if(this.speed > 0){
            this.speed--;
        }
    }
}
