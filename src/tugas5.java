import java.util.Scanner;

class lingkaran {
    private double diameter;

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double hitungLuas() {
        double radius = diameter / 2;
        double phi = (diameter % 7 == 0) ? 22.0 / 7 : 3.14;
        return phi * radius * radius;
    }

    public double hitungKeliling() {
        double radius = diameter / 2;
        double phi = (diameter % 7 == 0) ? 22.0 / 7 : 3.14;
        return 2 * phi * radius;
    }
}

public class tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lingkaran lingkaran = new lingkaran();

        System.out.print("Masukkan diameter lingkaran: ");
        double diameter = scanner.nextDouble();
        lingkaran.setDiameter(diameter);

        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
    }
}
