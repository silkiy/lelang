package main;

import java.util.ArrayList;
// import java.util.Random;
import java.util.Random;

public class Barang implements Item {
    Random random = new Random();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        addBarang(0, 0, "Barang Default00");
        addBarang(1, 4000000, "SEPATU ADIDAS 4DFWD X PARLEY");
        addBarang(2, 2300000, "Sepatu Harden Vol. 6");
        addBarang(3, 1200000, "SEPATU X9000L1");
        // addBarang(4, 4000000, "SEPATU ADIDAS 4DFWD X PARLEY");
        // addBarang(5, 2300000, "Sepatu Harden Vol. 6");
        // addBarang(6, 1200000, "SEPATU X9000L1");
    }

    public void addBarang(int id, int harga, String namaBarang) {
        setId(id);
        setHarga(harga);
        setNamaBarang(namaBarang);
        setStatus(true);
        // setStatus(false);
        // boolean randomStatus = random.nextInt(2) == 0;
        // setStatus(randomStatus);

    }

    public void checkBarang() {
        boolean temp = true;
        for (boolean check : status) {
            if (check == true) {
                temp = false;
            }
            if (temp) {
                System.out.println("Barang lelang tidak ada \nProgram akan berhenti");
                throw new Error();
            }
        }
    }

    public void setId(int id) {
        this.idBarang.add(id);
    }

    @Override
    public void setHarga(int harga) {
        this.hargaAwal.add(harga);
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public void editStatus(int index, boolean status) {
        this.status.set(index, status);
    }

    @Override
    public int getId(int index) {
        return this.idBarang.get(index);
    }

    @Override
    public int getHarga(int index) {
        return this.hargaAwal.get(index);
    }

    public String getNamaBarang(int index) {
        return this.namaBarang.get(index);
    }

    public boolean getStatus(int index) {
        return this.status.get(index);
    }

    public int getBarang() {
        return this.namaBarang.size();
    }

}