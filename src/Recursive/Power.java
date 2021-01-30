package Recursive;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x^y--> x:");
        int taban= input.nextInt();
        System.out.print("x^y--> y:");
        int us= input.nextInt();

        int sonuc = usAlma(taban,us);
        System.out.println(taban+"^"+us+"= "+ sonuc);
        input.close();
    }

    public static int usAlma(int taban, int us) {
        if (us==0)
            return 1;
        else return (taban * usAlma(taban,us-1));
    }
}
