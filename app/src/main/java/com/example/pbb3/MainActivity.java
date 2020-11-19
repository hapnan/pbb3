package com.example.pbb3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView kopirecycle;
    private ArrayList<ItemAdapter> mlist = new ArrayList<>();
    private adapter kopiadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addList();
        adapter();


    }
    private void init(){
        kopirecycle = findViewById(R.id.recycle_view);
    }
    private void addList(){
        mlist = new ArrayList<>();
        mlist.add(new ItemAdapter(R.drawable.kopiacehgayo, "Kopi Aceh Gayo", 100000, "Sudah sejak lama Aceh dikenal sebagai salah satu pemasok biji kopi arabika terbesar di Indonesia. Kopi Aceh Gayo biasanya dipanen di daerah dataran tinggi seperti Kabupaten Bener Meriah dan Gayo Lues.\n" +
                "\n" +
                "Cita rasanya yang tidak terlalu pekat dengan kadar keasaman seimbang, membuat salah satu jenis-jenis kopi Indonesia ini banyak digemari, bahkan bagi mereka yang tergolong bukan penyuka kopi asam.\n" +
                "\n" +
                "Umumnya, karakter rasa Kopi Gayo ini tidak jauh berbeda dengan jenis-jenis kopi Indonesia lainnya, seperti Kopi Sumatera. Hanya saja Kopi Gayo memiliki aftertaste atau rasa yang tertinggal di mulut setelah mencicipi kopi, cenderung lebih bersih. Sehingga kopi ini paling sering digunakan sebagai kopi house blend di berbagai kedai kopi kekinian.\n" +
                "\n" +
                "Namun, baru-baru ini beredar kabar yang kurang mengenakan, dimana komoditas Kopi Aceh Gayo mendapat penolakan dari beberapa negara Eropa. Penyebabnya karena kopi tersebut diketahui mengandung zat kimia berbahaya glyphosate.\n" +
                "\n" +
                "Sayangnya hingga berita ini diterbitkan, belum ada kejelasan pasti mengenai nasib Kopi Aceh Gayo, apakah benar memang mengandung glyphosate atau hanya permainan licik di pasar untuk menjatuhkan salah satu jenis-jenis kopi di Indonesia yang mendunia ini."));
        mlist.add(new ItemAdapter(R.drawable.kopikintamani, "Kopi kintamani", 120000 , "Jenis-jenis kopi Indonesia lainnya yang tak kalah menggugah selera adalah Kopi Kintamani Bali. Kopi ini berasal dari kawasan Kintamani, tepatnya pada ketinggian 900 mdpl.\n" +
                "\n" +
                "Kopi Kintamani termasuk dalam jenis kopi arabika dengan tingkat keasaman yang jauh lebih rendah dibandingkan kopi robusta. Aroma jeruk dan sedikit rasa pahit dari jenis-jenis kopi Indonesia yang satu ini, membuatnya tampak berbeda dari jenis arabika lainnya. Muasal dari aroma jeruk tersebut muncul karena dulu petani Kopi Kintamani menanamnya berdekatan dengan kebun jeruk.\n" +
                "\n" +
                "Bagi masyarakat Bali, cita rasa dari Kopi Kintamani diibaratkan bagai roda kehidupan manusia, yang mana harus merasakan pahit terlebih dulu kemudian merasakan manisnya sebuah pencapaian hidup. Salah satu jenis-jenis kopi Indonesia ini sudah banyak diekspor ke berbagai negara, salah satunya Amerika Serikat sejak tahun 1825 silam."));
        mlist.add(new ItemAdapter(R.drawable.kopitoraja, "Kopi toraja",300000, "Kopi Toraja merupakan salah satu jenis-jenis kopi Indonesia yang terkenal akan warna pekat dari biji kopinya dengan bentuk tidak beraturan. Sehingga bila disandingkan dengan berbagai jenis kopi lainnya di Indonesia, kamu pasti akan dengan mudahnya mengenali biji Kopi Toraja.\n" +
                "\n" +
                "Kopi yang memiliki nama latin Celeber Kalosi ini cenderung memiliki aftertaste tidak terlalu pahit dan justru terasa seperti buah. Tidak hanya itu saja, Kopi Toraja asli Sulawesi juga memiliki aroma harum yang menyengat karena proses penanamannya berdampingan dengan tanaman rempah di sekitar kawasan Tanah Toraja.\n" +
                "\n" +
                "Kini, salah satu jenis-jenis kopi Indonesia ini sudah banyak diekspor ke Jepang dan Amerika Serikat. Bahkan saking populernya di mata dunia, Kopi Toraja telah dipatenkan oleh Key Coffee, sebuah perusahaan kopi ternama asal Jepang yang menjualnya dengan nama produk yaitu Toarco Toraja."));
        mlist.add(new ItemAdapter(R.drawable.kopiliberika,"Kopi Liberika",400000, "Sebagian dari kita mungkin masih asing dengan nama Kopi Liberika Rangsang Meranti. Betapa tidak, kopi yang berasal dari salah satu desa di Kabupaten Meranti, Provinsi Riau ini memang masih kalah pamor dibandingkan dengan Kopi Gayo.\n" +
                "\n" +
                "Namun asal tahu saja, salah satu jenis-jenis kopi Indonesia ini justru lebih dikenal di negara tetangga seperti Malaysia. Kopi Liberika Rangsang Meranti memiliki bentuk biji yang berukuran lebih besar ketimbang biji kopi arabika dan robusta.\n" +
                "\n" +
                "Ketebalan biji Kopi Liberika Rangsang Meranti ini membuatnya dapat disimpan dalam waktu lama dan memiliki kandungan kafein lebih rendah. Sehingga aman dikonsumsi untuk lambung, meski porsinya tetap harus dibatasi.\n" +
                "\n" +
                "Keunikan lainnya dari Kopi Liberika Rangsang Meranti adalah jenis kopi yang satu ini mampu tumbuh di tanah gambut. Padahal kebanyakan jenis-jenis kopi Indonesia sendiri tidak bisa ditanam di tanah gambut karena tingkat keasamannya yang tinggi."));
    }
    private void adapter(){
        kopiadapter = new adapter(mlist, this);
        kopirecycle.setLayoutManager(new LinearLayoutManager(this));
        kopirecycle.setAdapter(kopiadapter);
        kopiadapter.notifyDataSetChanged();
    }

}