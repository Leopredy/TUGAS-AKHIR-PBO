public class tamu extends pengguna{
    private ini sisaMasaAktif;


    public void menambahMasaAktif(int tambahan){
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;

    }


    public void hapus(){
        system.out.prinln("DELETE FROM pengguna WHERE X STATUS= 'TAMU'");

    }


    public void login(){
        system.out.prinln("LOGIN SEBAGAI TAMU")
        
    }
}