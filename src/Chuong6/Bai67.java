package Chuong6;

import java.util.Scanner;

public class Bai67 {
    public static void Thue(double tien, String Bang) {
        Scanner sc = new Scanner(System.in);
        double thue = 0;

        if (Bang.equalsIgnoreCase("Wisconsin")) {
            System.out.println("nhập quận của bạn: ");
            String quan = sc.next();
            if (quan.equalsIgnoreCase("Eau Claire")) {
                thue = 0.05;
            } else if (quan.equalsIgnoreCase("Dunn")) {
                thue = 0.04;
            }
        } else if (Bang.equalsIgnoreCase("Illinois")) {
            thue = 0.08;
        } else {
            thue = 0;
        }
        System.out.println("the fax is $" + tien * thue);
        System.out.println("The total is$" + tien * (1 + thue));


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền: ");
        double tien = sc.nextDouble();
        System.out.println("nhập bang");
        String bang = sc.next();
        Thue(tien, bang);
    }
}

