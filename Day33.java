import java.util.Scanner;
public class Day33 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        int age;
        System.out.print("Masukkan umur : ");
        age = el.nextInt();

        if (age >= 18) {
            System.out.println("Anda dewasa");
        }else{
            System.out.println("Anda belum dewasa");
        }
    }  
}
