package Chuong6;
import java.util.Scanner;
public class Bai64 {
    public static void ChuyenDonVi(String donvi,double giatri){
        double C=0;

        if(donvi.equals("C")){System.out.println("Giá trị nhiệt độ sau khi chuyển sang độ C: "+(giatri-32)*5/9);}
        else if(donvi.equals("F")){System.out.println("Giá trị nhiệt độ sau khi chuyển sang độ F: "+(giatri*9/5)+32);}
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("bạn muốn chuyển từ đơn vị (F/C) sang (C/F): ");
    String donvi=sc.next();
        System.out.println("nhập giá trị nhiệt độ: ");
        double giatri=sc.nextDouble();
        ChuyenDonVi(donvi,giatri);

}}
