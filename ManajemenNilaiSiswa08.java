import java.util.Scanner;

public class ManajemenNilaiSiswa08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalNilai = 0.0, rataRata = 0.0;
        int diAtasRataRata = 0, diBawahRataRata = 0, jumlahSiswa = 0;

        while (true) {
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk menghentikan): ");
            String nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai untuk " + nama + ": ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();

            totalNilai += nilai;
            jumlahSiswa++;

            rataRata = totalNilai / jumlahSiswa;

            if (nilai > rataRata) {
                diAtasRataRata++;
            } else if (nilai < rataRata) {
                diBawahRataRata++;
            }
            System.out.println("Total siswa: " + jumlahSiswa);
            System.out.println("Total nilai: " + totalNilai);
            System.out.println("Rata-rata nilai kelas: " + rataRata);
        }

        if (jumlahSiswa == 0) {
            System.out.println("Tidak ada siswa atau nilai yang dimasukkan.");
        } else {
            System.out.println("Rata-rata nilai kelas: " + rataRata);
            System.out.println("Ada " + diAtasRataRata + " siswa dengan nilai di atas rata-rata");
            System.out.println("Ada " + diBawahRataRata + " siswa dengan nilai di bawah rata-rata");

            if (diAtasRataRata > jumlahSiswa / 2) {
                System.out.println("Mayoritas siswa mendapatkan nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa TIDAK mendapatkan nilai di atas rata-rata.");
            }
        }

        scanner.close();
    }
}
