package org.example;

import org.example.withXml.People2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

       ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        People2 people2 = context.getBean("person1", People2.class);
        System.out.println("people2 = " + people2);
        people2.getPet().petMinus();
        people2.getPet().petPlus();

        People2 people1 = context.getBean("person2", People2.class);
        System.out.println("people1 = " + people1);
        people1.getPet().petMinus();
        people1.getPet().petPlus();


//            AnnotationConfigApplicationContext context =
//                    new AnnotationConfigApplicationContext(Config.class);
//
//            Person person = context.getBean("person", Person.class);
//            person.getAnimal().animalMinus();
//            person.getAnimal().animalPlus();
//            System.out.println("person = " + person);
//
//            Person person1 = context.getBean("person1", Person.class);
//            person1.getAnimal().animalMinus();
//            person1.getAnimal().animalPlus();
//            System.out.println("person1 = " + person1);

    }
}
