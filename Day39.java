import java.util.Scanner;
public class Day39{
    /**
     * 
     * @author Efraim
     */
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);

        System.out.print("Masukkan angka 1  : ");
        double angka1 = el.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        char op = el.next().charAt(0);

        System.out.print("Masukkan angka 2  : ");
        double angka2 = el.nextDouble();

        System.out.println("---------------------------------");

        if (op == '+') {
            double hasil = angka1 + angka2;
            System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
        } 
        else if (op == '-') {
            double hasil = angka1 - angka2;
            System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
        } 
        else if (op == '*') {
            double hasil = angka1 * angka2;
            System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
        } 
        else if (op == '/') {
            if (angka2 == 0) {
                System.out.println("[PERINGATAN] Tidak bisa melakukan pembagian dengan angka 0!");
            } else {
                double hasil = angka1 / angka2;
                System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
            }
        } 
        else {
            System.out.println("[GAGAL] Operator '" + op + "' tidak dikenali sistem!");
        }
    }
}
