package Arrays;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray dizi = new HighArray(maxSize);
        HighArray sorted = new HighArray(maxSize);

        dizi.insert(77);
        dizi.insert(99);
        dizi.insert(44);
        dizi.insert(55);
        dizi.insert(88);
        dizi.insert(22);
        dizi.insert(1);
        dizi.insert(11);
        dizi.insert(66);
        dizi.insert(33);
        dizi.display();

        while (dizi.getMax()!=-1){
            sorted.insert(dizi.getMax());
            dizi.removeMax();
        }

        System.out.println("1.Dizi:");
        dizi.display();
        System.out.println("2.Dizi:");
        sorted.display();
        dizi = sorted;
        dizi.display();

//        //dizi.bubbleSort();
//        //dizi.selectionSort();
//        //dizi.insertionSort();
//        dizi.insertionSortBin();
//        dizi.display();
//        System.out.println("");
//
//        int searchKey = 35;
//        if (dizi.find(searchKey))
//            System.out.println(searchKey + " Bulundu");
//        else
//            System.out.println(searchKey + " Bulunamadı");
//
//        dizi.delete(00);
//        dizi.delete(66);
//        dizi.delete(99);
//        dizi.display();
    }
}
