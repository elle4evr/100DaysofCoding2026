public class Day32 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        boolean hasil1 = (a + b > 12) && (c / b == 4);
        boolean hasil2 = (a * 2 <= 15) || !(b == 5);
        System.out.println("Hasil Kombinasi 1: " + hasil1);
        System.out.println("Hasil Kombinasi 2: " + hasil2);
        System.out.println("Hasil Kombinasi 3: " + ((a - b == 5) && (c % a == 0)));
    }   
}
