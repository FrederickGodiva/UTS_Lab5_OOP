package Soal4;

/*
 *
 * Torsi merupakan gaya yang menyebabkan sebuah benda berputar pada sebuah sumbu tertentu.
 *      Rumus Torsi : T = r x F x sin(ɵ)
 *                    T : Torsi (Nm)
 *                    r : jarak dari titik rotasi ke titik gaya berasal (m)
 *                    F : gaya yang diberikan (N)
 *                    ɵ : sudut antara vektor gaya dan vektor distance (radian)
 *
 * Jika gaya diaplikasikan tegak lurus terhadap benda, maka rumusnya dapat disederhanakan menjadi:
 *          T = r x F x sin(90)
 *          T = r x F
 *
 */

import java.lang.Math;

class Torque {
    private double force;
    private double distance;
    private double angle;
    private double result;

    public Torque(double force, double distance) {
        this.force = force;
        this.distance = distance;
        this.calculateTorque(force, distance);
    }

    public Torque(double force, double distance, double angle) {
        this.force = force;
        this.distance = distance;
        this.angle = angle;
        this.calculateTorque(force, distance, angle);
    }

    public double getForce() {
        return this.force;
    }

    public double getDistance() {
        return this.distance;
    }

    public double getAngle() {
        return this.angle;
    }

    public void calculateTorque(double force, double distance) {
        this.result = force * distance;
    }

    public void calculateTorque(double force, double distance, double angle) {
        this.result =  force * distance * Math.sin(Math.toRadians(angle));
    }

    public double getResult() {
        return this.result;
    }
}
