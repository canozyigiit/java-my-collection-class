package Arrays;

public class HighArray {
    private long[] dizi;
    private int elemanSayisi;

    public HighArray(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public boolean find(long searchKey) {
        int i;
        for (i = 0; i < elemanSayisi; i++)
            if (dizi[i] == searchKey)
                break;
        if (i == elemanSayisi)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        dizi[elemanSayisi] = value;
        elemanSayisi++;
    }

    public boolean delete(long value) {
        int i;
        for (i = 0; i < elemanSayisi; i++)
            if (value == dizi[i])
                break;
        if (i == elemanSayisi)
            return false;
        else {
            for (int j = i; j < elemanSayisi; j++)
                dizi[j] = dizi[j + 1];
            elemanSayisi--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < elemanSayisi; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
    }

    public void bubbleSort() {
        for (int i = 0; i < elemanSayisi - 1; i++)
            for (int j = 0; j < elemanSayisi - i - 1; j++)
                if (dizi[j] > dizi[j + 1]) {
                    swap(j, j + 1);
                }
    }

    public void swap(int x, int y) {
        long temp = dizi[x];
        dizi[x] = dizi[y];
        dizi[y] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < elemanSayisi - 1; i++) {
            swap(i, minBul(i));
        }
    }

    public int minBul(int bas) {
        int min = bas;
        for (int j = bas + 1; j < elemanSayisi; j++)
            if (dizi[j] < dizi[min])
                min = j;
        return min;
    }

    public void insertionSort() {
        int j, i;
        for (i = 1; i < elemanSayisi; i++) {
            long temp = dizi[i];
            j = i;
            while (j > 0 && dizi[j - 1] >= temp) {
                dizi[j] = dizi[j - 1];
                --j;
            }
            dizi[j] = temp;
        }
    }

    public long getMax() {
        if (elemanSayisi == 0)
            return -1;
        else {
            long max = dizi[0];
            for (int i = 1; i < elemanSayisi; i++)
                if (dizi[i] > max)
                    max = dizi[i];
            return max;
        }
    }

    public boolean removeMax() {
        if (getMax() == -1) {
            System.out.println("Dizi Boş!");
            return false;
        } else return delete(getMax());
    }

    public void insertionSortBin() {
        int j, i;
        for (i = 1; i < elemanSayisi; i++) {
            long temp = dizi[i];
            int loc = findLocation(dizi[i], i - 1);
            for (j = i; j > loc; j--)
                dizi[j] = dizi[j - 1];
            dizi[loc] = temp;
        }
    }

    public int findLocation(long searchKey, int upper) {
        int lowerBound = 0;
        int upperBound = upper;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (lowerBound > upperBound) {
                if (curIn > upperBound) return curIn;
                else if (lowerBound > curIn) return curIn + 1;
            } else {
                if (dizi[curIn] < searchKey)
                    lowerBound = curIn + 1; //büyük yarısında
                else
                    upperBound = curIn - 1;//küçük yarısında
            }//else
        }//while
    }//find()
}
