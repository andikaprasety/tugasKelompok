class orang {
    private String nama,jeniskelamin,noHp;

    public orang(String nama , String jeniskelamin , String noHp){
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.noHp = noHp;
    }

    public void Ceknama(){
        System.out.println("Nama :" +this.nama);
        System.out.println("Jenis Kelamin :" +this.jeniskelamin);
        System.out.println("No. Hp :" +this.noHp);
    }
}

class mahasiswaa extends orang {
    private String nim;

    public mahasiswaa(String nim,String nama, String jeniskelamin,String noHp ){
        super(nama,jeniskelamin,noHp);
        this.nim = nim;
    }
    @Override
    public void Ceknama(){
        System.out.println("\n Perkenalan mahasiswa");
        System.out.println("-------------------");
        super.Ceknama();
        System.out.println("Nim :" + this.nim);
        System.out.println();

    }
}
class  Dosen extends orang {
    private String  nidn;


    public  Dosen(String nidn,String nama, String jeniskelamin,String noHp ){
        super(nama,jeniskelamin,noHp);
        this.nidn = nidn;
    }
    @Override
    public void Ceknama(){
        System.out.println("\n Perkenalan Dosen");
        System.out.println("-------------------");
        super.Ceknama();
        System.out.println("Nidn : "+ this.nidn);
    }

}
class  Tendik extends orang {
    private String  nidk;


    public  Tendik(String nidk,String nama, String jeniskelamin,String noHp ){
        super(nama,jeniskelamin,noHp);
        this.nidk = nidk;
    }
    @Override
    public void Ceknama(){
        System.out.println("\n Perkenalan Tendik");
        System.out.println("-------------------");
        super.Ceknama();
        System.out.println("Nidk : "+ this.nidk);
    }

}



public class contoh {
    public static void main(String[] args) {
       String nidn,nmDosen,JkDosen,NoDosen;
       nidn = "323232323";
       nmDosen = "Andre Pratama, S.kom, M.kom";
       JkDosen = "Laki-laki";
       NoDosen = "08**********";

       Dosen dosen1 = new Dosen(nidn,nmDosen,JkDosen,NoDosen);

        String nis,nmsiswa,Jksiswa,Nosiswa;
        nis = "323232323";
        nmsiswa = "Andika Prasetyo";
        Jksiswa = "Laki-laki";
        Nosiswa = "08**********";

        mahasiswaa mahasiswa1 = new mahasiswaa(nis,nmsiswa,Jksiswa,Nosiswa);
        String nidk,nmdk,Jkdk,Nodk;
        nidk = "323232323";
        nmdk = "Nendi Wulandari";
        Jkdk = "Perempuan";
        Nodk = "08**********";
        Tendik tendik = new Tendik(nidk,nmdk,Jkdk,Nodk);

        tendik.Ceknama();
        mahasiswa1.Ceknama();
        dosen1.Ceknama();
    }
}
