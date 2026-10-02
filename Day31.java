public class Day31 {
    public static void main(String[] args) {
        int nilai = 80;
        int absensi = 90;
        System.out.println("Lulus: " + (nilai >= 75 && absensi >= 80));
        System.out.println("Dapat Remedial: " + (nilai < 75 || absensi < 75));
        System.out.println("Tidak Lulus: " + !(nilai >= 75)); // Output: false
        //AND (&&) true jika kedua kondisi bernilai true, jika salah satu false maka hasilnya false
        //OR (||) true jika salah satu kondisi bernilai true, jika kedua kondisi false maka hasilnya false
        //NOT (!) membalikkan nilai boolean, jika true menjadi false, jika false menjadi true
    }
}
