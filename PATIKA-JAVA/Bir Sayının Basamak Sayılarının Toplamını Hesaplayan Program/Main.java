import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        while (n > 0){
            total += (n % 10);
            //System.out.println(total);
            n = n / 10;
            System.out.println(n);
        }
        System.out.println("Basamaklarındaki sayıların toplama : "+total);
    }
}
