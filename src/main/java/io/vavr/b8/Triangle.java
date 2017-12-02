package io.vavr.b8;

public class Triangle {

    private Double a;
    private Double b;
    private Double c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double a() {
        return a;
    }

    public Double b() {
        return b;
    }

    public Double c() {
        return c;
    }

    public Double circumference() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle(" + a + "," + b + "," + c + ")";
    }
}
