import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz");
            if (heat >= 5 && heat <= 25){
                if (heat <= 15){
                    System.out.println("Sinemaya gidebilirsiniz");
                }
                else if (heat >= 15){
                    System.out.println("Piknik yapabilirsiniz");
                }

            }
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}
