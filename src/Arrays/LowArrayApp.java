package Arrays;

public class LowArrayApp {
    public static void main(String[] args){
        LowArray dizi = new LowArray(100);
        int elemanSayisi = 0;
        int j;

        dizi.setElem(0,77);
        dizi.setElem(1,99);
        dizi.setElem(2,44);
        dizi.setElem(3,55);
        dizi.setElem(4,22);
        dizi.setElem(5,88);
        dizi.setElem(6,11);
        dizi.setElem(7,01);
        dizi.setElem(8,66);
        dizi.setElem(9,33);
        elemanSayisi=10;
 //---------------Listele------------------------------
        for (j=0;j<elemanSayisi;j++)
            System.out.print(dizi.getElem(j)+" ");
        System.out.println("");
//---------------Arama-----------------------------------
        int searchKey= 88;
        for (j=0;j<elemanSayisi;j++)
            if (dizi.getElem(j)==searchKey)
                break;
        if (j == elemanSayisi)
            System.out.println("Bulunamadı" + searchKey);
        else
            System.out.println("Bulundu" + searchKey);
//------------Sil----------------------------------------
        for (j=0;j<elemanSayisi;j++)
            if (dizi.getElem(j)==55)
                break;
        for (int k=j;k<elemanSayisi;k++ )
            dizi.setElem(k, dizi.getElem(k+1));
        elemanSayisi--;
//---------------------------------------------------------
        for (j=0;j<elemanSayisi;j++)
            System.out.print(dizi.getElem(j)+" ");
        System.out.println("");
    }
}
