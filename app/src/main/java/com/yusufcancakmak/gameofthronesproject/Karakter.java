package com.yusufcancakmak.gameofthronesproject;

public class Karakter {
    private int karakterid;
    private String karakterisim;
    private String karakteracıklama;
    private String karakterresim;

    public Karakter() {
    }

    public Karakter(int karakterid, String karakterisim, String karakteracıklama, String karakterresim) {
        this.karakterid = karakterid;
        this.karakterisim = karakterisim;
        this.karakteracıklama = karakteracıklama;
        this.karakterresim = karakterresim;
    }

    public int getKarakterid() {
        return karakterid;
    }

    public void setKarakterid(int karakterid) {
        this.karakterid = karakterid;
    }

    public String getKarakterisim() {
        return karakterisim;
    }

    public void setKarakterisim(String karakterisim) {
        this.karakterisim = karakterisim;
    }

    public String getKarakteracıklama() {
        return karakteracıklama;
    }

    public void setKarakteracıklama(String karakteracıklama) {
        this.karakteracıklama = karakteracıklama;
    }

    public String getKarakterresim() {
        return karakterresim;
    }

    public void setKarakterresim(String karakterresim) {
        this.karakterresim = karakterresim;
    }
}
