import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int r,a;
        double pi = 3.14,alan,cevre,dilimAlan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açısını giriniz: ");
        a = input.nextInt();

        alan = pi * (r * r);
        cevre = 2 * pi * r;
        dilimAlan = (pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);
        System.out.println("Daire Diliminin alanı : "+dilimAlan);





    }
}
