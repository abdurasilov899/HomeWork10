package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Setter
@NoArgsConstructor
@Component()
public class Person {
    private  Animal animal;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "name:" + name +
                "age:" + age +"\n"+
                "animal:" + animal ;
    }
}
