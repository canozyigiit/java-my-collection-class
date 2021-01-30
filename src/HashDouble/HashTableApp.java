package HashDouble;

import java.util.Scanner;

public class HashTableApp {
    public static void main(String[] args) {
        DataItem aDataItem;
        int key, size, n, keysPerCell;

        System.out.print("Hash Table boyutunu giriniz:");
        size = getInt();
        System.out.print("Rastgele eklenecek veri miktarını giriniz:");
        n = getInt();
        keysPerCell = 100;

        HashTable theHashTable = new HashTable(size);

        for(int i = 0; i < n; i++){
            key = (int)(Math.random()*keysPerCell+size);
            aDataItem = new DataItem(key);
            theHashTable.insert(aDataItem);
        }

        while(true){
            System.out.print("İşlem Seçiniz:");
            System.out.print("Göster(g), Ekle(e), Bul(b), Sil(s), Kapat(k)");
            int choice = getChar();
            switch(choice){
                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.print("Eklenecek değer:");
                    int value = getInt();
                    aDataItem = new DataItem(value);
                    theHashTable.insert(aDataItem);
                    break;
                case 'b':
                    System.out.print("Arancak değer:");
                    value = getInt();
                    DataItem found = theHashTable.find(value);
                    if (found != null){
                        System.out.print("Bulundu: "+ value);
                        System.out.print("");
                    }
                    else
                        System.out.print("Bulunamadı!..");
                    break;
                case 's':
                    System.out.print("Silinecek değer:");
                    value = getInt();
                    DataItem didDelete = theHashTable.delete(value);
                    if (didDelete!=null)
                        System.out.print("Silindi: "+ value);
                    else
                        System.out.print("Silinemedi!..");
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                default:
                    System.out.println("Hatalı giriş!..");
            }//end switch
        }
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        return s;
    }

    public static char getChar(){
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt(){
        String s =getString();
        return Integer.parseInt(s);
    }
}
