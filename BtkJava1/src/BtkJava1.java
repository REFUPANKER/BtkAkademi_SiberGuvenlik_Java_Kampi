import AccessModifiers.MezunOgrenci.Mezun;
import Inheritence.OgrenciGectiKaldi.Ogrenci;
import Inheritence.OgrenciGectiKaldi.OgrenciTemplate;

public class BtkJava1 {
    public static void main(String[] args) {
        //Ogrenci_Inheritence();
        Mezun mezun1 = new Mezun(OgrenciTemplate.OgrenimDurumu.Mezun, 0, new int[]{0});
        Ogrenci ogrenci1 = new Ogrenci(OgrenciTemplate.OgrenimDurumu.Lisans, 0, new int[]{0});
    }

    private static void Ogrenci_Inheritence() {
        System.out.println("======================");
        Ogrenci ogr1 = new Ogrenci(OgrenciTemplate.OgrenimDurumu.Lisans,
                60,
                new int[]{40, 60, 20});
        ogr1.Notlandir();
        System.out.println("======================");
        Ogrenci ogr2 = new Ogrenci(OgrenciTemplate.OgrenimDurumu.Yüksek_Lisans,
                50,
                new int[]{50, 70, 80});
        ogr2.Notlandir();
        System.out.println("======================");
    }

}
