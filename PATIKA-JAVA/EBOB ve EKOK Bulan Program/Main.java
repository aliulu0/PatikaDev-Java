import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n1,n2,i,k,ebob = 1,ekok = 1,x = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

        if (n1 < n2){
            i = n1;
            while ( i >= 1){

                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("Ebob : " + ebob);
                    break;
                }
                i--;
            }

        }
        else {
            k = n2;
            while (k >= 1){
                if (n1 % k == 0 && n2 % k == 0){
                    ebob = k;
                    System.out.println("Ebob : "+ ebob);
                    break;
                }
                k--;
            }

        }
        while (x <= (n1*n2)){

            if (x % n1 == 0 && x % n2 == 0){
                ekok = x;
                System.out.println("Ekok : "+ekok);
                break;
            }
            x++;
        }


    }
}
