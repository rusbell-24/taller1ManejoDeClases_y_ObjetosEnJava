package edu.rusbellruiz.quarrylevel2workshop1;

import java.util.ArrayList;

public class Fruit {
    public String name;
    private float averageWeight;
    public String color;
    public ArrayList<String> colors = new ArrayList<String>();

    public Fruit(String name, float averageWeight, String color){
        this.name = name;
        this.averageWeight = averageWeight;
        this.color=color;
        setColor(this.color);
    }

    public void setColor(String color) {
        this.color = color;
        this.colors.add(this.color);
    }

    public String getColor() {
        return color;
    }

    public ArrayList<String> getColors() {
        return colors;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", color='" + color + '\'' +
                ", colors=" + colors +
                '}';
    }
}
