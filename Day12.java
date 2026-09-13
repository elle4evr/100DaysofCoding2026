import java.util.Scanner;
public class Day12 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // membuat bidata menggunakan scanner
    
    String nama, jk, alamat, jurusan, hobi;
    int umur;

    Scanner data = new Scanner(System.in);

    System.out.print("Masukkan Nama\t\t: ");
    nama = data.nextLine();

    System.out.print("Masukkan Umur\t\t: ");
    umur = data.nextInt();
    data.nextLine(); 

    System.out.print("Masukkan Jenis Kelamin\t: ");
    jk = data.nextLine();

    System.out.print("Masukkan Alamat\t\t: ");
    alamat = data.nextLine();

    System.out.print("Masukkan Jurusan\t: ");
    jurusan = data.nextLine();
    
    System.out.print("Masukkan Hobi\t\t: ");
    hobi = data.nextLine();


    System.out.println("\n===== BIODATA =====");
    System.out.println("Nama\t\t: "+nama);
    System.out.println("Umur\t\t: " + umur +" tahun");
    System.out.println("Jenis Kelamin\t: "+jk);
    System.out.println("Alamat\t\t: "+alamat);
    System.out.println("Jurusan\t\t: "+jurusan);
    System.out.println("Hobi\t\t: "+hobi);
    System.out.println("===================");
    }
    
}
