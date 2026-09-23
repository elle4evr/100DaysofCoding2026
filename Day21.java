public class Day21 {
    /**
     * @author Efraim
     */
    public static void main(String[] args) {
        // Mengubah string menjadi tipe data primitif
        String age = "18";
        String high = "169.8";
        String bb = "56.6";
        String jk = "ELLE";
        String real = "true";

        int ageInt = Integer.parseInt(age);
        System.out.println("Umur dalam bentuk integer\t: " + ageInt);
        
        double highDouble = Double.parseDouble(high);
        System.out.println("Tinggi dalam bentuk double\t: " + highDouble);
        
        float bbFloat = Float.parseFloat(bb);
        System.out.println("Berat badan dalam bentuk float\t: " + bbFloat);
        
        char Cha = jk.charAt(1);
        System.out.println("Jenis Kelamin dalam bentuk char\t: " + Cha);
        
        boolean realBoolean = Boolean.parseBoolean(real);
        System.out.println("Status dalam bentuk boolean\t: " + realBoolean);
    }
}
