package Soal1;

public class Main {
    public static void main(String[] args) {
        // Person Object (without parameters)
        Person non = new Person();
        non.display();  // called display method from Person class

        System.out.println();

        // Person object (with parameters)
        Person Frederick = new Person("Frederick Godiva", 20, "Universitas Sumatera Utara");
        Frederick.display();    // called display method from Person class

        System.out.println();

        // LaboratoryAssistant object
        LaboratoryAssistant FG = new LaboratoryAssistant("Frederick Godiva", 20, "Universitas Sumatera Utara", "IKLC", 2, 3);
        FG.display();    // called display method from LaboratoryAssistant class
    }
}

// Narrative Explanation
/*
 * Within the main method, we instantiate both the Person and the LaboratoryAssistant classes.
 *
 * The Person class encapsulates attributes such as name, age, and university. Moreover, it employs constructor overloading, ensuring that when the class is instantiated, the first method called is the constructor.
 * If the constructor lacks parameters, the name defaults to "Anonymous", the age to a random number, and the university to Unknown University. Conversely, when parameters are provided, the attributes are initialized accordingly.
 * Access modifiers govern attribute access, while Setter and Getter methods manage attribute content, promoting encapsulation.
 * Finally, a display method showcases the information stored within its attributes to the console.
 *
 * The LaboratoryAssistant class extends Person, signifying inheritance of methods and attributes from the Person class.
 * It introduces additional attributes like workPlace, teachingExperience, and numberOfClasses, each with private access modifiers.
 * A constructor, requiring parameters such as name, age, university, workPlace, teachingExperience, and numberOfClasses, efficiently initializes these attributes.
 * Utilizing the super() method, the superclass's constructor handles name, age, and university, allowing seamless integration of the provided parameters into the appropriate attributes.
 * Encapsulation is further emphasized through Setter and Getter methods, facilitating attribute manipulation.
 * Lastly, a display method, although sharing its name with the Person class's method, serves the purpose of presenting the class's attribute information on the console, illustrating method overriding.
 *
 */