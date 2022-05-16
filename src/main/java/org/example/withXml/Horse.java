package org.example.withXml;


public class Horse implements Pet {
    private String name;
    private String color;

    public Horse() {
    }

    public Horse(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void petPlus() {
        System.out.println("This my lovely horse !!");
    }

    @Override
    public void petMinus() {
        System.out.println("eats a lot!");
    }


    @Override
    public String toString() {
        return "Horse:" +
                "Name:" + name +
                " color:" + color ;
    }
}
