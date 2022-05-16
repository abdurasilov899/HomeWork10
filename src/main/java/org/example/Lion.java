package org.example;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor
public class Lion implements Animal {
    @Value("${lion.name}")
    private  String name;
    @Value("${lion.age}")
    private  int age;

    @Override
    public void animalPlus() {
        System.out.println("I Don't NO!!!");
    }

    @Override
    public void animalMinus() {
        System.out.println("Dangerous to humans");
    }

    @Override
    public String toString() {
        return "Lion =>"+
                "name:" + name +"  " +
                "age:" + age+"  ";
    }
}
