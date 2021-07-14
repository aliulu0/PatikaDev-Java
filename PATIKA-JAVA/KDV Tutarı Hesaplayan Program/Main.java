import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double tutar,kdvORan,kdvTutar,kdvLiTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret tutarı giriniz: ");
        tutar = input.nextDouble();

        kdvORan = tutar > 0 && tutar < 1000 ? 0.18 : 0.08;
        kdvTutar = tutar * kdvORan;
        kdvLiTutar = tutar + kdvTutar;


        System.out.println("KDV'siz tutar : "+tutar);
        System.out.println("KDV Oranı : "+kdvORan);
        System.out.println("KDV'li tutar : "+kdvLiTutar);
        System.out.println("KDV tutar : "+kdvTutar);


    }
}
