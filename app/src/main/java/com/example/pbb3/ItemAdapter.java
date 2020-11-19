package com.example.pbb3;

public class ItemAdapter {
    private int image;
    private String text1;
    private Integer text2;
    private String deskripsi;

    public ItemAdapter(int image, String text1, Integer text2, String deskripsi) {
        this.image = image;
        this.text1 = text1;
        this.text2 = text2;
        this.deskripsi = deskripsi;

    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public void setText1(String text) {
        this.text1 = text;
    }
    public String getText1() {
        return text1;
    }
    public void setText2(Integer text) {
        this.text2 = text;
    }
    public int getText2() {
        return text2;
    }
    public void setDeskripsi(String text) {
        this.deskripsi = text;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
}
