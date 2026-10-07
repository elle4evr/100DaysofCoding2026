import java.util.Scanner;
public class Day36 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = el.nextInt();
        if (a % 2 == 0) {
            System.out.println("Angka " + a +" adalah bilangan genap");
        } else { 
            System.out.println("Angka " + a +" adalah bilangan ganjil");
        }
    }
}
