package com.example.son;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

public class HelloController {

    @FXML
    private Label komisyonTutari, karYuzdesiAlis, KarYuzdesiSatis, KdvTL, alisKdvTL, kargom, netKar, onerilenFiyat, maliyet, kdvsizKar, digerGiderler, bedel, kdvsizKarYuzdesiAlis ,kdvsizKarYuzdesiSatis ;
    @FXML
    private TextField komisyonOrani, alisFiyati, satisFiyati, giderler, alisKdvOrani, hizmetBedeli, satisKdvOrani, kargo, gelisFiyati , istenilenKar ;

    @FXML
    private Button button, karHesabi,  oto;


    double satisFiyatid,  alisFiyatid,  trendyolKomisyond,  kargod;
    double giderlerd,  alisKdvd,  hizmetBedelid,  kdvd;


   public void oto (ActionEvent event){
       komisyonOrani.setText(String.valueOf(18));
       alisKdvOrani.setText(String.valueOf(18));
       satisKdvOrani.setText(String.valueOf(20));
       giderler.setText(String.valueOf(5));
       hizmetBedeli.setText(String.valueOf(5));
       kargo.setText("otomatik dolacaktir");
   }




    public void action(ActionEvent event){

        satisFiyatid= Double.parseDouble(satisFiyati.getText());
        alisFiyatid= Double.parseDouble(alisFiyati.getText());
        trendyolKomisyond= Double.parseDouble(komisyonOrani.getText());
        giderlerd= Double.parseDouble(giderler.getText());
        alisKdvd= Double.parseDouble(alisKdvOrani.getText());
        hizmetBedelid = Double.parseDouble(hizmetBedeli.getText());
        kdvd = Double.parseDouble(satisKdvOrani.getText());


        if (!kargo.getText().equals("otomatik dolacaktir")  && (Double.parseDouble(kargo.getText()) != 17 || Double.parseDouble(kargo.getText()) != 31 || Double.parseDouble(kargo.getText()) != 40)  ){
            kargod = Double.parseDouble(kargo.getText());
        }
        else if (satisFiyatid < 90) {
            kargod = 17;
            kargo.setText(String.valueOf(16));
        }else if (90 <= satisFiyatid && satisFiyatid <150){
            kargod = 31;
        kargo.setText(String.valueOf(35));}
        else {
            kargod = 40;
            kargo.setText(String.valueOf(40));
        }
        Hesap hesap = new Hesap( satisFiyatid,  alisFiyatid,  trendyolKomisyond,  kargod,
         giderlerd,  alisKdvd,  hizmetBedelid,  kdvd);


        komisyonTutari.setText(String.format("%.2f", hesap.getKomisyon())+ " TL");
        karYuzdesiAlis.setText("%" + String.format("%.2f", hesap.getKarYuzdesiAlis()));
        KarYuzdesiSatis.setText("%" + String.format("%.2f",hesap.getKarYuzdesiSatis()));
        KdvTL.setText(String.format("%.2f",hesap.getKdvTL())+ " TL");
        alisKdvTL.setText(String.format("%.2f",hesap.getAlisKdvTL())+ " TL");
        kargom.setText(String.format("%.2f",hesap.getKargo())+ " TL");
        netKar.setText(String.format("%.2f",hesap.getNetKar())+ " TL");
        maliyet.setText(String.format("%.2f",hesap.getFiyat())+ " TL");
        kdvsizKar.setText(String.format("%.2f",hesap.getKar())+ " TL");
        digerGiderler.setText(String.format("%.2f",hesap.getGiderler())+ " TL");
        bedel.setText(String.format("%.2f",hesap.getHizmetBedeli())+ " TL");
        kdvsizKarYuzdesiSatis.setText("%" +String.format("%.2f",hesap.getKdvsizKarYuzdesiSatis()) );
        kdvsizKarYuzdesiAlis.setText("%" +String.format("%.2f",hesap.getKdvsizKarYuzdesiAlis()));


    }

    public void fiyatHesapla(ActionEvent event){
        Hesap hesap = new Hesap();

        onerilenFiyat.setText(hesap.satisFiyati(Double.parseDouble(gelisFiyati.getText()), Double.parseDouble(istenilenKar.getText()))+ " TL");
        komisyonTutari.setText(String.format("%.2f", hesap.getKomisyon())+ " TL");
        karYuzdesiAlis.setText("%" + String.format("%.2f", hesap.getKarYuzdesiAlis()));
        KarYuzdesiSatis.setText("%" + String.format("%.2f",hesap.getKarYuzdesiSatis()));
        KdvTL.setText(String.format("%.2f",hesap.getKdvTL())+ " TL");
        alisKdvTL.setText(String.format("%.2f",hesap.getAlisKdvTL())+ " TL");
        kargom.setText(String.format("%.2f",hesap.getKargo())+ " TL");
        netKar.setText(String.format("%.2f",hesap.getNetKar())+ " TL");
        maliyet.setText(String.format("%.2f",hesap.getFiyat())+ " TL");
        kdvsizKar.setText(String.format("%.2f",hesap.getKar())+ " TL");
        digerGiderler.setText(String.format("%.2f",hesap.getGiderler())+ " TL");
        bedel.setText(String.format("%.2f",hesap.getHizmetBedeli())+ " TL");
        kdvsizKarYuzdesiSatis.setText("%" +String.format("%.2f",hesap.getKdvsizKarYuzdesiSatis()) );
        kdvsizKarYuzdesiAlis.setText("%" +String.format("%.2f",hesap.getKdvsizKarYuzdesiAlis()));
    }
}