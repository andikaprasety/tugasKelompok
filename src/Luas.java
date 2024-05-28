import java.util.Scanner;

class Luaskeliling {
    double  panjang, lebar;

    void LuasKeliling(){
        this.panjang = 0;
        this.lebar = 0;
    }
    public void setPl(double p, double l){
        this.panjang = p;
        this.lebar = l;
    }
    public double getLuas(){
        return this.panjang * this.lebar;
    }
    public  double getKeliling(){
        return  2 * (this.panjang + this.lebar);
    }
}

public class Luas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Luaskeliling PersegiPanjang = new Luaskeliling();
        System.out.print("Masukan Panjang :");
        double panjang = input.nextDouble();
        System.out.print("Masukan Lebarnya :");
        double lebar = input.nextDouble();

        PersegiPanjang.setPl(panjang,lebar);

        System.out.println("Luas Persegi Panjang :" + PersegiPanjang.getLuas());
        System.out.println("Keliling Persegi Panjang :" + PersegiPanjang.getKeliling());

    }
}
