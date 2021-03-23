package Chuong6;

import java.util.Scanner;

public class Bai63 {
    public static void NongDoCon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đơn vị của cân nặng:(kg/pound) ");
        String donvi = sc.next();
        System.out.println("Nhập cân nặng theo " + donvi + ":");
        double can = sc.nextDouble();
        double W = 0;
        if (donvi.equals("kg")) {
            W = can * 0.2046;
        } else if (donvi.equals("pound")) {
            W = can;
        }
        ;
        double r = 0;
        System.out.println("Nhập giới tính: ");
        String gioitinh = sc.next();
        if (gioitinh.equals("nam")) {
            r = 0.73;
        } else if (gioitinh.equals("nu")) {
            r = 0.66;
        }
        System.out.println("Nhập số chai và nồng độ của 1 chai: ");
        int sochai = sc.nextInt();
        double ndtheochai = sc.nextDouble();
        double A = sochai * ndtheochai;
        System.out.println("Nhập số giờ kể từ lần uống gần nhất: ");
        double H = sc.nextDouble();
        double BAC = (A * (5.14 / W) * r) - 0.15 * H;
        System.out.println("Nhập quốc gia:");
        String quocgia = sc.next();
        double gioihan = 0;
        if (quocgia.equals("VietNam") || quocgia.equals("Anh")) {
            gioihan = 0.08;
        } else if (quocgia.equals("TrungQuoc") || quocgia.equals("Phap")) {
            gioihan = 0.09;
        } else if (quocgia.equals("My") || quocgia.equals("Uc")) {
            gioihan = 0.07;
        }
        System.out.println("chỉ số BAC: " + BAC);
        if (BAC < gioihan) {
            System.out.println("được phép lái xe");
        } else {
            System.out.println("không được phép lái xe");
        }


    }

    public static void main(String[] args) {
        NongDoCon();
    }

}
