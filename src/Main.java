public class Main {
    public static void main (String[] args) {
        BonusMilseService servise = new BonusMilseService ();
        int prise = 10_000;
        int milse = servise.colculate(prise);
        System.out.println(milse);
    }
}
