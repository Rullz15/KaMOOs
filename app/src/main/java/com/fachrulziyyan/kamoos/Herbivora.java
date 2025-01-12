package com.fachrulziyyan.kamoos;

public class Herbivora {
    private String judul;
    private String deskripsi;
    private int gambar;

    public Herbivora(String judul, String deskripsi, int gambar) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getGambar() {
        return gambar;
    }
}
