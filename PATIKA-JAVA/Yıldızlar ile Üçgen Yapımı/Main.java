import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz :");

        n = input.nextInt();

        for (int i = 0; i <= n; i++){

            for (int j = 0; j < n-i; j++ ){
                System.out.print(" ");
            }
            for (int k = 0; k <= (2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int m = (n-1); m >= 1; m--){
            for (int x = 0; x <= n-m;x++){
                System.out.print(" ");
            }
            for (int t = (2*m)-1; t > 1; t--){
                System.out.print("*");
            }
            System.out.println("*");
        }



    }
}
