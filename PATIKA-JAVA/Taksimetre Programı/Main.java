import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int km;
        double total ,ücret = 2.20,start = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Kilometre giriniz: ");
        km = input.nextInt();
        total = ücret * km;
        total += start;
        total = total < 20 == true ? total = 20 : total;

        System.out.println("Tutar: "+total+" TL");

    }
}
