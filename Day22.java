public class Day22 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // menukar 2 nilai variable
        int e = 2;
        int l = 3;

        System.out.println("Nilai e sebelum di ubah\t: " + e);
        System.out.println("Nilai l sebelum di ubah\t: " + l);
        l += e; //5
        e = l - e; //3
        l -= e; //2
        System.out.println("\nNilai e setelah di ubah\t: " + e);
        System.out.println("Nilai l setelah di ubah\t: " + l );
    }
} 
