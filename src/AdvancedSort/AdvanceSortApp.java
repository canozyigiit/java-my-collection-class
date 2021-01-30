package AdvancedSort;

public class AdvanceSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySort dizi = new ArraySort(maxSize);

        for (int i = 0; i< 10; i++)
            dizi.insert((int)(java.lang.Math.random()*99));
        dizi.display();
        dizi.mergeSort();
        //dizi.shellSort();
        //dizi.quickSort();

        dizi.display();
    }
}
