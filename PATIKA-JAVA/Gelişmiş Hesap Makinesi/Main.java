import java.util.Scanner;
public class Main {
    static int sum(int a,int b){
        int result = a + b;
        System.out.print("Toplam : "+result);
        return result;
    }
    static int minus(int a,int b){
        int result = a - b;
        System.out.print("Çıkarma : "+result);
        return result;
    }
    static int times(int a,int b){
        int result = a * b;
        System.out.print("Çarpma : "+result);
        return result;
    }
    static int divided(int a,int b){
        if (b == 0){
            System.out.println("İkinci sayı sıfırdan faklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.print("Bölüm : "+result);
        return result;
    }
    static int power(int a,int b){
        if(a == 0){
            System.out.println("tanımsız");
        }
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        return result;
    }
    static int factorial(int a){
        if(a == 0 || a == 1)
            return 1;
        return factorial(a-1) * a;
    }
    static int mod(int a,int b){
        int result = a % b;
        System.out.println("Sonuç : "+result);
        return result;
    }
    static void calculator(int a, int b){
        System.out.println("Çevresi : "+((2 * a)+(2 * b)));
        System.out.println("Alanı : " + a * b);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int select,a,b;
        String menu = "\n===========\n" +
                "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
       while(true){
           System.out.println(menu);
           System.out.print("Bir işlem seçiniz : ");
           select = scan.nextInt();
           if (select == 0 ){
               System.out.println("Güle güle");
               break;
           }
           System.out.print("İlk sayı : ");
           a = scan.nextInt();
           System.out.print("İkinci sayı : ");
           b = scan.nextInt();

           switch (select){
               case 1:
                   sum(a,b);
                   break;
               case 2:
                   minus(a,b);
                   break;
               case 3:
                   times(a,b);
                   break;
               case 4:
                   divided(a,b);
                   break;
               case 5:
                   System.out.println("Sonuç : "+power(a,b));
                   break;
               case 6:
                   System.out.println("İlk yazdığınız sayı geçerlidir.");
                   int result = factorial(a);
                   System.out.println("Faktoriyel : "+ result);
                   break;
               case 7:
                   mod(a,b);
                   break;
               case 8:
                   calculator(a,b);
                   break;
           }
       }
    }
}
