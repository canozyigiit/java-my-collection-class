package Arrays;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrderedArray dizi = new OrderedArray(maxSize);

        dizi.insert(77);
        dizi.insert(99);
        dizi.insert(44);
        dizi.insert(55);
        dizi.insert(22);
        dizi.insert(88);
        dizi.insert(11);
        dizi.insert(1);
        dizi.insert(66);
        dizi.insert(33);

        dizi.display();

        int searchKey = 34;

        System.out.println(dizi.find(searchKey) + "yer");

        if (dizi.find(searchKey)!=dizi.size())
            System.out.println(searchKey + " bulundu...");
        else
            System.out.println(searchKey + " bulunamadı");

        dizi.delete(01);
        dizi.delete(55);
        dizi.delete(99);
        dizi.display();
    }
}
