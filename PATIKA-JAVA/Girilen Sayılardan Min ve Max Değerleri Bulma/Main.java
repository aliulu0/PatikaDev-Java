import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,n2,max,min;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();
        System.out.print("1. sayısını giriniz : ");
        n2 = input.nextInt();

        min = n2;
        max = n2;
        for (int i = 2; i <= n; i++){
            System.out.print(i+ ". sayıyı giriniz; ");
            n2 = input.nextInt();

            if (n2 > max){
                max = n2;
            }
            else if (n2<min){
                min = n2;
            }
        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);



    }
}
