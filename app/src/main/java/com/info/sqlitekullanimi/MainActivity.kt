package com.info.sqlitekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vt = VeritabaniYardimcisi(this)

        //Kisilerdao().kisiEkle(vt,"Mehmet","88888",22,1.99)
        //Kisilerdao().kisiEkle(vt,"Zeynep","333",10,1.78)
        //Kisilerdao().kisiEkle(vt,"Ali","11111",35,1.50)

        //Kisilerdao().kisiGuncelle(vt,3,"Yeni Zeynep","111",100,1.22)

        //Kisilerdao().kisiSil(vt,3)

        //val sonuc = Kisilerdao().kayitKontrol(vt,"Ahmetx")
        //Log.e("Kayıt Kontrol",sonuc.toString())

        val kisi = Kisilerdao().kisiGetir(vt,4)

        if(kisi != null){

            Log.e("Kişi no 4",(kisi.kisi_no).toString())
            Log.e("Kişi ad 4",kisi.kisi_ad)
            Log.e("Kişi tel 4",kisi.kisi_tel)
            Log.e("Kişi yaş 4",(kisi.kisi_yas).toString())
            Log.e("Kişi boy 4",(kisi.kisi_boy).toString())

        }


        val kisiListe = Kisilerdao().tumKisiler(vt)

        //val kisiListe = Kisilerdao().arama(vt,"Mehmet")

        //val kisiListe = Kisilerdao().rasgeleGetir(vt)

        for(k in kisiListe){
            Log.e("Kişi no",(k.kisi_no).toString())
            Log.e("Kişi ad",k.kisi_ad)
            Log.e("Kişi tel",k.kisi_tel)
            Log.e("Kişi yaş",(k.kisi_yas).toString())
            Log.e("Kişi boy",(k.kisi_boy).toString())
        }

    }
}
