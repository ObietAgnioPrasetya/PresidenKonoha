package com.example.presidenkonoha


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profil_presidenkonoha.*

class Profilpresidenkonoha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_presidenkonoha)

        val bundle:Bundle?=intent.extras
        val gambar = bundle!!.get("imgPresidenKonoha") as Int
        val nama=bundle.get("txtJudul") as String
        val deskripsi=bundle.get("txtDeskripsi") as String

        fotoPresidenKonoha.setImageResource(gambar)
        namaPresidenKonoha.text=nama
        detailPresidenKonoha.text=deskripsi

    }
}
