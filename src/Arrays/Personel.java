package Arrays;

public class Personel {
    private String soyadi;
    private String adi;
    private int yasi;

    public Personel(String ad, String soyad, int yas) {
        soyadi = soyad;
        adi = ad;
        yasi = yas;
    }

    public void displayPersonel(){
        System.out.print("Ad: "+adi);
        System.out.print(", Soyad:"+soyadi);
        System.out.println(", Yaş:" +yasi);
    }

    public String getSoyad(){
        return soyadi;
    }
    public String getAdi() { return adi;}

}
