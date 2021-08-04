import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int n = scan.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 1; i <= n; i++){
            System.out.print(i+". Eleman :");
            dizi[i-1] = scan.nextInt();
        }
        Arrays.sort(dizi);
        System.out.print("Sıralama : ");
        for (int i : dizi){
            System.out.print(i+" ");
        }
    }


}