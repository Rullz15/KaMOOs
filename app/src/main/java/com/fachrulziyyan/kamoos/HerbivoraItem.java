package com.fachrulziyyan.kamoos;

public class HerbivoraItem {
    private String title;
    private String description;
    private int imageResId;
    private int soundResId; // Tambahkan ini untuk suara

    public HerbivoraItem(String title, String description, int imageResId, int soundResId) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
        this.soundResId = soundResId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getSoundResId() {
        return soundResId; // Getter untuk suara
    }
}

