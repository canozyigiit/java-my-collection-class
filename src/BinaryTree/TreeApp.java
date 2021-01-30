package BinaryTree;

import java.util.Scanner;

public class TreeApp {
    public static void main(String[] args) {
        Tree theTree = new Tree();

        theTree.insert(50);
        theTree.insert(25);
        theTree.insert(75);
        theTree.insert(12);
        theTree.insert(37);
        theTree.insert(43);
        theTree.insert(30);
        theTree.insert(33);
        theTree.insert(87);
        theTree.insert(93);
        theTree.insert(97);

        theTree.minimum().displayNode();

        while (true){
            System.out.print("İşlem Seçiniz:");
            System.out.print("Göster(g), Ekle(e), Bul(b), Sil(s), Dolaş(d), Kapat(k)");
            int choice = getChar();
            switch(choice){
                case 'g':
                    theTree.displayTree();
                    break;
                case 'e':
                    System.out.print("Eklenecek değer:");
                    long value = getLong();
                    theTree.insert(value);
                    break;
                case 'b':
                    System.out.print("Aranacak değer:");
                    value = getLong();
                    Node found = theTree.find(value);
                    if (found != null){
                        System.out.print("Bulundu: ");
                        found.displayNode();
                        System.out.println("");
                    }
                    else
                        System.out.print("Bulunamadı: ");
                    System.out.println(value);
                    break;
                case 's':
                    System.out.print("Silinecek değer:");
                    value = getLong();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete)
                        System.out.println("Silindi " + value);
                    else
                        System.out.println("Silinemedi");
                    break;
                case 'd':
                    System.out.println("Dolaşma türünü seçiniz pre(1)-In(2)-Post(3):");
                    value = getLong();
                    theTree.traverse((int)value);
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                    break;
                default:
                    System.out.println("Hatalı giriş!..");
            }//switch
        }//while
    }//main

    public static char getChar(){
        String s = getString();
        return s.charAt(0);
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        return s;
    }

    public static long getLong(){
        String s = getString();
        return Long.parseLong(s);
    }
}
