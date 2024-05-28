class  kecepatan {
    private String nobk;
    private int waktutempuh, jaraktempuh;

    public kecepatan(String nomor){
        this.nobk = nomor;
    }
    public void SetWaktu(int waktu){
        this.waktutempuh = waktu;
    }
    public void  Setjarak(int jarak){
        this.jaraktempuh = jarak;
    }

    public int getJaraktempuh() {
        return jaraktempuh;
    }

    public int getWaktutempuh() {
        return waktutempuh;
    }
    public float hitKecepatan(){
        return (float) (this.jaraktempuh * 1000) / this.waktutempuh;
    }
    public void cthkecepatan(){
        System.out.println("Kecepatan : " + this.hitKecepatan() + " m/s");
    }
}
public class praktik4 {
    public static void main(String[] args) {
        kecepatan kendaraan = new  kecepatan("BK 1234 tb");
        kendaraan.SetWaktu(9750);
        kendaraan.Setjarak(150);
        System.out.println("Waktu Tempuh : " + kendaraan.getWaktutempuh());
        System.out.println("Jarak Tempuh : " + kendaraan.getJaraktempuh());

        kendaraan.cthkecepatan();
    }
}
