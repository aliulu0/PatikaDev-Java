import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı giriniz : ");
        b = input.nextInt();

        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Bölme\n4 - Çarpma");
        System.out.print("Seçiminiz: ");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam : "+(a+b));
                break;
            case 2:
                System.out.println("Çıkarma : "+(a-b));
                break;
            case 3:
                System.out.println("Bölme : "+(a/b));
                break;
            case 4:
                System.out.println("Çarpma : "+(a*b));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }
    }
}
