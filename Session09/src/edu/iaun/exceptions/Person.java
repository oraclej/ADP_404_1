package edu.iaun.exceptions;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException {
        if(age < 0)
            throw new RuntimeException("age is negative");
        this.age = age;
    }

    public static void main(String[] args) {
        Person ali = new Person();
//        try {
            ali.setAge(-10);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}
