package com.example.presidenkonoha


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var listPresidenKonoha= ArrayList<PresidenKonoha>()
    var adapter:Adapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listPresidenKonoha.add(
            PresidenKonoha("Hashirama Senju","Presiden Konoha ke-1.",R.drawable.hashirama)
        )
        listPresidenKonoha.add(
            PresidenKonoha("Tobirama Senju","Presiden Konoha ke-2.",R.drawable.tobirama)
        )
        listPresidenKonoha.add(
            PresidenKonoha("Sarutobi Senju","Presiden ke-3.",R.drawable.sarutobi)
        )
        listPresidenKonoha.add(
            PresidenKonoha("Minato Namikaze","Presiden Konoha ke-4.",R.drawable.minato)
        )
        listPresidenKonoha.add(
            PresidenKonoha("Tsunade Senju","Presiden Konoha ke-5.",R.drawable.tsunade)
        )
        listPresidenKonoha.add(
            PresidenKonoha("Hatake Kakashi","Presiden Konoha ke-6.",R.drawable.kakashi)
        )
        listPresidenKonoha.add(
            PresidenKonoha("Uzumaki Naruto","Presiden Konoha ke-7.",R.drawable.naruto)
        )
        adapter= Adapter(listPresidenKonoha, this)
        listview.adapter=adapter
    }
}