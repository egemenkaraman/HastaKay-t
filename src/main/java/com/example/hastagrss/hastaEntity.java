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

    @Column(name ="dogum_tarihi")
    private String dogumtarihi;

    @Column(name ="cinsiyet")
    private String cinsiyet;

    @Column(name ="telefon")
    private String telefon;

    @Column(name ="mail")
    private String mail;

    @Column(name ="adres")
    private String adres;

    @Column(name ="kayit_tarihi")
    private String kayit_tarihi;

    @Column(name ="kimlik")
    private String kimlik;

    public hastaEntity(){

    }

    public hastaEntity(Integer id, String isim, String soyisim, String doğumtarihi, String cinsiyet, String telefon, String mail, String adres, String kayıt_tarihi, String kimlik){
        this.id=id;
        this.isim=isim;
        this.soyisim=soyisim;
        this.dogumtarihi=doğumtarihi;
        this.cinsiyet=cinsiyet;
        this.telefon=telefon;
        this.mail=mail;
        this.adres=adres;
        this.kayit_tarihi=kayıt_tarihi;
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

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
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

    public String getKayit_tarihi() {
        return kayit_tarihi;
    }

    public void setKayit_tarihi(String kayit_tarihi) {
        this.kayit_tarihi = kayit_tarihi;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }
}
