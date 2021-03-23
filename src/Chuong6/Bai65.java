package Chuong6;

import java.util.Scanner;

public class Bai65 {
    public static void BMI(String cannang, String donvican, String chieucao, String donvicao) {
        try {
            double weight = Double.parseDouble(cannang);
            double height = Double.parseDouble(chieucao);
            double w = 0, h = 0;
            if (donvican.equalsIgnoreCase("pound")) {
                w = 1;
            } else if (donvican.equalsIgnoreCase("kg")) {
                w = 2.2046;
            }
            if (donvicao.equalsIgnoreCase("inch")) {
                h = 1;
            } else if (donvicao.equalsIgnoreCase("meter")) {
                h = 39.370;
            }
            double BMI = (double) Math.round((weight * w * 703) / (height * height * h * h) * 100) / 100;
            System.out.println("chỉ số BMI: " + BMI);
            if (BMI <= 18.5) {
                System.out.println("Bạn bị thiếu cân");
            } else if (BMI >= 25) {
                System.out.println("Bạn bị thừa cân");
            } else {
                System.out.println("cân nặng bình thường");
            }
        } catch (Exception e) {
            System.out.println("giá trị nhập vào không thỏa mãn");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng : ");
        String cannang = sc.next();
        System.out.println("nhập  đon vị(kg/pound): ");
        String donvican = sc.next();
        System.out.println("nhập  chiều cao:");
        String chieucao = sc.next();
        System.out.println("nhập đơn vị(meter/inch): ");
        String donvicao = sc.next();
        BMI(cannang, donvican, chieucao, donvicao);

    }

}
