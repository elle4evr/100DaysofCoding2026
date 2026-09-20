public class Day19 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // konversi paksa besar ke kecil
        long a = 123445678910l;
        int b = (int) a;
        short c = (short) b;
        byte d = (byte) c;

        System.out.printf("Long :%d %n", a);
        System.out.printf("Dari long ke int : %d %nDari int ke short : %d %nDari short ke byte : %d", b, c, d);
    }
} 
