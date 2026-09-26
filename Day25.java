import java.util.Scanner;
public class Day25 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // menghitung luas lingkaran
        Scanner e = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        int jr = e.nextInt();
        double l = 3.14 * (jr * jr);
        System.out.println("Jadi luas lingkaran adalah : " + l+" cm");
    }   
}
