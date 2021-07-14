import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlıcan = 5,toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut *= input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        elma *= input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        domates *= input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        muz *= input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlıcan *= input.nextInt();
        toplam = armut + elma + domates + muz + patlıcan;
        System.out.println("Toplam Tutar : "+toplam+" TL");



    }
}
