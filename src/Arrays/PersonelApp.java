package Arrays;

public class PersonelApp {
    public static void main(String[] args) {
        int maxSize = 100;
        PersonelHareket dizi=new PersonelHareket(maxSize);

        dizi.insert("Ali","Güven",24);
        dizi.insert("Semih","Liman",37);
        dizi.insert("Ahmet","Tam",43);
        dizi.insert("Mert","Ocak",55);
        dizi.insert("Mehmet","Aydın",18);
        dizi.insert("Emre","Delibaş",38);
        dizi.insert("Kadir","Tozlu",72);
        dizi.insert("Leman","Liman",55);
        dizi.insert("Ayşe","Kuş",25);
        dizi.insert("Fatma","Tamer",29);
        dizi.display();
        System.out.println("");

        dizi.insertionSort();
        dizi.display();
        System.out.println("");

         String search="Delibaş";
        Personel found = dizi.find(search);
        if (found!=null){
            System.out.print("Bulundu");
            found.displayPersonel();
        }
        else System.out.print(search + "Bulunamadı...");

        System.out.println("Ocak, Tozlu ve Kuş Siliniyor...");
        dizi.delete("Ocak");
        dizi.delete("Tozlu");
        dizi.delete("Kuş");
        dizi.display();
    }
}
