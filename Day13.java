import java.util.Scanner;
public class Eval1 {
public static void main(String[] args) {
    //Tugas 1
    String nama;
    int tahunLahir, tahunSekarang;
    
    Scanner in = new Scanner (System.in);
    
    System.out.print("Masukkan nama  : ");
    nama = in.nextLine();

    System.out.print("Tahun lahir    : " );
    tahunLahir = in.nextInt();

    System.out.print("Tahun Sekarang : " );
    tahunSekarang = in.nextInt();

    int hasil = tahunSekarang - tahunLahir;

    System.out.println("\nNama : " + nama);
    System.out.println("Umur : " + hasil + " tahun");

    System.out.println("\n------------------");
    in.nextLine();
    
    //Tugas 2
    String barang;
    int harga, jumlah;

    System.out.print("\nNama barang   : ");
    barang = in.nextLine();

    System.out.print("Harga barang  : ");
    harga = in.nextInt();
    
    System.out.print("Jumlah barang : ");
    jumlah = in.nextInt();

    int total = harga * jumlah;
    System.out.println("\nBarang : " + barang);
    System.out.println("Harga    : " + harga);
    System.out.println("Jumlah   : " + jumlah);
    System.out.println("Total    : " + total);

    System.out.println("\n------------------");

    //Tugas 3
    int p, l, luas;
    
    System.out.print("\nPanjang : ");
    p = in.nextInt();
    System.out.print("Lebar   : ");
    l = in.nextInt();
    luas = p * l;
    System.out.println("\nLuas : " + luas);
    
    }
    
}
