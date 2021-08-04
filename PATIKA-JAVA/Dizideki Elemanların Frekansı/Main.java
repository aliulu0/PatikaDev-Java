import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr ,int value) {

        for(int i : arr) {
            if(i==value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi :"+Arrays.toString(list));
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
               if ((i != j) && list[i] == list[j]){
                   if(!isFind(duplicate,list[i])){
                       duplicate[startIndex++] = list[i];
                   }
                   break;
               }
            }
        }
        System.out.println("Tekrar eden sayılar");

        for (int i = 0; i < duplicate.length; i++){
            int count = 0;
            if (duplicate[i] == 0){
                break;
            }
            for (int j = 0; j < duplicate.length; j++){
                if (duplicate[i] == list[j]){
                 count++;
                }
            }
            System.out.println(duplicate[i] +" sayısı " + count + " kez tekrar edildi");
        }
        for(int i = 0 ; i<list.length ; i++) {
            int a=0;
            for(int j = 0 ; j<duplicate.length; j++) {
                if(list[i] == duplicate[j]) {
                    a++;
                }
            }
            if(a == 0) {
                System.out.println(list[i] +" sayısı 1 kez tekrar edildi");

            }
        }
    }


}