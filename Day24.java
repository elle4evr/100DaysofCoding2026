import java.util.Scanner;
public class Day24 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // mencari luas persegi panjang
        Scanner e = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int pjg = e.nextInt();
        System.out.print("Masukkan lebar   : ");
        int lbr = e.nextInt();
        int ls = pjg * lbr;
        System.out.printf("Jadi luas persegi panjang dengan panjang %d cm dan lebar %d cm adalah : %d cm " ,pjg ,lbr , ls);
    }   
}
