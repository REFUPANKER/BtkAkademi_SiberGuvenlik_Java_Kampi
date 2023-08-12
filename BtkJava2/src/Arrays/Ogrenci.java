package Arrays;

import java.util.Scanner;

public class Ogrenci {
    /*
    isim
    cinsiyet
    mezunmu
    yas
     */

    public String name;
    public String gender;
    public boolean graduated;
    public int age;

    public Ogrenci(String name, String gender, boolean graduated, int age) {
        this.name = name;
        this.gender = gender;
        this.graduated = graduated;
        this.age = age;
    }

    public Ogrenci() {
    }

    public void ShowData() {
        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age);
        System.out.println("Graduated :" + graduated);
    }

    public static Ogrenci CreateOgrenci() {
        Scanner sc1 = new Scanner(System.in);

        Ogrenci yeniOgrenci = new Ogrenci();

        System.out.print("Ogrenci Adi :");
        yeniOgrenci.name = sc1.nextLine();


        System.out.print("Ogrenci yaşı :");
        yeniOgrenci.age = Integer.parseInt(sc1.nextLine());


        System.out.print("Ogrenci Cinsiyeti :");
        yeniOgrenci.gender = sc1.nextLine();

        System.out.print("Ogrenci Mezun mu {y,n / e,h / t,f}:");

        String yesNo = (sc1.nextLine() + "").toLowerCase();

        if (yesNo.startsWith("y") || yesNo.startsWith("e") || yesNo.startsWith("t")) {
            yeniOgrenci.graduated = true;
        } else {
            yeniOgrenci.graduated = false;
        }

        return yeniOgrenci;
    }
}
