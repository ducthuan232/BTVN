package Chuong6;

import java.util.Scanner;

public class Bai61 {
    public static void Users(String User,String password){
        if(User.equals("Thuận")){if(password.equals("thuan2302")){ System.out.println("xin chào!");}
        else{System.out.println("tài khoản hoặc mật khẩu không đúng");}}
        else if(User.equals("Đức")){if(password.equals("duc0402")){ System.out.println("xin chào!");}
        else{System.out.println("tài khoản hoặc mật khẩu không đúng");}}
        else if(User.equals("Hiếu")){if(password.equals("hieu3103")){ System.out.println("xin chào!");}
        else{System.out.println("tài khoản hoặc mật khẩu không đúng");}}
        else if(User.equals("Duy")){if(password.equals("duy0412")){ System.out.println("xin chào!");}
        else{System.out.println("tài khoản hoặc mật khẩu không đúng");}}
        else if(User.equals("Luân")){if(password.equals("luan0503")){ System.out.println("xin chào!");}
        else{System.out.println("tài khoản hoặc mật khẩu không đúng");}}
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("User: ");
        String user=sc.next();
        System.out.println("password: ");
        String password=sc.next();
        Users(user,password);
    }
}
