import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi,toplam = 0,sayaç = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        if (sayi > 0){
            for (int i = 1;i <= sayi ; i++){
                if (i % 12 == 0){
                    toplam += i;
                    sayaç++;
                }
            }
            ortalama = toplam / sayaç;
            System.out.println("Girilen sayıya kadar olan sayılardan 3'e ve 4'e kalansız bölünenlerin ortalaması : "+ortalama);
        }
        else {
            System.out.println("Pozitif sayı giriniz");
        }





    }
}
