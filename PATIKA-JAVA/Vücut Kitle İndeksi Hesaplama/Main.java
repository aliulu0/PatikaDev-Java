import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int kg;
        double m,endeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :  ");
        kg = input.nextInt();
        endeks = kg / (m * m);
        System.out.println("Vücut Kitle İndeksiniz : "+endeks);



    }
}
