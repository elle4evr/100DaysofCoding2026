import java.util.Scanner;
public class Day35 {
    /**
     * @author Efraim
     */
 public static void main(String[] args) {
    Scanner el = new Scanner ( System.in);

    System.out.print("Ada kartu member? (1 = Ya, 0 = Tidak) : ");
    int mem = el.nextInt();
    if (mem == 1){
         System.out.print("Total belanja (RP) : ");
        int tb = el.nextInt();
        if (tb >= 100000) {
            System.out.println("Anda mendapat diskon 20%");
        } else {
            System.out.println("Anda mendapat diskon 10%");
        }
    } else {
        System.out.println("Anda tidak mendapatkan diskon apapun");
    }
    }   
}
