import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        // Daftar menu makanan
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        // Input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = input.nextLine();

        // Melakukan pencarian linear
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                found = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (found) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu.");
        } else {
            System.out.println("Makanan " + makananDicari + " tidak tersedia di menu.");
        }
    }
}