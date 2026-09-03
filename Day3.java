public class Day3 {
    public static void main(String[] args) {
        //escape sequence

        // ini normal
        System.out.println("Hai saya adalah Efraim Kamoda");

        System.out.println("\n");

        // \n untuk membuat baris baru
        System.out.println("Hai saya adalah \n Efraim Kamoda \n");

        // \t untuk memberi tab pada teks
        System.out.println("Hai saya adalah \t Efraim Kamoda \n"); 

        // \" untuk memberi tanda petik di dalam string
        System.out.println("Hai saya adalah \"Efraim Kamoda\" \n");

        // \r untuk menimpa teks bagian depan sesuai dengan jumlah karakter yang ada di belakangnya
        System.out.println("Hai saya adalah Efraim \rKamoda \n");

        // \b memundurkan kursor 1 langkah agar karakter berikutnya menimpa karakter sebelumnya
        System.out.println("Hai saya\b adalah Efraim Kamoda \n");

        // \f membuat baris baru, tetapi teks berikutnya tidak kembali ke awal (ujung kiri) baris
        System.out.println("Hai saya adalah \f Efraim Kamoda \n");
       
    }
}
