import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner scan = new Scanner(System.in);
        int sayi,max = list[0],min = list[0];
        System.out.println("Dizi : "+Arrays.toString(list));
        Arrays.sort(list);

        System.out.print("Girilen Sayı :");
        sayi = scan.nextInt();


        for(int i : list) {
            if(i<sayi) {
                min=i;
            }
            if(i>sayi) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min );
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max );

    }


}