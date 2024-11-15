import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();

        // Deklarasi array untuk nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        // Input nama pesanan dan harga
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.next();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextInt();
        }

        // Hitung total biaya
        int totalBiaya = 0;
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }

        // Tampilkan daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp" + totalBiaya);

        sc.close();
    }
}