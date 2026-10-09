import java.util.Scanner;
public class Day38 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        System.out.println("=== PILIHAN PAKET BIOSKOP ===");
        System.out.println("1. Paket Reguler (Rp 35.000)");
        System.out.println("2. Paket VIP     (Rp 60.000)");
        System.out.println("3. Paket VVIP    (Rp 100.000)");
        System.out.println("=============================");
        System.out.print("Pilih nomor paket (1-3) : ");
        int pilihan = el.nextInt();
        if (pilihan == 1) {
            System.out.println("Anda memilih Paket Reguler.");
            System.out.println("Total bayar: Rp 35.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Paket VIP.");
            System.out.println("Total bayar: Rp 60.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Paket VVIP.");
            System.out.println("Total bayar: Rp 100.000");
        } else {
            System.out.println("Pilihan menu tidak tersedia!");
        }
    }
}
