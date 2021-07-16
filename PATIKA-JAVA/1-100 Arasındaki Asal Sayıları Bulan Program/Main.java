import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        for(int i = 2 ; i< 100; i++){
            int asal = 0;
            for (int j = 2; j < i;j++){
                if (i % j == 0){
                    asal = 1;
                }
            }
            if (asal != 1){
                System.out.print(i+" ");
            }
        }

    }
}
