public class Day2 {
    public static void main(String [] args) {

        String nama, alamat, nim, wa;
        char jk;

        nama = "Efraim Kamoda";
        jk = 'L';
        alamat = "Mamasa";
        nim = "D0226320";
        wa = "08134027726";

        System.out.println("========BIODATA========");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Jenis Kelamin \t: " + jk);
        System.out.println("Alamat \t\t: " + alamat);
        System.out.println("NIM \t\t: " + nim);
        
        System.out.println("\n");

        System.out.print("Nama \t\t: " + nama + "\n");
        System.out.print("Jenis Kelamin \t: " + jk + "\n");
        System.out.print("Alamat \t\t: " + alamat + "\n");
        System.out.print("NIM \t\t: " + nim + "\n");
        System.out.print("WhatsApp \t: " + wa + "\n");

        System.out.println("\n");

        System.out.printf("Nama \t\t: %s \n", nama);
        System.out.printf("Jenis Kelamin \t: %c \n", jk);
        System.out.printf("Alamat \t\t: %s \n", alamat);
        System.out.printf("NIM \t\t: %s \n", nim);
        System.out.printf("WhatsApp \t: %s \n", wa);
        System.out.println("=======================================");

    }
}
