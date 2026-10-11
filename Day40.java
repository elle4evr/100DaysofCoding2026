import java.util.Scanner;
public class Day40 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        int saldo = el.nextInt();
        int mautarik = el.nextInt();
        
        int ditarik = (mautarik/100000)*100000;
        int lembar = ditarik / 100000;
        int gagal = mautarik %100000;

        System.out.println("Berhasil di tarik \t: Rp"+ditarik);
        System.out.println("Jumlah lembar 100rb \t: "+lembar + " lembar");
        System.out.println("Gagal ditarik \t\t: Rp"+gagal);
    }   
}
