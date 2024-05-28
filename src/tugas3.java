import java.util.Scanner;

class Barang {
    String KodeBarang, NamaBarang;
    int hargaBarang, JumlahBarang;
    // Konstruktor default
    public Barang(String KodeBarang, String NamaBarang, int hargaBarang, int JumlahBarang) {
        this.KodeBarang = KodeBarang;
        this.NamaBarang = NamaBarang;
        this.hargaBarang = hargaBarang;
        this.JumlahBarang = JumlahBarang;
    }

    public void detailBarang(){
        System.out.println("==================");
        System.out.println("\nIdentitas Barang");
        System.out.println("==================");
        System.out.println("Kode Barang: " + KodeBarang);
        System.out.println("Nama Barang: " + NamaBarang);
        System.out.println("Harga Barang: " + "Rp" + hargaBarang);
        System.out.println("Jumlah Barang: " + JumlahBarang);
    }
}
class gudang {
    Barang[] barang;
    String namaGudang;
    int jumlahBarang,kapasitas;
    // Constructor dengan parameter
    public gudang(String namaGudang,int kapasitas) {
        this.namaGudang = namaGudang;
        this.barang = new Barang[0];
        this.kapasitas = kapasitas;
        this.jumlahBarang = 0;
    }

    public void tambahBarang(Barang barang) {
        if (this.jumlahBarang == 0 ) {
            int panjangAwal = this.barang.length;

            Barang[] barangSementara = new Barang[panjangAwal + 1];

            for (int i = 0; i < panjangAwal; i++) {
                    barangSementara[i] = this.barang[i];
            }

            barangSementara[panjangAwal] = barang;
            this.jumlahBarang++;
            this.barang = barangSementara;
            System.out.println("Barang berhasil ditambahkan ke gudang.");
        }
        else {
            System.out.println("Gudang sudah terisi, tidak bisa menambahkan barang lagi.");
        }
    }


    public void cetakGudang() {

        System.out.println("Isi gudang " + namaGudang);

        if (this.jumlahBarang == 0) {
            System.out.println("Gudang kosong.");
        } else {
            for (int i = 0; i < this.jumlahBarang; i++) {
                if (barang[i] != null) {
                    barang[i].detailBarang();
                }
            }
        }
    }
}

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama gudang: ");
        String namaGudang = input.nextLine();
        System.out.print("Masukan Kapasitas gudang: ");
        int kapasitas = input.nextInt();
        gudang Gudang = new gudang(namaGudang,kapasitas);

        input.nextLine();
        System.out.println("\t");
        System.out.println("Barang 1");
        System.out.println("==========");
        System.out.println("");
        System.out.print("Masukan Kode Barang : ");
        String KodeBarang = input.nextLine();
        System.out.print("Masukan Nama Barang : ");
        String NamaBarang = input.nextLine();
        System.out.print("Masukan Harga Barang : ");
        int hargaBarang = input.nextInt();
        System.out.print("Masukan Jumlah Barang : ");
        int JumlahBarang = input.nextInt();
        input.nextLine();
        System.out.println("\nMasukan Barang 1 ke gudang");
        System.out.println("=========================");

        Barang barang1 = new Barang(KodeBarang,NamaBarang,hargaBarang,JumlahBarang);
        Gudang.tambahBarang(barang1);

        System.out.println("\t");
        System.out.println("\nBarang 2");
        System.out.println("=============");
        input.nextLine();
        System.out.print("Kode Barang: ");
        String kodeBarang2 = input.nextLine();
        System.out.print("Nama Barang: ");
        String namaBarang2 = input.nextLine();
        System.out.print("Harga Barang: ");
        int hargaBarang2 = input.nextInt();
        System.out.print("Jumlah Barang: ");
        int jumlahBarang2 = input.nextInt();
        input.nextLine();
        System.out.println("\nMasukan Barang 2 ke gudang");
        System.out.println("=========================");
        Barang barang2 = new Barang(kodeBarang2, namaBarang2, hargaBarang2, jumlahBarang2);
        Gudang.tambahBarang(barang2);


        System.out.println("\nCek sisah kapasitas gudang");
        System.out.println("=========================");
        System.out.println(kapasitas-JumlahBarang);
        System.out.println("\n");
        Gudang.cetakGudang();
    }
}
