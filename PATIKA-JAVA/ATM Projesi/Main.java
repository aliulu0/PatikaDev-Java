import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select,price;
        while (right > 0){
            System.out.print("Kullanıcı Adınızı giriniz :");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz :");
            password = input.nextLine();

            if ((userName.equals("patika")) && (password.equals("dev123"))){
                System.out.println("Merhaba Kodluyoruz Bankası'na Hoşgeldiniz !");
                do {
                    System.out.println("1-Para yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz :");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Güncel bakiyeniz : "+balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı yazınız :");
                            price = input.nextInt();
                            if (price <= balance){
                                balance -= price;
                                System.out.println("Güncel bakiyeniz : "+balance);
                                break;
                            }
                            else {
                                System.out.println("Yetersiz bakiye.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                    }
                    if (select < 1 && select > 4){
                        System.out.println("Hatalı seçim yaptınız !");
                    }
                }
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");

            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }








    }
}
