package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor

public class Dog implements Animal{
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private int age;
    @Value("${dog.color}")
    private String color;

    @Override
    public void animalPlus() {
        System.out.println("Быстрый");
    }

    @Override
    public void animalMinus() {
        System.out.println("Опасный !!!");
    }

    @Override
    public String toString() {
        return "Dog =>" +
                "age:" + age +"  " +
                "color:" +"  "+ color;
    }
}
