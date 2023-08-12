package JavaOOP;

import JavaOOP.NestedStructure.Circle.CircleCalc;
import JavaOOP.NestedStructure.F1Race.F1race;

public class JavaOOP {
    private int x = 0;

    public JavaOOP() {
        Run();
    }

    public static void main(String[] args) {
        Run();
    }

    private static void Run() {
        //RunM1();
        F1race f1race=new F1race();
    }

    private static void RunM1() {
        double value = 4;
        CircleCalc c1 = new CircleCalc(value);
        System.out.println(c1.alan() + " / " + CircleCalc.alan(value+2));
        System.out.println(c1.cevre() + " / " + CircleCalc.cevre(value+2));
    }

    public JavaOOP(int x) {
        System.out.println(x);
        this.x = x;
        System.out.println(x);
    }

    public void M1() {
        System.out.println("its regular M1");
    }

    public void M1(Object... nullable) {
        System.out.println("its overloaded M1");
    }

    private class nestedClass extends JavaOOP {
        @Override
        public void M1() {
            System.out.println("its overrided M1");
        }
    }
}
