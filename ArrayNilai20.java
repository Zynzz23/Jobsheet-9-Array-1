import java.util.Scanner;

public class ArrayNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array int (10 elemen)
        int[] nilaiAkhir = new int[10];

        // perulangan untuk menerima input dan mengisi elemen array
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
            }
        {
        for (int i = 0; i < 10; i++) {
        System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
                }
            }
    }
}