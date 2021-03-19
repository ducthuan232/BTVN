package Chuong6;
import java.util.Scanner;
public class Bai62 {

    public static void KiemTraTuoiLaiXe(String quocgia, int tuoi) {
        if (tuoi <= 0) {
            System.out.println("yêu cầu nhập tuổi hợp lệ");
        } else {
            switch (quocgia) {
                case "VietNam":
                    if (tuoi >= 18) {
                        System.out.println("được phép lái xe.");
                    } else {
                        System.out.println("không được phép lái xe.");
                    }
                    break;
                case "Mexico":
                    if (tuoi >= 18) {
                        System.out.println("được phép lái xe.");
                    } else {
                        System.out.println("không được phép lái xe.");
                    }

                    break;
                case "Anh":
                    if (tuoi >= 17) {
                        System.out.println("được phép lái xe.");
                    } else {
                        System.out.println("không được phép lái xe.");
                    }
                    break;
                case "Pháp":
                    if (tuoi >= 16) {
                        System.out.println("được phép lái xe.");
                    } else {
                        System.out.println("không được phép lái xe.");
                    }
                    break;
                case "Úc":
                    if (tuoi >= 16) {
                        System.out.println("được phép lái xe.");
                    } else {
                        System.out.println("không được phép lái xe.");
                    }
                    break;

            }
        }
    }
    public static void NoiDuocLaiXe(int tuoi){
    int a[]=new int[3]; String b[]=new String[3];
      a[0]=16; b[0]="Pháp \nÚc";
      a[1]=17; b[1]="Anh";
      a[2]=18;  b[2]="VietNam \nMexico";
     System.out.println("những nơi bạn có thể lái xe:");
      for(int i=0;i<=2;i++){
          if(tuoi>=a[i]){System.out.println(b[i]);}
      }
     }
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập quốc gia:");
        String quocgia= sc.next();
        System.out.println("Nhập tuổi:");
        int tuoi=sc.nextInt();
    KiemTraTuoiLaiXe(quocgia,tuoi);
    NoiDuocLaiXe(tuoi);


}

}
