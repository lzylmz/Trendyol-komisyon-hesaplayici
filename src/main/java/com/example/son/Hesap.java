package com.example.son;


public class Hesap {

    private double satisFiyati;
    private double alisFiyati;
    private double trendyolKomisyon;
    private double komisyon;
    private double kargo;
    private double giderler;
    private double kar;
    private double alisKdv;
    private double alisKdvTL;
    private double kdv;
    private double kdvTL;
    private double netKar;
    private double fiyat;
    private  double hizmetBedeli;
    private  double karYuzdesiAlis;
    private  double karYuzdesiSatis;
    private  double kdvsizKarYuzdesiAlis;
    private double kdvsizKarYuzdesiSatis;


    public Hesap(){};
    public Hesap(double satisFiyati, double alisFiyati, double trendyolKomisyon, double kargo,
                 double giderler, double alisKdv, double hizmetBedeli, double kdv) {

        this.satisFiyati = satisFiyati;
        this.alisFiyati = alisFiyati;
        this.trendyolKomisyon = trendyolKomisyon;
        this.kargo = kargo;
        this.giderler = giderler;
        this.alisKdv = alisKdv;
        this.hizmetBedeli = hizmetBedeli;
        this.kdv = kdv;

        alisKdvTL =  alisFiyati * (alisKdv/100);
        komisyon = satisFiyati * (trendyolKomisyon/100 );
        fiyat = alisKdvTL + kargo + komisyon + giderler + hizmetBedeli + alisFiyati ;
        kar = satisFiyati - fiyat;
        kdvTL = kar * (kdv/100);
        netKar = kar - kdvTL;

        kdvsizKarYuzdesiAlis = (kar * 100) / alisFiyati;
        kdvsizKarYuzdesiSatis = (kar * 100) / satisFiyati;

        karYuzdesiAlis =  (netKar * 100) / alisFiyati;
        karYuzdesiSatis =  (netKar * 100) / satisFiyati;

    }

    public double satisFiyati(double alisFiyati, double karOrani){

        satisFiyati = alisFiyati + alisFiyati * 0.35;
        hizmetBedeli=5;
        giderler=5;


        while (karYuzdesiSatis <= karOrani ) {

            satisFiyati +=2;

            alisKdvTL =  alisFiyati * 0.18;
            komisyon = satisFiyati * 0.18;

            if ( 88 <= satisFiyati && satisFiyati < 91.89 )
                satisFiyati =89.9;
            if ( 148 <= satisFiyati && satisFiyati < 151.89 )
                satisFiyati =149.9;

            if(satisFiyati < 90 ){
                kargo = 17;
            } else if (90 <= satisFiyati && satisFiyati <150) {
                kargo = 31;
            }else
                kargo = 40;

            fiyat = alisKdvTL + kargo + 5 + 5 + komisyon + alisFiyati ;
            System.out.println("fiyat = "  + fiyat);
            System.out.println("kargo = "  + kargo);
            System.out.println("satis fiyat = "  + satisFiyati);
            kar = satisFiyati - fiyat;
            kdvTL = kar * 0.2;
            netKar = kar - kdvTL;

            karYuzdesiAlis =  (netKar * 100) / alisFiyati;
            karYuzdesiSatis =  (netKar * 100) / satisFiyati;

            kdvsizKarYuzdesiAlis = (kar * 100) / alisFiyati;
            kdvsizKarYuzdesiSatis = (kar * 100) / satisFiyati;

            System.out.println("kar yuzdesi ---====" + karYuzdesiSatis);
            System.out.println("kar orani ---====" + karOrani);


        }

        return satisFiyati;
    }

    public double getKdvsizKarYuzdesiAlis() {
        return kdvsizKarYuzdesiAlis;
    }

    public double getKdvsizKarYuzdesiSatis() {
        return kdvsizKarYuzdesiSatis;
    }

    public void setKdvsizKarYuzdesiAlis(double kdvsizKarYuzdesiAlis) {
        this.kdvsizKarYuzdesiAlis = kdvsizKarYuzdesiAlis;
    }

    public void setKdvsizKarYuzdesiSatis(double kdvsizKarYuzdesiSatis) {
        this.kdvsizKarYuzdesiSatis = kdvsizKarYuzdesiSatis;
    }

    public double getAlisKdvTL() {
        return alisKdvTL;
    }

    public void setAlisKdv(double alisKdv) {
        this.alisKdv = alisKdv;
    }

    public double getAlisKdv() {
        return alisKdv;
    }

    public double getFiyat() {
        return fiyat;
    }

    public double getHizmetBedeli() {
        return hizmetBedeli;
    }

    public void setAlisKdvTL(double alisKdvTL) {
        this.alisKdvTL = alisKdvTL;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void setHizmetBedeli(double hizmetBedeli) {
        this.hizmetBedeli = hizmetBedeli;
    }

    public double getAlisFiyati() {
        return alisFiyati;
    }

    public double getGiderler() {
        return giderler;
    }

    public double getKar() {
        return kar;
    }

    public double getKargo() {
        return kargo;
    }

    public double getKdv() {
        return kdv;
    }

    public double getKdvTL() {
        return kdvTL;
    }

    public double getKomisyon() {
        return komisyon;
    }

    public double getNetKar() {
        return netKar;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }

    public double getTrendyolKomisyon() {
        return trendyolKomisyon;
    }

    public void setAlisFiyati(double alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    public void setGiderler(double giderler) {
        this.giderler = giderler;
    }

    public void setKargo(double kargo) {
        this.kargo = kargo;
    }

    public void setKar(double kar) {
        this.kar = kar;
    }

    public void setKdv(double kdv) {
        this.kdv = kdv;
    }

    public void setKdvTL(double kdvTL) {
        this.kdvTL = kdvTL;
    }

    public void setKomisyon(double komisyon) {
        this.komisyon = komisyon;
    }

    public void setNetKar(double netKar) {
        this.netKar = netKar;
    }

    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public double getKarYuzdesiAlis() {
        return karYuzdesiAlis;
    }

    public double getKarYuzdesiSatis() {
        return karYuzdesiSatis;
    }

    public void setKarYuzdesiAlis(double karYuzdesiAlis) {
        this.karYuzdesiAlis = karYuzdesiAlis;
    }

    public void setKarYuzdesiSatis(double karYuzdesiSatis) {
        this.karYuzdesiSatis = karYuzdesiSatis;
    }

    public void setTrendyolKomisyon(double trendyolKomisyon) {
        this.trendyolKomisyon = trendyolKomisyon;
    }
}
