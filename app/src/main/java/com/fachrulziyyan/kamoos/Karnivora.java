package com.fachrulziyyan.kamoos;

public class Karnivora {
    private String judul;
    private String deskripsi;
    private int gambar;

    public Karnivora(String judul, String deskripsi, int gambar) {
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

