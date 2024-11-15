public class SearchNilai20 {
    public static void main(String[] args) {

        // array int
        int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};

        // deklarasi variable
        int key = 90;
        int hasil = 0;

        // perulangan dengan array
        for (int i = 0; i < arrNilai.length; i++) {

            // menampilkan dan menghentikan ketika mendapat hasil
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
        System.out.println();
    }
}
