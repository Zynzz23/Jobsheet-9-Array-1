import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array int (10 elemen)
        int[] nilaiMhs = new int [10];

        // deklarasi variable
        double total = 0;
        double rata2;

        //  array nilaiMhs dengan nilai dari input pengguna
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        //  perulangan untuk menghitung jumlah keseluruhan nilai dalam array nilaiMhs
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        // menghitung rata rata
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
    }
    
}
