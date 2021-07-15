import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double n,result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz :");

        n = input.nextInt();
        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println(result);
    }
}
