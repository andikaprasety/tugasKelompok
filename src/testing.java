class Shape {
    public double getLuas() {
        return 0;
    }

    public double getKeliling() {
        return 0;
    }
}

class PersegiPanjang extends Shape {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends Shape {
    private double diameter;

    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getLuas() {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }

    @Override
    public double getKeliling() {
        return Math.PI * diameter;
    }
}

class Segitiga extends Shape {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        return sisiA + sisiB + sisiC;
    }
}

public class testing {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(4, 5);
        Lingkaran lingkaran1 = new Lingkaran(10);
        Segitiga segitiga = new Segitiga(3, 4, 5, 6, 7);

        System.out.println("");
        System.out.println("Luas dan Keliling Persegi Panjang:");
        System.out.println("Luas: " + persegiPanjang1.getLuas());
        System.out.println("Keliling: " + persegiPanjang1.getKeliling());
        System.out.println("");

        System.out.println("Luas dan Keliling Lingkaran:");
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
        System.out.println("");

        System.out.println("Luas dan Keliling Segitiga:");
        System.out.println("Luas: " + segitiga.getLuas());
        System.out.println("Keliling: " + segitiga.getKeliling());
    }
}
