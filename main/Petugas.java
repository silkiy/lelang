package main;

import java.util.ArrayList;

public class Petugas implements  User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    Petugas(){
        this.namaPetugas.add("Sikil");
        this.alamat.add("Tulungagung");
        this.telepon.add("083526456731");
    }

    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }


    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
