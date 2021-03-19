package Chuong5;

import java.util.Scanner;

public class MatKhau {
    public static void passwordValidator(String pw) {
        char a[] = new char[pw.length()];
        int dem1 = 0, dem2 = 0,dem3=0;
        for (int i = 0; i < pw.length(); i++) {
            a[i] = pw.charAt(i);
        }
        if (pw.length() < 8) {
            for (int i = 0; i <pw.length(); i++) {
                if (a[i] >= 48 && a[i] <= 57) {
                    dem1++;
                    if (dem1 == pw.length()) System.out.println("mật khẩu " + pw + " là mật khẩu rất yếu.");
                } else if (a[i] >= 97 && a[i] <= 122) {
                    dem2++;
                    if (dem2 == a.length) System.out.println("mật khẩu " + pw + " là mật khẩu yếu.");
                }
            }
        } else {
            for (int i = 0; i < pw.length(); i++) {
                if (a[i] >= 48 && a[i] <= 57) {
                    dem1++;
                } else if (a[i] >= 97 && a[i] <= 122) {
                    dem2++;
                }
                else if((a[i]>=33&&a[i]<=47)||(a[i]>=58&&a[i]<=64)) {dem3++;}

            }
            if (dem1 != 0 && dem2 != 0 && dem3==0) System.out.println("mật khẩu " + pw + " là mật khẩu an toàn.");
 else if(dem1 != 0 && dem2 != 0 && dem3!=0)        System.out.println("mật khẩu " + pw + " là mật khẩu rất an toàn.");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập password: ");
        String pw=sc.next();
        passwordValidator(pw);
    }
}

