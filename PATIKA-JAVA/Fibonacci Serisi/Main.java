import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,x=0, y=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz : ");
        n = input.nextInt();


        System.out.println(x);
        System.out.println(y);
        for(int i=1;i<=n-1;i++){
            int sum=x+y;
            x=y;
            y=sum;
            System.out.println(sum);
        }


    }
}
