package Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        long[] dizi = new long[100];
        int elemanSayisi = 0;
        int j;
        long searchKey;
//----------------------------------------------------ekleme
        dizi[0] = 77;
        dizi[1] = 99;
        dizi[2] = 44;
        dizi[3] = 55;
        dizi[4] = 22;
        dizi[5] = 88;
        dizi[6] = 11;
        dizi[7] = 01;
        dizi[8] = 66;
        dizi[9] = 33;
        elemanSayisi = 10;
//----------------------------------------------------yazdırma
        for (j = 0; j < elemanSayisi; j++)
            System.out.print(dizi[j] + " ");
        System.out.println("");
//----------------------------------------------------arama ve silme
        searchKey = 66;
        for (j = 0; j < elemanSayisi; j++)
            if (dizi[j] == searchKey)
                break;
        for (int k = j; k < elemanSayisi; k++)
            dizi[k] = dizi[k + 1];
        elemanSayisi--;
//----------------------------------------------------
        for (j=0; j<elemanSayisi;j++)
            System.out.print(dizi[j]+ " ");
        System.out.println("");
        System.out.println(dizi.length);
    }
}
