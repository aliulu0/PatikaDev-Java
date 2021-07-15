import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String userName,password,newPassword,select;


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }
        else {
            System.out.println("Şifre hatalı! Değiştirmek istiyorsanız e,istemiyorsanız h'ye basınız.");
            select = input.nextLine();
            switch (select){
                case "e":
                    System.out.print("Yeni şifrenizi giriniz:  ");
                    newPassword = input.nextLine();

                    if (newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                    }
                    else {

                    System.out.println("Şifre oluşturuldu");
                    password = newPassword;
                    }
                    break;
                case "h":
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.");
                    break;
            }
        }
    }
}
