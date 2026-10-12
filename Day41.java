import java.util.Scanner;
public class Day41 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
    Scanner el = new Scanner(System.in);
        System.out.print("Suhu ruangan : ");
        double s = el.nextDouble();
        if (s >= 30.0 ){
            System.out.println("Suhu panas!! NYALAKAN AC");
        } else if ( s >= 20.0 ){
            System.out.println("Suhu aman");
        } else {
            System.out.println("Suhu dingin!! pakai jaket");
        }
   }    
}
