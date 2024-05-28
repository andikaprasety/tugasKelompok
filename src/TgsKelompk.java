import java.util.Scanner;

class keretaapi {
    String namaKereta;
    int nomorKereta, kapasitasKereta;

    public keretaapi(String namaKereta, int nomorKereta, int kapasitasKereta) {
        this.namaKereta = namaKereta;
        this.nomorKereta = nomorKereta;
        this.kapasitasKereta = kapasitasKereta;
    }

    public void cetakKereta() {
        System.out.println("Informasi Kereta Api");
        System.out.println("Nama Kereta Api: " + namaKereta);
        System.out.println("Nomor Kereta Api: " + nomorKereta);
        System.out.println("Kapasitas Penumpang Kereta Api: " + kapasitasKereta);
    }
}

class penumpang {
    String nmPenumpang, Nik, tipePenumpang, nomor;

    public penumpang(String nmPenumpang, String Nik, String tipePenumpang, String nomor) {
        this.nmPenumpang = nmPenumpang;
        this.Nik = Nik;
        this.tipePenumpang = tipePenumpang;
        this.nomor = nomor;
    }

    public void CetakPenumpang() {
        System.out.println("Informasi Penumpang");
        System.out.println("Nama Penumpang: " + nmPenumpang);
        System.out.println("NIK Penumpang: " + Nik);
        System.out.println("Tipe Penumpang: " + tipePenumpang);
        System.out.println("Nomor Penumpang: " + nomor);
    }
}

class TiketKeretaApi {
    private String namaPenumpang, tanggalPerjalanan, stasiunAwal, stasiunTujuan;
    private int jumlahTiket;

    public TiketKeretaApi(String namaPenumpang, String stasiunAwal, String stasiunTujuan, String tanggalPerjalanan, int jumlahTiket) {
        this.namaPenumpang = namaPenumpang;
        this.stasiunAwal = stasiunAwal;
        this.stasiunTujuan = stasiunTujuan;
        this.tanggalPerjalanan = tanggalPerjalanan;
        this.jumlahTiket = jumlahTiket;
    }

    public TiketKeretaApi(String stasiunTujuan) {
        this("", "", stasiunTujuan, "", 0);
    }

    public TiketKeretaApi(String stasiunAwal, String tanggalPerjalanan) {
        this("", stasiunAwal, "", tanggalPerjalanan, 0);
    }

    public void cetakTiket(){
        System.out.println("Informasi Tiket Kereta Api");
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Stasiun Awal: " + stasiunAwal);
        System.out.println("Stasiun Tujuan: " + stasiunTujuan);
        System.out.println("Tanggal Perjalanan: " + tanggalPerjalanan);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
    }
}

class Stasiun {
    private String namaStasiun;
    private String lokasi;

    public Stasiun(String namaStasiun, String lokasi) {
        this.namaStasiun = namaStasiun;
        this.lokasi = lokasi;
    }

    public void cekIdentitas() {
        System.out.println("Nama Stasiun: " + namaStasiun);
        System.out.println("Lokasi: " + lokasi);
    }
}

class StasiunBesar extends Stasiun {
    private int jumlahPeron;
    private boolean adaRuangTungguVIP;

    public StasiunBesar(String namaStasiun, String lokasi, int jumlahPeron, boolean adaRuangTungguVIP) {
        super(namaStasiun, lokasi);
        this.jumlahPeron = jumlahPeron;
        this.adaRuangTungguVIP = adaRuangTungguVIP;
    }

    @Override
    public void cekIdentitas() {
        super.cekIdentitas();
        System.out.println("Jumlah Peron: " + jumlahPeron);
        System.out.println("Ada Ruang Tunggu VIP: " + (adaRuangTungguVIP ? "Ya" : "Tidak"));
    }
}

class StasiunKecil extends Stasiun {
    private boolean adaParkirSepeda;

    public StasiunKecil(String namaStasiun, String lokasi, boolean adaParkirSepeda) {
        super(namaStasiun, lokasi);
        this.adaParkirSepeda = adaParkirSepeda;
    }

    @Override
    public void cekIdentitas() {
        super.cekIdentitas();
        System.out.println("Ada Parkir Sepeda: " + (adaParkirSepeda ? "Ya" : "Tidak"));
    }
}
class AngkutanUmum {
    private String jenisAngkutan;
    private String nomorPlat;
    private String tujuan;
    private int kapasitas;

    public AngkutanUmum(String jenisAngkutan, String nomorPlat, String tujuan, int kapasitas) {
        this.jenisAngkutan = jenisAngkutan;
        this.nomorPlat = nomorPlat;
        this.tujuan = tujuan;
        this.kapasitas = kapasitas;
    }

    public void infoAngkutan() {
        System.out.println("Informasi Angkutan Umum:");
        System.out.println("Jenis Angkutan: " + jenisAngkutan);
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Kapasitas: " + kapasitas + " penumpang");
    }
}

public class TgsKelompk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama kereta api: ");
        String namaKereta = scanner.nextLine();

        System.out.print("Masukkan nomor kereta: ");
        int nomorKereta = scanner.nextInt();

        System.out.print("Masukkan kapasitas kereta api: ");
        int kapasitasKereta = scanner.nextInt();
        System.out.println();

        keretaapi keretaapi1 = new keretaapi(namaKereta, nomorKereta, kapasitasKereta);
        keretaapi1.cetakKereta();

        scanner.nextLine();
        System.out.println();

        System.out.print("Masukkan nama penumpang: ");
        String nmPenumpang = scanner.nextLine();

        System.out.print("Masukkan NIK penumpang: ");
        String Nik = scanner.nextLine();

        System.out.print("Masukkan tipe penumpang: ");
        String tipePenumpang = scanner.nextLine();

        System.out.print("Masukkan nomor penumpang: ");
        String nomor = scanner.nextLine();
        System.out.println();

        penumpang penumpang1 = new penumpang(nmPenumpang, Nik, tipePenumpang, nomor);
        penumpang1.CetakPenumpang();

        scanner.nextLine();
        System.out.println();


        System.out.print("Masukkan nama penumpang: ");
        String namaPenumpang = scanner.nextLine();

        System.out.print("Masukkan stasiun awal: ");
        String stasiunAwal = scanner.nextLine();

        System.out.print("Masukkan stasiun tujuan: ");
        String stasiunTujuan = scanner.nextLine();

        System.out.print("Masukkan tanggal perjalanan: ");
        String tanggalPerjalanan = scanner.nextLine();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();
        scanner.nextLine();
        System.out.println();


        TiketKeretaApi tiket1 = new TiketKeretaApi(namaPenumpang, stasiunAwal, stasiunTujuan, tanggalPerjalanan, jumlahTiket);
        tiket1.cetakTiket();

        System.out.println();

        TiketKeretaApi tiket2 = new TiketKeretaApi("Jakarta");
        tiket2.cetakTiket();

        System.out.println();

        TiketKeretaApi tiket3 = new TiketKeretaApi("Surabaya", "15 Mei 2024");
        tiket3.cetakTiket();

        scanner.nextLine();
        System.out.println();

        System.out.print("Masukkan nama stasiun: ");
        String namaStasiun = scanner.next();

        System.out.print("Masukkan lokasi stasiun: ");
        String lokasiStasiun = scanner.next();

        System.out.print("Masukkan jenis stasiun (besar/kecil): ");
        String jenisStasiun = scanner.next();

        if (jenisStasiun.equalsIgnoreCase("besar")) {
            System.out.print("Masukkan jumlah peron: ");
            int jumlahPeron = scanner.nextInt();

            System.out.print("Apakah ada ruang tunggu VIP? (true/false): ");
            boolean adaRuangTungguVIP = scanner.nextBoolean();
            System.out.println();


            StasiunBesar stasiunBesar = new StasiunBesar(namaStasiun, lokasiStasiun, jumlahPeron, adaRuangTungguVIP);
            stasiunBesar.cekIdentitas();
        } else if (jenisStasiun.equalsIgnoreCase("kecil")) {
            System.out.print("Apakah ada parkir sepeda? (true/false): ");
            boolean adaParkirSepeda = scanner.nextBoolean();
            System.out.println();


            StasiunKecil stasiunKecil = new StasiunKecil(namaStasiun, lokasiStasiun, adaParkirSepeda);
            stasiunKecil.cekIdentitas();
        } else {
            System.out.print("Jenis stasiun tidak valid.");
        }
        scanner.nextLine();
        System.out.println();

        System.out.print("Masukkan jenis angkutan: ");
        String jenisAngkutan = scanner.nextLine();

        System.out.print("Masukkan nomor plat: ");
        String nomorPlat = scanner.nextLine();

        System.out.print("Masukkan tujuan: ");
        String tujuan = scanner.nextLine();

        System.out.print("Masukkan kapasitas angkutan: ");
        int kapasitas = scanner.nextInt();
        System.out.println();


        AngkutanUmum angkutan = new AngkutanUmum(jenisAngkutan, nomorPlat, tujuan, kapasitas);
        angkutan.infoAngkutan();
    }
}
