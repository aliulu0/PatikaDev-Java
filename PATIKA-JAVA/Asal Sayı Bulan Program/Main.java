import java.util.Scanner;
public class Main {
    static void asalMi(int x){
        int sayac = 0;
        for (int i = 2; i <= x; i++){
            if (x % i == 0){
                sayac++;
            }
        }
        if (sayac == 1){
            System.out.println(x+" sayısı ASALDIR.  ");
        }
        else {
            System.out.println(x+" sayısı ASAL değildir.");;
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int x = scan.nextInt();
        asalMi(x);



    }
}
