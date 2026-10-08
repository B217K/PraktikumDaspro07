import java.util.Scanner;

public class StudiKasus207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa  : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRRI/PKM/LAINNYA)    : ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("belmawa") || jenis.equalsIgnoreCase("bakorma") || jenis.equalsIgnoreCase("mandiri")) {
            // lomba
            System.out.print("Jumlah dokumen    : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara   : ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println(" Status : Dokumen tidak lengkap (kurang "+ (4-dokumen)+" dokumen. Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3).");
            }
        } else if () 
    }
}
