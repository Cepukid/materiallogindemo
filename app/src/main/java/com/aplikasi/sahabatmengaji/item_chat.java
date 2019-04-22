package com.aplikasi.sahabatmengaji;

public class item_chat {
    private String gambar,Nama,isipesan;
    public item_chat(String nama,String isi,String gambar){
        this.gambar=gambar;
        this.Nama=nama;
        this.isipesan=isi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getIsipesan() {
        return isipesan;
    }

    public void setIsipesan(String isipesan) {
        this.isipesan = isipesan;
    }

}
