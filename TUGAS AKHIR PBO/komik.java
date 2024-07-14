public class pengguna{


    public void hapus(){
        system.out.println("DELETE FROM pengguna");

    }

    public void hapus(int id){
        system.out.println("DELETE FROM pengguna WHERE ID=" + id);

    }


    public void hapus(string username){
        system.out.println("DELETE FROM pengguna WHERE username=" + username);

    }


    public void login(){
        system.out.println("ini method untuk login");

    }


    public void login(string tokenGoogle){
        system.out.println("ini login menggunakan google");
        
    }
}