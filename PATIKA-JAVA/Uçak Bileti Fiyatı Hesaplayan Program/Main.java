import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int km,age,select;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        select = input.nextInt();

        if ((age > 0) && ((select == 1) || (select == 2)) && (km > 0) ){
            total = km * 0.1;
            if (age < 12){
                total = total - (total*0.5);
            }
            else if (age >= 12 && age <= 24){
                total = total - (total * 0.1);
            }
            else if (age > 65){
                total = total - (total * 0.3);
            }
            if (select == 2){
                total = (total - (total * 0.2)) * 2;
            }
            System.out.println("Toplam Tutar : "+total);
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }



    }
}
