package it.euris.pojo;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

}
