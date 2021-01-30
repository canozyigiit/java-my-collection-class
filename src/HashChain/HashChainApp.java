package HashChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HashChainApp {
    public static void main(String[] args) throws IOException {
        int aKey;
        Link aDataItem;
        int size, n, keysPerCell = 100;
        System.out.print("Hash Table boyutu: ");
        size = getInt();
        System.out.print("Eklenecek rastgelere değer sayısı: ");
        n = getInt();
        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++)
        {
            aKey = (int) (Math.random() * keysPerCell + size);
            theHashTable.insert(aKey);
        }
        while (true)
        {
            System.out.print("İşlem Seçiniz: ");
            System.out.print("Göster (g), Ekle(e), Sil(s), Bul(b): ");
            char choice = getChar();
            switch (choice) {
                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.print("Eklenecek değer: ");
                    aKey = getInt();
                    theHashTable.insert(aKey);
                    break;
                case 's':
                    System.out.print("Silinecek değer: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'b':
                    System.out.print("Arancak değer: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null)
                        System.out.println("Bulundu " + aKey);
                    else
                        System.out.println("Bulunamadı " + aKey);
                    break;
                default:
                    System.out.print("Hatalı giriş...\n");
            }  // end switch
        }  // end while
    }  // end main()

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
