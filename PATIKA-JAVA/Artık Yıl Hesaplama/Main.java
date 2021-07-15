import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int date,select;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        date = input.nextInt();

        if ((date % 4 == 0) || (date %400 == 0)){
            System.out.println(date + " bir artık yıldır !");
        }
        else {
            System.out.println(date+" bir artık yıldır değildir !");
        }




    }
}
