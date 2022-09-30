package com.ravi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {
    private int age;
    private String name;
    private String schoolName;

    public Java8Features(int age, String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public Java8Features() {

    }

    public static void main(String[] args) {

        List<Java8Features> studentDetails = new ArrayList<>();
        studentDetails.add(new Java8Features(25, "Ravi", "Balavikas"));
        studentDetails.add(new Java8Features(26, "Ravi Bhat B", "Balavikas School"));
        studentDetails.add(new Java8Features(40, "A", "Balavikas"));
        studentDetails.add(new Java8Features(42, "B", "Balavikas School"));


        //pint all using for each

        System.out.println("Print All");
        for (Java8Features java8Features : studentDetails) {
            System.out.println(java8Features);
        }

        System.out.println("");
        System.out.println("Print Based on Features");
        System.out.println("");
        //print only age using java8

        studentDetails.stream().filter(studentDetails1 -> studentDetails1.getAge() > 30).forEach(java8Features -> System.out.println(java8Features));

        //print the avg age of each school
        System.out.println("");
        System.out.println("print the avg age of each school");
        System.out.println("");
        studentDetails.stream().collect(Collectors.groupingBy(studentDetails1 -> studentDetails1.getSchoolName(), Collectors.averagingInt(studentDetails1 -> studentDetails1.getAge())))
                .forEach((schoolName, avgAge) -> System.out.println(schoolName + " " + avgAge));


        System.out.println("");
        System.out.println("print the name &0 age of each student");
        System.out.println("");


        studentDetails.stream().forEach(std-> System.out.println(std.getName()+" "+std.getAge()));

    }


}
