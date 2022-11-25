package org.example;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // how to make clone from student

        Student student=new Student(111,"marko");
        Student student1= (Student) student.clone();

        System.out.println(student.name+""+student.rollNo);
        System.out.println(student1.name+""+student1.rollNo);



    }
}