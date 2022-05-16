package org.example.withXml;

import org.example.Animal;

public class Cat implements Pet {
    private String name;
    private String color;

    public Cat() {
    }

    public Cat(String name, String color) {
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
        System.out.println("always !!!");
    }

    @Override
    public void petMinus() {
        System.out.println("Every day !!!");
    }


    @Override
    public String toString() {
        return "Cat:" +
                "Name:" + name  +
                " color:" + color;
    }
}
