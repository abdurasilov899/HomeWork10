package org.example.confApp;

import org.example.Animal;
import org.example.Dog;
import org.example.Lion;
import org.example.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:all.properties")
public class Config {
    @Bean
    public Animal dog() {
        return new Dog();
    }
    @Bean
    public Animal lion(){
        return  new Lion();
    }
    @Bean("person")
    @Scope("prototype")
    public Person person(){
        return  new Person(dog());
    }

    @Bean("person1")
    @Scope( "prototype")
    public Person person1(){
        person1().getName();
        return  new Person((lion()));
    }
}
