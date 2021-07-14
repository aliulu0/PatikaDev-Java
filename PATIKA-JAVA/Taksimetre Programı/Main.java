import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int km;
        double tutar ,ücret = 2.20,baslangıc = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Kilometre giriniz: ");
        km = input.nextInt();
        tutar = ücret * km;
        tutar += baslangıc;
        tutar = tutar < 20 == true ? tutar = 20 : tutar;

        System.out.println("Tutar: "+tutar+" TL");

    }
}
