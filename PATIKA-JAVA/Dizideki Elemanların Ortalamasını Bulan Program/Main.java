public class Main {

    public static void main(String[] args) {

        double[] harmonik = {2,4,6,8,10};
        double avarage = 0.0;
        double harmonikSeri = 1.0;

        for(int i = 0 ; i<harmonik.length ; i++) {
            harmonikSeri+=(1/harmonik[i]);
            System.out.println(harmonikSeri);
        }

        avarage = harmonik.length / harmonikSeri;
        System.out.println("Ortalama\t: "+ avarage);
    }


}