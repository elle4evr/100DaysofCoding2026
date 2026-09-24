import java.util.Scanner;
public class Day23 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // mecari luas persegi       
        Scanner el = new Scanner (System.in);
        System.out.print("Masukkan sisi : ");
        int si = el.nextInt();
        int lu = si * si;
        System.out.printf("Jadi luas persegi dengan %ndengan sisi %d cm adalah : %d cm\n", si, lu);   
    }   
}
