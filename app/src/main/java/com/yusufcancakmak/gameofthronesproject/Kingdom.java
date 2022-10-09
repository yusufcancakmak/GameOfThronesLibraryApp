package com.yusufcancakmak.gameofthronesproject;

public class Kingdom {
    private int kingom_id;
    private String kingdomAd;
    private String kingdomAcıklama;
    private String kingdomResim;

    public Kingdom() {
    }

    public Kingdom(int kingom_id, String kingdomAd, String kingdomAcıklama, String kingdomResim) {
        this.kingom_id = kingom_id;
        this.kingdomAd = kingdomAd;
        this.kingdomAcıklama = kingdomAcıklama;
        this.kingdomResim = kingdomResim;
    }

    public int getKingom_id() {
        return kingom_id;
    }

    public void setKingom_id(int kingom_id) {
        this.kingom_id = kingom_id;
    }

    public String getKingdomAd() {
        return kingdomAd;
    }

    public void setKingdomAd(String kingdomAd) {
        this.kingdomAd = kingdomAd;
    }

    public String getKingdomAcıklama() {
        return kingdomAcıklama;
    }

    public void setKingdomAcıklama(String kingdomAcıklama) {
        this.kingdomAcıklama = kingdomAcıklama;
    }

    public String getKingdomResim() {
        return kingdomResim;
    }

    public void setKingdomResim(String kingdomResim) {
        this.kingdomResim = kingdomResim;
    }
}
