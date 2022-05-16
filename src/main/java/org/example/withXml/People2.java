package org.example.withXml;

public class People2 {
    private Pet pet;
    private String name;
    private  int age;

    public People2() {
    }

    public People2(Pet pet, String name, int age) {
        this.pet = pet;
        this.name = name;
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People2{" +

                "name='" + name  +
                "age=" + age+
                "pet=" + pet ;
    }
}
