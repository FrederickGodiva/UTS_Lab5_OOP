package Soal1;

// Import library for random method
import java.lang.Math;

public class Person {
    // Attribute Encapsulation
    private String name;
    private int age;
    private String university;

    // Constructor Overloading
    // Constructor for class Person without any parameters
    public Person() {
        this.name = "Anonymous";
        this.age = (int) (Math.random() * 100 + 1);
        this.university = "Unknown University";
    }

    // Constructor for class Person with parameters
    public Person(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    // Setter Method for name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Setter Method for age attribute
    public void setAge(int age) {
        this.age = age;
    }

    // Setter Method for university attribute
    public void setUniversity(String university) {
        this.university = university;
    }

    // Getter Method for name attribute
    public String getName() {
        return this.name;
    }

    // Getter Method for age attribute
    public int getAge() {
        return this.age;
    }

    // Getter Method for university attribute
    public String getUniversity() {
        return this.university;
    }

    // Display Method
    public void display() {
        System.out.println("Hey there, I'm " + this.getName());
        System.out.println("I'm " + this.getAge() + " years old.");
        System.out.println("I'm an undergraduate student in " + this.getUniversity());
    }
}

// Inheritance
class LaboratoryAssistant extends Person {
    // Attribute Encapsulation
    private String workPlace;
    private int teachingExperience;
    private int numberOfClasses;

    // Constructor
    public LaboratoryAssistant(String name, int age, String university, String workPlace, int teachingExperience, int numberOfClasses) {
        super(name, age, university);
        this.workPlace = workPlace;
        this.teachingExperience = teachingExperience;
        this.numberOfClasses = numberOfClasses;
    }

    // Setter Method for workPlace
    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    // Setter Method for teachingExperience
    public void setTeachingExperience(int teachingExperience) {
        this.teachingExperience = teachingExperience;
    }

    // Setter Method for numberOfClasses
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    // Getter Method for workPlace
    public String getWorkPlace() {
        return this.workPlace;
    }

    // Getter Method for teachingExperience
    public int getTeachingExperience() {
        return this.teachingExperience;
    }

    // Getter Method for numberOfClasses
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    // Method Overriding for display method
    @Override
    public void display() {
        System.out.println("Greetings, I am " + this.getName() + ", currently serving as a laboratory assistant at the " + this.getWorkPlace() + ".");
        System.out.print("Over the course of " + this.getTeachingExperience() + " semesters, ");
        System.out.println("I have undertaken the role of an educator, imparting knowledge to a total of " + this.getNumberOfClasses() + " classes within the institution.");
    }
}