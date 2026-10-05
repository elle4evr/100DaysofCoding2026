import java.util.Scanner;
public class Day34 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        System.out.print("Masukkan total belanjaan (Rp) : ");
        int tb = el.nextInt();

        if (tb >= 500000) {
            System.out.println("Anda mendapatkan diskon : 20%");
        } else if (tb >= 250000) {
            System.out.println("Anda mendapatkan diskon : 10%");
        } else if (tb >= 100000) {
            System.out.println("Anda mendapatkan diskon : 5%");
        } else {
            System.out.println("Anda tidak mendapatkan diskon (0%)");
        }
    }
}
