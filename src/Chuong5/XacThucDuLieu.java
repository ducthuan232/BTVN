package Chuong5;

import java.util.Scanner;

public class XacThucDuLieu {
    public static void XacThucDulieu(String tenho, String ten, String MNV, String Zip) {
        int count1 = 0, dem1 = 0, dem2 = 0;
        for (int i = 0; i < Zip.length(); i++) {
            if (Zip.charAt(i) >= 48 && Zip.charAt(i) <= 57) dem2++;
        }

        if (tenho.length() == 1) {
            System.out.println("\"" + tenho + "\" là tên họ không hợp lệ, quá ngắn"); count1++;
        } else if (tenho.length() == 0) {
            System.out.println("Cần phải nhập vào tên họ");count1++;
        }  if (ten.length() == 1) {
            System.out.println("\"" + ten + "\" là tên không hợp lệ, quá ngắn");count1++;
        }  else if (ten.length() == 0) {
            System.out.println("Cần phải nhập vào tên ");count1++;
        }  if (MNV.length() != 7) {count1++;
            System.out.println(MNV + " sai định dạng mã nhân viên");
        } else if (MNV.length() == 7) {
            if (MNV.charAt(0) < 65 || MNV.charAt(0) > 90 || MNV.charAt(1) < 65 || MNV.charAt(1) > 90 || MNV.charAt(2) != 45) {
                System.out.println(MNV + " sai định dạng mã nhân viên");count1++;
            } else {
                for (int i = 3; i <= 6; i++) {
                    if (MNV.charAt(i) >= 48 && MNV.charAt(i) <= 57) dem1++;
                }
                if (dem1 != 4) {count1++;
                    System.out.println(MNV + " sai định dạng mã nhân viên");
                }
            }
        }
          if (dem2 != Zip.length()) {
            System.out.println(Zip + " sai định dạng mã ZIP");count1++;
        }
        if(count1==0){System.out.println("Dữ liệu chuẩn");};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên họ: ");
        String tenho = sc.next();
        System.out.println("Nhập vào tên : ");
        String ten = sc.next();
        System.out.println("Nhập vào Mã nhân viên: ");
        String MNV = sc.next();
        System.out.println("Nhập vào mã Zip: ");
        String Zip = sc.next();
        XacThucDulieu(tenho, ten, MNV, Zip);
    }

}


