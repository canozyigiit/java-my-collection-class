package Recursive;

import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        long startTime = System.currentTimeMillis();
        long sonuc = fib(sayi);
        long endTime = System.currentTimeMillis();
        double totalTime = (endTime - startTime) / 1000.0;
        System.out.println(totalTime);

        System.out.println(sayi + ". fibonacci sayısı=" + sonuc);
        input.close();
    }

    public static long fib(int n) {
        long preNumber = 0;
        long prepreNumber;
        long current = 1;

        for (int i = 1; i < n; i++) {
            prepreNumber = preNumber;
            preNumber = current;
            current = preNumber + prepreNumber;
        }
        return current;
    }
}
