package Polymorphysim.Shapes;

public abstract class Shape {

    private double alan, hacim;
    private String name;

    public Shape(String name) {
        this.name=name;
        System.out.println("Shape created for " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan_hesap();

    public abstract double cevre_hesap();

}
