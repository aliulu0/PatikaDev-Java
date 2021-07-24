import java.util.Scanner;
public class Main {
    static int power(int a, int b){
        if (a == 1 || b == 0){
            return 1;
        }
        return a* power( a,b - 1);
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban : ");
        int a = scan.nextInt();
        System.out.print("Tavan : ");
        int b = scan.nextInt();

        System.out.println("Sonuç : "+power(a,b));


    }
}
