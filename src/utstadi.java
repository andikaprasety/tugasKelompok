import java.util.Scanner;

class Ternak {
    private String namaHewan;
    private int umur;

    public Ternak(String namaHewan, int umur) {
        this.namaHewan = namaHewan;
        this.umur = umur;
    }

    public void cekIdentitas() {
        System.out.println("Nama hewan  " + namaHewan);
        System.out.println("Umur hewan  " + umur);
    }
}

class Ayam extends Ternak {
    private int jenisHewan;

    public Ayam(String namaHewan, int usia, int jenisHewan) {
        super(namaHewan, usia);
        this.jenisHewan = jenisHewan;
    }

    @Override
    public void cekIdentitas() {
        super.cekIdentitas();
        if(jenisHewan == 1){
            System.out.println("jenis : " +  "Petelur");
        } else if (jenisHewan == 2){
            System.out.println("jenis : " +  "pedaging");
        } else {
            System.out.println("data tidak di temukan");
        }
    }
}

class Sapi extends Ternak {
    private String jenisKelamin;

    public Sapi(String namaHewan, int usia, String jenisKelamin) {
        super(namaHewan, usia);
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public void cekIdentitas() {
        super.cekIdentitas();
        System.out.println("Jenis kelamin : " + jenisKelamin);
    }
}

class Peternakan {
    public static Ternak[] dataAyam;
    public static Ternak[] dataSapi;

    public Peternakan() {
        dataAyam = new Ternak[100];
        dataSapi = new Ternak[100];
    }

    public static void tambahAyam(Ayam ayam,int jumlah) {
        dataAyam[jumlah] = ayam;
    }

    public static void tambahSapi(Sapi sapi,int jumlah) {
        dataSapi[jumlah] = sapi;
    }
    public int hitungAyam() {
        int count = 0;
        for (Ternak hewan : dataAyam) {
            if (hewan != null) {
                count++;
            }
        }
        return count;
    }
    public int hitungSapi() {
        int count = 0;
        for (Ternak hewan : dataSapi) {
            if (hewan != null) {
                count++;
            }
        }
        return count;
    }
    public void lihatPeternakan() {
        System.out.println("Data Ayam:");
        for (Ternak ayam : dataAyam) {
            if (ayam != null) {
                ayam.cekIdentitas();
            }
        }
        System.out.println("\nData Sapi:");
        for (Ternak sapi : dataSapi) {
            if (sapi != null) {
                sapi.cekIdentitas();
            }
        }
    }
}

public class utstadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Peternakan peternakan = new Peternakan();

        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("1. Tambah Ayam");
            System.out.println("2. Tambah Sapi");
            System.out.println("3. Keterangan peternakan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Ayam: ");
                String namaAyam = input.nextLine();
                System.out.print("Masukkan Jenis Ayam (1 = petelur,2 = pedaging): ");
                int jenisayam = input.nextInt();
                System.out.print("Masukkan usia Ayam: ");
                int usia = input.nextInt();
                input.nextLine();

                Ayam ayam = new Ayam(namaAyam, usia, jenisayam);
                Peternakan.tambahAyam(ayam,peternakan.hitungAyam());
            } else if (pilihan == 2) {
                System.out.print("Masukkan Nama Sapi: ");
                String namaSapi = input.nextLine();
                System.out.print("Masukkan Jenis Kelamin Sapi (jantan/betina): ");
                String jenisKelamin = input.nextLine();
                System.out.print("Masukkan usia Sapi: ");
                int usia = input.nextInt();
                input.nextLine();

                Sapi sapi = new Sapi(namaSapi, usia, jenisKelamin);
                Peternakan.tambahSapi(sapi,peternakan.hitungSapi());
            } else if (pilihan == 3) {
                peternakan.lihatPeternakan();
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
            } else if (pilihan == 5) {
                System.out.println("Pilihan tidak tersedia!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}