package Inheritence.OgrenciGectiKaldi;

public class OgrenciTemplate {

    private OgrenimDurumu ogrDurum;
    private int notlarToplami = 0;
    private int notSayisi = 0;
    private float baraj = 0;
    public float ortalama = 0;

    public float getBaraj() {
        return baraj;
    }

    public OgrenimDurumu getOgrenimDurum() {
        return ogrDurum;
    }

    public int getNotlarToplami() {
        return notlarToplami;
    }

    public OgrenciTemplate(OgrenimDurumu ogrDurum, float baraj, int[] notlar) {
        this.ogrDurum = ogrDurum;
        for (int i : notlar) {
            notlarToplami += i;
        }
        notSayisi = notlar.length;
        this.baraj = baraj;
    }

    public void Notlandir() {
        System.out.println("Baraj :\t" + getBaraj());
        System.out.println(getNotlarToplami() + "/" + notSayisi + " :\t" + (float) (getNotlarToplami() / notSayisi));
        System.out.print("Durum :\t");
        if (KaldiGecti()) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }
        ortalama = (float) (getNotlarToplami() / notSayisi);
    }

    public enum OgrenimDurumu {
        OnLisans,
        Lisans,
        Yüksek_Lisans,
        Mezun
    }
    protected void AccessAbilityTest(){
        System.out.println("Protected method");
    }


    protected boolean KaldiGecti(){
        return ((float) (getNotlarToplami() / notSayisi) >= getBaraj());
    }


}
