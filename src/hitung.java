class Persegipanjang {
    private double panjang,luas,lebar,keliling,Luasbagi;

    public Persegipanjang(){
        this.panjang = 0;
        this.lebar = 0;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void  setLebar(double lebar){
        this.lebar = lebar;
    }
    public void setLuas(double luas){
        this.luas = luas;
    }
    public void setKeliling(double keliling){
        this.keliling = keliling;
    }
    public double getPanjang(double panjang){
        return panjang;
    }
    public double getLebar(double luas){
        return lebar;
    }
    public void hitungLuas(){
        this.luas = this.panjang * this.lebar;
    }
    public void hitungKeliling(){
        this.keliling = 2 *(this.panjang + this.lebar);
    }

    public double luaBagi(){
        return this.luas /4 ;
    }
    public void tampilHasil(){
        this.hitungKeliling();
        this.hitungLuas();
        this.Luasbagi = this.luaBagi();

        System.out.println();
        System.out.println("Luas persegi panjang:" + luas);
        System.out.println("Keliling persegi panjang :" + keliling);
        System.out.println("Luas bagi  :" + luaBagi());

    }
}

public class hitung {
    public static void main(String[] args) {
        Persegipanjang persegipanjang = new Persegipanjang();

        System.out.println();
        System.out.println("panjang : " +persegipanjang.getPanjang(12));
        System.out.println("lebar   :" +persegipanjang.getPanjang(10));


        persegipanjang.setPanjang(12);
        persegipanjang.setLebar(10);
        persegipanjang.tampilHasil();


    }
}
