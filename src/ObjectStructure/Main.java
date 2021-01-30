package ObjectStructure;

public class Main {
    public static void main(String[] args) {
        Stok stok = new Stok();
        stok.setId(1);
        stok.adi = "Bilgisayar";
        stok.aciklama = "Masaüstü";
        stok.fiyat = 1000;
        stok.stokMiktari = 10;
        System.out.println(stok.adi);

        StokYonetim stokYonetim = new StokYonetim();

        System.out.println(stok.getKod());
        stokYonetim.stokEkle(stok);
    }
}
