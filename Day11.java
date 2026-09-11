import java.util.Scanner;
public class Day11 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
    // Pengenalan Scanner

    String nama = "Efraim";
    int umur = 18;
    
    Scanner inp = new Scanner(System.in);

    System.out.print("Nama: ");
    nama = inp.nextLine();

    System.out.print("Umur: ");
    umur = inp.nextInt();

    System.out.println("\nNama saya : " + nama);
    System.out.println("Umur saya : " + umur + " tahun");
        
    }
    
}
