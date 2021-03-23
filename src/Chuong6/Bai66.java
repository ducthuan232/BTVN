package Chuong6;

import java.util.Scanner;

public class Bai66 {
    public static void TestX(String X, String Language) {

        int l = 0;
        int x = X.charAt(0), i = 0;
        if (x >= 48 && x <= 57) {
            i = 1;
        } else if ((x >= 65 && x <= 90) || x >= 97 && x <= 122) {
            i = 2;
        } else {
            i = 3;
        }
        switch (Language) {
            case "Vietnamese":
                switch (i) {
                    case 1:
                        System.out.println("đây là kí tự số");
                        break;
                    case 2:
                        System.out.println("đây là kí tự chữ");
                        break;
                    case 3:
                        System.out.println("đây là kí tự đặc biệt");
                        break;
                }
                break;
            case "English":
                switch (i) {
                    case 1:
                        System.out.println("this is a number");
                        break;
                    case 2:
                        System.out.println("this is a character");
                        break;
                    case 3:
                        System.out.println("this is a special character");
                        break;
                }
                break;
            case "French":
                switch (i) {
                    case 1:
                        System.out.println("c'est un nombre ");
                        break;
                    case 2:
                        System.out.println("c'est un personnage ");
                        break;
                    case 3:
                        System.out.println("C'est un personnage spécial ");
                        break;
                }
                break;
        }
    }
    public static void Thutrongtuan(int so,String Language){
        if(so>=1&&so<=7){
        int l=0;
        String thu="";
        if(Language.equalsIgnoreCase("vietnam")){l=1;}
        else if(Language.equalsIgnoreCase("English")){l=2;}
        else if(Language.equalsIgnoreCase("French")){l=3;}
    switch (l){
        case 1:
            if(so==1){thu="thứ 2";}
            else if(so==2){thu="thứ 3";}
            else if(so==3){thu="thứ tư";}
            else if(so==4){thu="thứ 5";}
            else if(so==5){thu="thứ 6";}
            else if(so==6){thu="thứ 7";}
            else if(so==7){thu="chủ nhật";}break;
        case 2:
            if(so==1){thu="Monday";}
            else if(so==2){thu="Tuesday";}
            else if(so==3){thu="Wdnesday";}
            else if(so==4){thu="Thursday";}
            else if(so==5){thu="Friday";}
            else if(so==6){thu="Saturday";}
            else if(so==7){thu="Sunday";}break;
        case 3:
            if(so==1){thu="Lundi";}
        else if(so==2){thu="Mardi 3";}
        else if(so==3){thu="Mercredi";}
        else if(so==4){thu="Jeudi";}
        else if(so==5){thu="Vendredi";}
        else if(so==6){thu="Samedi";}
        else if(so==7){thu="Dimache";}break;

        }
        System.out.print(thu);}
        else{System.out.println("vui lòng nhập số hợp lệ");}
    }
    public static void Thang(int so,String Language){
        if(so>=1&&so<=12){
            int l=0;
            String thang="";
            if(Language.equalsIgnoreCase("vietnam")){l=1;}
            else if(Language.equalsIgnoreCase("English")){l=2;}
            else if(Language.equalsIgnoreCase("French")){l=3;}
            switch (l){
                case 1:
                    thang="tháng"+so;

                case 2:
                    if(so==2){thang="January";}
                    else if(so==2){thang="February";}
                    else if(so==3){thang="March";}
                    else if(so==4){thang="April";}
                    else if(so==5){thang="May";}
                    else if(so==6){thang="June";}
                    else if(so==7){thang="July";}
                    else if(so==8){thang="August";}
                    else if(so==9){thang="September";}
                    else if(so==10){thang="October";}
                    else if(so==11){thang="November";}
                    else if(so==12){thang="December";}break;

                case 3:
                    if(so==3){thang="Janvier";}
                    else if(so==2){thang="février ";}
                    else if(so==3){thang="Mars";}
                    else if(so==4){thang="Avril";}
                    else if(so==5){thang="Peut";}
                    else if(so==6){thang="Juin";}
                    else if(so==7){thang="Juillet";}
                    else if(so==8){thang="août";}
                    else if(so==9){thang="septembre";}
                    else if(so==10){thang="octobre";}
                    else if(so==11){thang="novembre";}
                    else if(so==12){thang="décembre";}break;
            }
            System.out.print(thang);}
        else{System.out.println("vui lòng nhập số hợp lệ");}}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("nhập kí tự");
      String x=sc.next();
        System.out.println("nhập số quy về ngày ");
        int so=sc.nextInt();
        System.out.println("nhập số quy về tháng");
        int sothang=sc.nextInt();
        System.out.println("nhập ngôn ngữ ");
        String Language=sc.next();
        TestX(x,Language);
        Thutrongtuan(so,Language);
        System.out.println();
        Thang(sothang,Language);


    }
}

