import java.util.Scanner;
public class Day12 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
    
    String nama, nim, alamat, jurusan;
    int umur;

    System.out.println("::......BIODATA......::");
    Scanner data = new Scanner(System.in);

    System.out.print("Masukkan Nama\t: ");
    nama = data.nextLine();

    System.out.print("Masukkan Umur\t: ");
    umur = data.nextInt();
    data.nextLine(); 

    System.out.print("Masukkan NIM\t: ");
    nim = data.nextLine();

    System.out.print("Masukkan Alamat\t: ");
    alamat = data.nextLine();

    System.out.print("Masukkan Jurusan: ");
    jurusan = data.nextLine();


    System.out.println("\n::......BIODATA......::");
    System.out.println("Nama saya\t: "+nama);
    System.out.println("Umur saya\t: " + umur +" tahun");
    System.out.println("NIM saya\t: "+nim);
    System.out.println("Alamat saya\t: "+alamat);
    System.out.println("Jurusan saya\t: "+jurusan);
    System.out.println("");
    }
    
