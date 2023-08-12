package JavaOOP.NestedStructure.Circle;

public class CircleCalc {
    double radius = 1;

    public CircleCalc(double radius) {
        this.radius = radius;
    }

    public double cap() {
        return radius * 2;
    }

    public double cevre() {
        return (radius * 2) * Math.PI;
    }

    public double alan() {
        return Math.pow(radius, 2) * Math.PI;
    }


    //          Statics


    public static double cap(double yaricap) {
        return yaricap * 2;
    }

    public static double cevre(double yariCap) {
        return (yariCap * 2) * Math.PI;
    }

    public static double alan(double yariCap) {
        return Math.pow(yariCap, 2) * Math.PI;
    }

}
