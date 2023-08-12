package Inheritence.OgrenciGectiKaldi;

public class Ogrenci extends OgrenciTemplate {

    public Ogrenci(OgrenimDurumu ogrDurum, float baraj, int[] notlar) {
        super(ogrDurum, baraj, notlar);
    }

    @Override
    public void Notlandir() {
        System.out.println(this.getOgrenimDurum() + " Öğrencisinin Ortalaması");
        super.Notlandir();
    }
    public void AccesToProtected(){
        KaldiGecti();
    }
}
