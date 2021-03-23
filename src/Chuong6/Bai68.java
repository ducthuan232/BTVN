package Chuong6;

import java.util.Scanner;

public class Bai68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giá trị: ");
        int n = sc.nextInt();
        double a[] = new double[n];
        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextDouble();
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) {
                count1++;
            }
            if (a[i] == a[i + 1]) {
                count2++;
            }
        }


        if (count2 == n) {
            System.out.print("tất cả các phần tử bằng nhau");
        } else if (count1 == n) {
            System.out.print("các phần tử được sắp xếp tăng dần");
        } else {
            System.out.print("\nhàm không được sắp xếp tăng dần\nsắp xếp lại thứ tự là ");

            double temp=0;
            for (int i = 0;i<n;i++){
                for (int j =i+1;j<n;j++){
                    if (a[i]>a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
                System.out.print(" "+a[i]);
            }


        }
    }
}
