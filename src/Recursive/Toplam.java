package Recursive;

import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int sonuc = toplam2(sayi);
        System.out.println("Toplam= " + sonuc);
        input.close();
    }

    public static int toplam(int n) {
        if (n == 1)
            return 1;
        else
            return (n + toplam(n - 1));
    }

    public static int toplam2(int n) {
        System.out.println("Giriş: n=" + n);
        if (n == 1) {
            System.out.println("Dönüş 1");
            return 1;
        } else {
            int temp = n + toplam2(n - 1);
            System.out.println("Dönüş: " + temp);
            return temp;
        }
    }
}
