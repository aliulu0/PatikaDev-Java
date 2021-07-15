import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,r,N = 1,R = 1,kombinasyon,k = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz : ");
        n = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n;i++){
            N *= i;
        }
        for (int i = 1; i <= r;i++){
            R *= i;
        }

        for (int i = 1; i <=(n-r);i++){
            k *= i;
        }

        kombinasyon = N / (R * k);
        System.out.println("Kombinasyon : "+kombinasyon);


    }
}
