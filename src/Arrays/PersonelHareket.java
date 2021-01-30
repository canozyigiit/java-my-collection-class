package Arrays;

public class PersonelHareket {
    private Personel[] dizi;
    private int elemanSayisi;

    public PersonelHareket(int max) {
        dizi = new Personel[max];
        elemanSayisi = 0;
    }

    public Personel find(String soyadAra){
        int i;
        for (i=0;i<elemanSayisi;i++)
            if (dizi[i].getSoyad().equals(soyadAra))
                break;
        if (i==elemanSayisi)
            return null;
        else
            return dizi[i];
    }

    public void insert(String ad, String soyad, int yas){
        dizi[elemanSayisi]= new Personel(ad,soyad,yas);
        elemanSayisi++;
    }

    public boolean delete(String soyadAra){
        int i;
        for (i=0;i<elemanSayisi;i++)
            if (dizi[i].getSoyad().equals(soyadAra))
                break;
        if(i==elemanSayisi)
            return false;
        else
        {
            for(int j=i;j<elemanSayisi;j++)
                dizi[j]=dizi[j+1];
            elemanSayisi--;
            return true;
        }
    }

    public void display(){
        for (int i=0;i<elemanSayisi;i++)
            dizi[i].displayPersonel();
    }

    public void insertionSort() {
        int j, i;
        for (i = 1; i < elemanSayisi; i++) {
            Personel temp = dizi[i];
            j = i;
            while (j > 0 && dizi[j - 1].getSoyad().compareTo(temp.getSoyad()) >= 0 ) {
                dizi[j] = dizi[j - 1];
                --j;
            }
            dizi[j] = temp;
        }
    }
}
