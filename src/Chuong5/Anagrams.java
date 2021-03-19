package Chuong5;

import java.util.Scanner;

public class Anagrams {
    public static void Anagrams(String xau1, String xau2) {
        int dem = 0;
        char empty = 0;
        if (xau1.length() == xau2.length()) {
            char a[] = new char[xau1.length()];
            for (int i = 0; i < xau1.length(); i++) {
                for (int j = i + 1; j < xau1.length(); j++) {
                    if (a[i] < a[j]) {
                        a[i] = empty;
                        a[i] = a[j];
                        a[j] = empty;
                    }
                }
            }

            char empty1 = 0;
            char b[] = new char[xau2.length()];
            for (int i = 0; i < xau2.length(); i++) {
                for (int j = i + 1; j < xau2.length(); j++) {
                    if (b[i] < b[j]) {
                        b[i] = empty1;
                        b[i] = b[j];
                        b[j] = empty1;
                    }
                }
            }
            for (int i = 0; i < xau1.length(); i++) {
                if (b[i] == a[i]) dem++;
            }
            if (dem == xau1.length()) System.out.print(xau1 + " và " + xau2 + " là anagrams.");
            else {
                System.out.print(xau1 + " và " + xau2 + " không phải là anagrams.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ thứ nhất:");
        String xau1 = sc.next();
        System.out.println("Nhập từ thứ hai:");
        String xau2 = sc.next();
        Anagrams(xau1, xau2);
    }
}




