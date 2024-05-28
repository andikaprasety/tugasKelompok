class mahasiswa{
    private String nim,nama,prodi;

    public mahasiswa(String nim){
        this.nim = nim;
    }
    public void setNim(String nim1 ){
        this.nim = nim1;
    }
    public String getNim(){
        return nim;
    }
    public void setNama(String nama1){
        this.nama = nama1;
    }
    public String getNama(){
        return nama;
    }
    public void setProdi(String prodi1){
        this.prodi = prodi1;
    }
    public String getProdi(){
        return prodi;
    }
    public mahasiswa(String nim,String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi= prodi;
    }
    public void CetakKeterangan(){
     System.out.println("Nim : " + nim);
     System.out.println("Nama : " + nama);
     System.out.println("Program Prodi : " + prodi);
    }
}
public class tugas4 {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("2303310917");
        System.out.println("Mahasiswa 1");
        mahasiswa1.CetakKeterangan();

        mahasiswa mahasiswa2 = new mahasiswa("2303310917","Bambang Satria","informatika");
        System.out.println();
        System.out.println("Mahasiswa 2");
        mahasiswa2.CetakKeterangan();

        mahasiswa mahasiswa3 = new mahasiswa("2303310917");
        System.out.println();
        mahasiswa3.setNama("Andika Prasetyo");
        mahasiswa3.setProdi("Informatika");
        System.out.println("Mahasiswa 1");
        mahasiswa3.CetakKeterangan();
    }
}
