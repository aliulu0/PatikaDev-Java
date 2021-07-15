import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi, i =1, j =1, m =0,n=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        while(m <=sayi) {
            System.out.println("4 nin " + m + "ncı kuvveti " + i);
            i *=4;
            m++;
        }
        System.out.println("---------");
        while(n<=sayi) {

            System.out.println("5 nin " + n + "ncı kuvveti " + j);
            j *=5;
            n++;
        }

    }
}
