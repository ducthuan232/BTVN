package Chuong5;

import java.util.Scanner;
public class Laisuat {
    public static void notifyMonthsUnitPaidOff(double b,double ls,double p){
        double i=ls/365;
        double n=(Math.log10(1+(b/p)*(1-(1-Math.pow(1+i,30)))))/(Math.log10(1+i)*30);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("số dư nợ tín dụng:");
        double b=sc.nextDouble();
        System.out.println("tỉ lệ lãi suất tín dụng theo năm:");
        double ls=sc.nextDouble();
        System.out.println("số tiền có thể thanh toán trong 1 tháng:");
        double p=sc.nextDouble();
        notifyMonthsUnitPaidOff(b,ls,p);
    }

}

