import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        // Membuat array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        // Meminta nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

        // Menghitung rata-rata
        int totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        // Mencari nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        System.out.println("------------------------------");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("------------------------------");
        System.out.println("Daftar nilai mahasiswa:");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}