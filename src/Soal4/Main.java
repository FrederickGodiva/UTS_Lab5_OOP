package Soal4;

public class Main {
    public static void main(String[] args) {
        Torque torsi1 = new Torque(20,0.4);
        System.out.println("Hasil perhitungan Torsi dengan gaya " + torsi1.getForce() + "N dan jarak dari sumbu rotasi ke titik dimana gaya diberikan " + torsi1.getDistance() + "m adalah " + String.format("%.3f", torsi1.getResult()) + "Nm");

        Torque torsi2 = new Torque(25, 0.3,53);
        System.out.println("Hasil perhitungan Torsi dengan gaya " + torsi2.getForce() + "N dan jarak dari sumbu rotasi ke titik dimana gaya diberikan " + torsi2.getDistance() + "m adalah " + String.format("%.3f", torsi2.getResult()) + "Nm");
    }
}
