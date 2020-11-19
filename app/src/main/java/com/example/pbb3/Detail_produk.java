package com.example.pbb3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_produk extends AppCompatActivity {

    ImageView gambarproduk;
    TextView judul, harga, deskripsi;
    EditText jumlah;
    Button min, plus;
    int value = 1;
    Integer harga_produk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);

        gambarproduk = findViewById(R.id.gambarproduk);
        judul = findViewById(R.id.namaproduk);
        harga = findViewById(R.id.harga_view);
        deskripsi = findViewById(R.id.deskripsi);
        jumlah = findViewById(R.id.text_number);
        jumlah.setFilters(new InputFilter[]{new MinMax("1" , "12")});
        min = findViewById(R.id.min);
        plus = findViewById(R.id.plus);

        min.setEnabled(false);

        getIncomingExtra();
    }

    private  void getIncomingExtra(){
        if (getIntent().hasExtra("gambar") && getIntent().hasExtra("judul") && getIntent().hasExtra("harga") && getIntent().hasExtra("deskripsi")){
            Integer gambar = getIntent().getIntExtra("gambar", 0);
            String judul = getIntent().getStringExtra("judul");
            harga_produk = getIntent().getIntExtra("harga", 0);
            String deskripsi = getIntent().getStringExtra("deskripsi");

            setdata(gambar, judul, harga_produk, deskripsi);
        }
    }

    private void setdata(int gambar, String judul, Integer harga, String deskripsi){
        this.gambarproduk.setImageResource(gambar);
        this.judul.setText(judul);
        this.harga.setText("" + harga);
        this.deskripsi.setText(deskripsi);
    }


    public void minus(View view) {
        if(value == 1){
            min.setEnabled(false);
        }else{
            min.setEnabled(true);
            plus.setEnabled(true);
            value = value - 1;
            Integer harga_awal = harga_produk * value;
            this.harga.setText("" + harga_awal);
            display(value);
        }
    }

    public void plus(View view) {
        if (value == 12){
            plus.setEnabled(false);
        }else {
            plus.setEnabled(true);
            min.setEnabled(true);
            value = value + 1;
            Integer harga_awal = harga_produk * value;
            this.harga.setText("" + harga_awal);
            display(value);
        }

    }
    private void display(int number) {
        jumlah.setText("" + number);
    }
}