public class Day18 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // Konversi otomasi tipe data kecil ke besar
    
        byte e = 127; 
        short f = e;
        int r = f;
        long a = r;
        float i = a;
        double m = i;

        System.out.printf("Dari byte : %d%nDari byte ke short : %d%nDari short ke integeer : %d %nDari integer ke long %d%nDari long ke float : %f%nDari float ke double %f", e, f, r, a, i, m);
    }    
}
