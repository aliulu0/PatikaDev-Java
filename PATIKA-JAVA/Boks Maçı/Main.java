public class Main {

    public static void main(String[] args) {
        Fighter marc = new Fighter("A", 10, 120, 100,30);
        Fighter alex = new Fighter("B", 20, 85, 85,40);

        Match match = new Match(marc, alex, 80, 100);

        match.run();

    }

}