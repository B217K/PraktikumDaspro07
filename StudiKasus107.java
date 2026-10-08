import java.util.Scanner;
public class StudiKasus107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000, jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Jumlah Cup yang dibeli \t : ");
        jumlahCup = sc.nextInt();
        System.out.print("Uang yang dibayar \t : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga*10/100;
        }
        totalBayar = totalHarga-diskon;

        System.out.println("Total harga  : "+ totalHarga);
        System.out.println("Diskon       : "+ diskon);
        System.out.println("Total bayar  : "+ totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembaliannya :"+ kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp. "+ kurang);
        }
        sc.close();
    }
}
    