package com.example.gojekaqil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class go_mart : AppCompatActivity() {
    private lateinit var dataDiterima : TextView

    companion object{
        const val EXTRA_NAMA        = "extra_nama"
        const val EXTRA_JUMLAH      = "extra_jumlah"
        const val EXTRA_ALAMAT      = "extra_alamat"
        const val EXTRA_NAMA_BARANG = "extra_nama_barang"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_mart)
        dataDiterima = findViewById(R.id.data_diterima)

        val nama       = intent.getStringExtra(go_mart.EXTRA_NAMA)
        val alamat     = intent.getStringExtra(go_mart.EXTRA_ALAMAT)
        val namaBarang = intent.getStringExtra(go_mart.EXTRA_NAMA_BARANG)
        val jumlah     = intent.getIntExtra(go_mart.EXTRA_JUMLAH, 1)

        val text = " Nama : $nama \n Alamat : $alamat \n " +
                "Nama Barang : $namaBarang \n Jumlah : $jumlah"

        dataDiterima.text = text
    }
}
