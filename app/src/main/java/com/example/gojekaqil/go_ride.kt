package com.example.gojekaqil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class go_ride : AppCompatActivity() {
    private lateinit var dataDiterima : TextView

    companion object{
        const val EXTRA_NAMA          = "extra_nama"
        const val EXTRA_ALAMAT        = "extra_alamat"
        const val EXTRA_ALAMAT_TUJUAN = "extra_alamat_tujuan"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_ride)
        dataDiterima = findViewById(R.id.data_diterima)

        val nama          = intent.getStringExtra(go_ride.EXTRA_NAMA)
        val alamat        = intent.getStringExtra(go_ride.EXTRA_ALAMAT)
        val alamatTujuan  = intent.getStringExtra(go_ride.EXTRA_ALAMAT_TUJUAN)

        val text = " Nama : $nama \n Alamat : $alamat \n Alamat Tujuan : $alamatTujuan"

        dataDiterima.text = text
    }
}
