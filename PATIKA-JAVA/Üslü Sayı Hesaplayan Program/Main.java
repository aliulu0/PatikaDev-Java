import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int k,n,total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Cevap : "+total);



    }
}
