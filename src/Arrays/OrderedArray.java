package Arrays;

public class OrderedArray {
    private long[] dizi;
    private int elemanSayisi;

    public OrderedArray(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public int size() {
        return elemanSayisi;
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < elemanSayisi; j++)
            if (dizi[j] > value)
                break;
        for (int k = elemanSayisi; k > j; k--)
            dizi[k] = dizi[k - 1];
        dizi[j] = value;
        elemanSayisi++;
    }

    public boolean delete(long value) {
        int j = find(value); // önce ara
        if (j == elemanSayisi)
            return false;
        else { //bulundu
            for (int k = j; k < elemanSayisi; k++)
                dizi[k] = dizi[k + 1];
            elemanSayisi--;
            return true;
        }
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = elemanSayisi - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (dizi[curIn]==searchKey)
                return curIn; //Bulundu
            else if (lowerBound>upperBound)
                return curIn; //Bulunamadı
            else{
                if (dizi[curIn]<searchKey)
                    lowerBound = curIn+1; //büyük yarısında
                else
                    upperBound = curIn-1;//küçük yarısında
            }//else
        }//while
    }//find()

    public int recFind(long searchKey, int lowerBound, int upperBound){
        int curIn = (lowerBound + upperBound) / 2;
        if (dizi[curIn] == searchKey)
            return curIn;
        else if (lowerBound > upperBound)
            return elemanSayisi;
        else {
            if (dizi[curIn] < searchKey)
                return recFind(searchKey,curIn+1, upperBound);
            else
                return recFind(searchKey, lowerBound, curIn-1);
        }
    }

    public int find2(int searchKey){
        return recFind(searchKey, 0, elemanSayisi-1);
    }

    public  void display(){
        for (int j=0;j<elemanSayisi;j++)
            System.out.print(dizi[j]+" ");
        System.out.println("");
    }
}
