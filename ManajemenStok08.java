import java.util.Scanner;

public class ManajemenStok08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama barang (ketik 'selesai' untuk menghentikan): ");
            String namaBarang = sc.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok untuk " + namaBarang + ": ");
            int jmlStok = sc.nextInt();

            System.out.print("Masukkan harga per barang untuk " + namaBarang + ": ");
            double hargaPerBarang = sc.nextDouble();
            sc.nextLine();

            double totalNilaiStok = jmlStok * hargaPerBarang;
            System.out.println("Total nilai stok untuk " + namaBarang + ": " + totalNilaiStok);

            System.out.print("Masukkan jumlah permintaan untuk " + namaBarang + ": ");
            int permintaan = sc.nextInt();
            sc.nextLine();

            if (permintaan <= jmlStok) {
                jmlStok -= permintaan;
                System.out.println("Permintaan dapat dipenuhi. Stok " + namaBarang + " sekarang: " + jmlStok);
            } else {
                System.out.println("Stok " + namaBarang + " tidak mencukupi.");
            }

            System.out.println("+---------------------------------------------------+");
            System.out.println("Informasi barang: ");
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Jumlah Stok Tersisa: " + jmlStok);
            System.out.println("Harga per Stok: " + hargaPerBarang);
            System.out.println("Total Nilai Stok: " + (jmlStok * hargaPerBarang));
            System.out.println("+---------------------------------------------------+");
        }

        System.out.println("Program dihentikan.");
        sc.close();
    }
}
