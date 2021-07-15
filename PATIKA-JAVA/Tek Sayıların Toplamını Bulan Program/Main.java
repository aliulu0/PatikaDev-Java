import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi,toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz : ");
            sayi = input.nextInt();
            if(sayi % 4 == 0) {
                toplam+=sayi;
            }
            else{
                break;
            }
        }while(sayi % 2 == 0);
        System.out.println("Tek sayı girene kadar çift ve 4'ün katları olan sayıların toplamı : " +toplam);

    }
}
