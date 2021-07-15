import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int matematik,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        matematik = matematik > 0 && matematik <=100 ? matematik : 0 ;
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        if ((matematik>0 && matematik< 100) &&
                (fizik>0 && fizik < 100) &&
                (turkce>0 && turkce< 100)&&
                (kimya>0 && kimya< 100)&&
                (muzik>0 && muzik< 100)){

            double avarage = (matematik+fizik+turkce+kimya+muzik) / 5.0;
            System.out.println("Ortalamanız : "+ avarage);

            if (avarage <= 55){
                System.out.println("Sınıfta kaldınız seneye görüşmek üzere");
            }
            else {
                System.out.println("Tebrikler sınıf geçtiniz");
            }

        }
        else{
            System.out.println("Geçerli bir not giriniz");
        }


    }
}
