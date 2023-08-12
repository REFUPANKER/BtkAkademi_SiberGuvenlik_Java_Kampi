package AccessModifiers.MezunOgrenci;

import Inheritence.OgrenciGectiKaldi.OgrenciTemplate;

public class Mezun extends OgrenciTemplate {
    public Mezun(OgrenimDurumu ogrDurum, float baraj, int[] notlar) {
        super(ogrDurum, baraj, notlar);
    }

    @Override
    public void Notlandir() {
        System.out.println(">-------------------<");
        System.out.println("Mezun öğrencinin not ortalaması");
        if (KaldiGecti()){
            System.out.println("Geçmiş");
        }else{
            System.out.println("Kalmış");
        }
        System.out.println(">-------------------<");
    }
}