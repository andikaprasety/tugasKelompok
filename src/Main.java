
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jurusan, Kelas ,Nama ,Kelompok;

        System.out.print("Masukan Jurusan Kamu : ");
        jurusan = input.nextLine();

        System.out.print("Masukan Nama Kamu : ");
        Nama = input.nextLine();

        System.out.print("Masukan Kelompok Kamu : ");
        Kelompok = input.nextLine();

        System.out.print("Masukan Kelas Kamu : ");
        Kelas = input.nextLine();

        System.out.println("***** UNIVERSITAS SATYA TERRA BHINNEKA ******");
        System.out.println("=========================================");
        System.out.println("Pratikum 1 : Programan Beriorentasi object");
        System.out.println("Jurusan :"+jurusan);
        System.out.println("Kelompok :"+Kelompok);
        System.out.println("Kelas : "+ Kelas);
        System.out.println("Nama : " + Nama);
    }
}