import JavaOOP.JavaOOP;

import java.util.Scanner;

public class App {
    private static void cwl(Object msg) {
        System.out.println(msg);
    }

    private static void cw(Object msg) {
        System.out.print(msg);
    }

    public static void main(String[] args) throws Exception {
        /*
        M1();
        M2();
        M3();
        M4();
        M5();
        M6();
        M7();
         */
        JavaOOP javaOop=new JavaOOP();
    }

    private static void M7() {
        cwl(fonk1(5, 5));
    }

    private static double fonk1(int x, int n) {
        // f(x,n)=1+ pow(x,index)/factorial(i)
        double result = 1;
        for (int i = 0; i < n; i++) {
            result += Math.pow(x, i) / factorial(i);
        }
        return result;
    }

    private static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    private static void M6() {
        cwl(egimBul(3, 5, 7, 10));
        Scanner sc1 = new Scanner(System.in);
        cwl("Eğim :" + egimBul(
                new double[]{
                        sc1.nextDouble(),
                        sc1.nextDouble(),
                        sc1.nextDouble(),
                        sc1.nextDouble()
                }));
    }

    /**
     * 0 : x1 <br>
     * 1 : y1 <br>
     * 2 : x2 <br>
     * 3 : y2
     */
    private static double egimBul(double[] points) {
        return (points[3] - points[1]) / (points[2] - points[0]);
    }

    private static double egimBul(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }


    private static void M5() {
        Scanner sc1 = new Scanner(System.in);
        cw("Menu seç : ");
        int selection = sc1.nextInt();
        switch (selection) {
            case 1 -> System.out.println("Birinci menü seçildi");
            case 2 -> cwl("İkinci menü seçildi");
            case 3 -> cwl("Üçüncü menü seçildi");
            case 4 -> cwl("Dördüncü menü seçildi");
            default -> cwl("Hiç bir menü seçilmedi");
        }
        sc1.close();
    }

    private static void M4() {
        double x, y;
        Scanner sc1 = new Scanner(System.in);
        cw("X :");
        x = sc1.nextDouble();
        cw("Y :");
        y = sc1.nextDouble();
        int bolge = 0;
        if (x == 0 && y == 0) {
            cwl("Nokta Merkezde");
        } else if (x > 0 && y > 0) {
            bolge = 1;
        } else if (x < 0 && y > 0) {
            bolge = 2;
        } else if (x < 0 && y < 0) {
            bolge = 3;
        } else if (x > 0 && y < 0) {
            bolge = 4;
        }
        if (x != 0 && y != 0) {
            cwl("Nokta " + bolge + ". Bolgede");
        }
        sc1.close();
    }

    private static void M3() {
        Scanner sc1 = new Scanner(System.in);

        cw("Ders Adı :");
        String dersAdi = sc1.nextLine();

        cw("Vize Notu :");
        int vizeNotu = sc1.nextInt();

        cw("Final Notu :");
        int finalNotu = sc1.nextInt();

        cwl("Ders :" + dersAdi + "\nVize %40 Final %60\nOrtalama :" +
                ((float) (vizeNotu * 0.4) + (float) (finalNotu * 0.6)));

        sc1.close();
    }

    private static void M2() {
        int ts1 = 3, ts2 = 5;
        cwl("Tam sayı 1:" + ts1 + " , Tam sayı 2:" + ts2);
        cwl("Tam sayı 1:" + ts1 + " + Tam sayı 2:" + ts2 + " = " + (ts1 + ts2));
        cwl("Tam sayı 1:" + ts1 + " - Tam sayı 2:" + ts2 + " = " + (ts1 - ts2));
        cwl("Tam sayı 1:" + ts1 + " * Tam sayı 2:" + ts2 + " = " + (ts1 * ts2));
        cwl("Tam sayı 1:" + ts1 + " / Tam sayı 2:" + ts2 + " = " + (ts1 / ts2));
        cwl("Tam sayı 1:" + ts1 + " % Tam sayı 2:" + ts2 + " = " + (ts1 % ts2));
    }

    private static void M1() {
        String title = "Btk Akademi";
        cwl(title + "\n" + (title = "Zonguldak Java Eğitim Kampı"));
    }
}