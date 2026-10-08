import java.util.Scanner;
public class Day37 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = el.nextInt();
        if (a >0) {
            System.out.println("Angka " + a + " adalah bilangan positif");
        } else if (a < 0 ) {
            System.out.println("Angka " + a + " adalah bilangan negatif");
        } else {
            System.out.println("Angka yang anda masukkan adalah angka nol");
        }
    }  
}
