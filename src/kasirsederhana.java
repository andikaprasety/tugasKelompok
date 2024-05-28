import java.util.Scanner;
public class kasirsederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String[] daftarBarang = {"Apel", "Jeruk", "Mangga"};
            int[] hargaBarang = {5000, 7000, 6000};

            System.out.println("Daftar Barang:");
            for (int i = 0; i < daftarBarang.length; i++) {
                System.out.println((i + 1) + ". " + daftarBarang[i] + " - Rp " + hargaBarang[i]);
            }

            System.out.print("Masukkan nomor barang yang dibeli: ");
            int nomorBarang = scanner.nextInt();
            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int jumlahBarang = scanner.nextInt();

            int totalHarga = hargaBarang[nomorBarang - 1] * jumlahBarang;

            System.out.println("Total Harga: Rp" + totalHarga);

            scanner.close();
        }
    }

