package Soal1;

public class Main {
    public static void main(String[] args) {
        Person non = new Person();
        non.display();

        System.out.println();

        Person Frederick = new Person("Frederick Godiva", 20, "Universitas Sumatera Utara");
        Frederick.display();

        System.out.println();

        LaboratoryAssistant FG = new LaboratoryAssistant("Frederick Godiva", 20, "Universitas Sumatera Utara", "IKLC", 2, 3);
        FG.display();
    }
}