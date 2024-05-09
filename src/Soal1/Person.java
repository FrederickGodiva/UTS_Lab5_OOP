package Soal1;

import java.lang.Math;

public class Person {
    private String name;
    private int age;
    private String university;

    public Person() {
        this.name = "Anonymous";
        this.age = (int) (Math.random() * 100 + 1);
        this.university = "Unknown University";
    }

    public Person(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getUniversity() {
        return this.university;
    }

    public void display() {
        System.out.println("Hey there, I'm " + this.getName());
        System.out.println("I'm " + this.getAge() + " years old.");
        System.out.println("I'm an undergraduate student in " + this.getUniversity());
    }
}

class LaboratoryAssistant extends Person {
    private String workPlace;
    private int teachingExperience;
    private int numberOfClasses;

    public LaboratoryAssistant(String name, int age, String university, String workPlace, int teachingExperience, int numberOfClasses) {
        super(name, age, university);
        this.workPlace = workPlace;
        this.teachingExperience = teachingExperience;
        this.numberOfClasses = numberOfClasses;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setTeachingExperience(int teachingExperience) {
        this.teachingExperience = teachingExperience;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getWorkPlace() {
        return this.workPlace;
    }

    public int getTeachingExperience() {
        return this.teachingExperience;
    }

    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    @Override
    public void display() {
        System.out.println("Greetings, I am " + this.getName() + ", currently serving as a laboratory assistant at the " + this.getWorkPlace() + ".");
        System.out.print("Over the course of " + this.getTeachingExperience() + " semesters, ");
        System.out.println("I have undertaken the role of an educator, imparting knowledge to a total of " + this.getNumberOfClasses() + " classes within the institution.");
    }
}