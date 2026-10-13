import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        System.out.print("Gaji pokok : ");
        double gaji = el.nextDouble();
        System.out.print("Tunjangan  : ");
        double tun = el.nextDouble();
        double gk = gaji + tun;
        double pajak = 0;
        if (gk > 5000000){
            pajak = gk * 0.10;
            System.out.println("Keterangan: Dikenakan pajak 10%");
        } else {
            pajak = 0;
            System.out.println("Keterangan: Bebas pajak (0%)");
        }
        double gb = gk - pajak;
        System.out.println("---------------------------------");
        System.out.println("Total Pajak   : Rp" + pajak);
        System.out.println("Gaji Bersih   : Rp" + gb);
    }
    
}
