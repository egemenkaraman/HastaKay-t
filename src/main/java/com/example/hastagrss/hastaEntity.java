package com.example.hastagrss;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hastakayıt")
public class hastaEntity {
    @Id
    @Column(name ="id")
    private Integer id;

    @Column(name ="isim")
    private String isim;

    @Column(name ="soyisim")
    private String soyisim;

    @Column(name ="doğum_tarihi")
    private Integer doğumtarihi;

    @Column(name ="cinsiyet")
    private String cinsiyet;

    @Column(name ="telefon")
    private Integer telefon;

    @Column(name ="mail")
    private String mail;

    @Column(name ="adres")
    private String adres;

    @Column(name ="kayıt_tarihi")
    private Integer kayıt_tarihi;

    @Column(name ="kimlik")
    private Integer kimlik;

    public hastaEntity(){

    }

    public hastaEntity(Integer id, String isim, String soyisim, Integer doğumtarihi, String cinsiyet, Integer telefon, String mail, String adres, Integer kayıt_tarihi, Integer kimlik){
        this.id=id;
        this.isim=isim;
        this.soyisim=soyisim;
        this.doğumtarihi=doğumtarihi;
        this.cinsiyet=cinsiyet;
        this.telefon=telefon;
        this.mail=mail;
        this.adres=adres;
        this.kayıt_tarihi=kayıt_tarihi;
        this.kimlik=kimlik;
    }





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Integer getDoğumtarihi() {
        return doğumtarihi;
    }

    public void setDoğumtarihi(Integer doğumtarihi) {
        this.doğumtarihi = doğumtarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getKayıt_tarihi() {
        return kayıt_tarihi;
    }

    public void setKayıt_tarihi(Integer kayıt_tarihi) {
        this.kayıt_tarihi = kayıt_tarihi;
    }

    public Integer getKimlik() {
        return kimlik;
    }

    public void setKimlik(Integer kimlik) {
        this.kimlik = kimlik;
    }
}
