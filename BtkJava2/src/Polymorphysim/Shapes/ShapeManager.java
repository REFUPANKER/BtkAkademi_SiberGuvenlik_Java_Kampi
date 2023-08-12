package Polymorphysim.Shapes;

public class ShapeManager {
    public ShapeManager() {
        Square square=new Square("Square");
        square.alan_hesap();
        square.cevre_hesap();

        Circle circle=new Circle("Circle");
        circle.alan_hesap();
        circle.cevre_hesap();

    }
}
