package ObjectStructure;

public class Stok {
    private int id;
    String adi;
    String aciklama;
    double fiyat;
    int stokMiktari;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getKod() {
        return this.adi.substring(0, 1)+id;
    }
}
