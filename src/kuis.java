
import java.util.Scanner;
class Kendaraan {
    public String platKendaraan;

    public Kendaraan(String platKendaraan) {
        this.platKendaraan = platKendaraan;
    }

    public void cetak() {
        System.out.println("Plat Kendaraan: " + platKendaraan);
    }
}

class Mobil extends Kendaraan {
    private int lamaParkir;

    public Mobil(String platKendaraan, int lamaParkir) {
        super(platKendaraan);
        this.lamaParkir = lamaParkir;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Lama Parkir: " + lamaParkir + " jam");
    }
}

class Motor extends Kendaraan {
    private int lamaParkir;

    public Motor(String platKendaraan, int lamaParkir) {
        super(platKendaraan);
        this.lamaParkir = lamaParkir;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Lama Parkir: " + lamaParkir + " jam");
    }
}

// Kelas Mall
class mall {
    private static int jumlahKendaraan;
    private static Kendaraan[] parkiranMobil;
    private static Kendaraan[] parkiranMotor;

    public mall() {
        jumlahKendaraan = 0;
        parkiranMobil = new Kendaraan[100];
        parkiranMotor = new Kendaraan[100];
    }

    public static void tambahMobil(Mobil mobil) {
        parkiranMobil[jumlahKendaraan] = mobil;
        jumlahKendaraan++;
    }

    public static void tambahMotor(Motor motor) {
        parkiranMotor[jumlahKendaraan] = motor;
        jumlahKendaraan++;
    }

    public void lihatParkiranMall() {
        System.out.println("Jumlah Kendaraan: " + jumlahKendaraan);
        System.out.println("Parkiran Mobil:");
        for (int i = 0; i < jumlahKendaraan; i++) {
            if (parkiranMobil[i] != null) {
                parkiranMobil[i].cetak();
            }
        }
        System.out.println("Parkiran Motor:");
        for (int i = 0; i < jumlahKendaraan; i++) {
            if (parkiranMotor[i] != null) {
                parkiranMotor[i].cetak();
            }
        }
    }
}


public class kuis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mall mall1 = new mall();

        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Tambah Motor");
            System.out.println("3. Lihat Parkiran Mall");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama ayam: ");
                String namaayam = input.nextLine();
                System.out.print("Masukkan Lama Parkir Mobil (jam): ");
                int lamaParkirMobil = input.nextInt();
                input.nextLine();

                Mobil mobil = new Mobil(namaayam, lamaParkirMobil);
                mall.tambahMobil (mobil);
            } else if (pilihan == 2) {
                System.out.print("Masukkan Plat Nomor Motor: ");
                String platMotor = input.nextLine();
                System.out.print("Masukkan Lama Parkir Motor (jam): ");
                int lamaParkirMotor = input.nextInt();
                input.nextLine(); // Clear the scanner buffer

                Motor motor = new Motor(platMotor, lamaParkirMotor);
                mall1.tambahMotor(motor);
            } else if (pilihan == 3) {
                mall1.lihatParkiranMall();
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}