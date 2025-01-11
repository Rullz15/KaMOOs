package com.fachrulziyyan.kamoos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class OmnivoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omnivora);

        // Initialize RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewOmnivora);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        OmnivoraAdapter adapter = new OmnivoraAdapter(this, getOmnivoraList()); // Context diberikan di sini
        recyclerView.setAdapter(adapter);

        // Initialize btnBack and set click listener
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(OmnivoraActivity.this, TabActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private List<OmnivoraItem> getOmnivoraList() {
        List<OmnivoraItem> list = new ArrayList<>();
        list.add(new OmnivoraItem("Ayam", "Ayam adalah hewan yang biasa kita temui di sekitar rumah atau peternakan. Ayam punya dua kaki, dua sayap, dan tubuhnya ditutupi bulu. Mereka ada yang berwarna cokelat, putih, hitam, atau bercorak warna-warni. Ayam jantan disebut ayam jago atau rooster, dan ayam betina disebut ayam betina.\n" +
                "\n" +
                "Ayam jantan sering berkokok di pagi hari dengan suara \"kukuruyuk!\" untuk membangunkan kita. Sementara ayam betina bisa bertelur. Telurnya bisa kita makan, lho! Telur ayam mengandung banyak nutrisi yang baik untuk tubuh.\n" +
                "\n" +
                "Ayam juga suka makan biji-bijian, cacing, atau sisa-sisa makanan yang kita beri. Mereka hidup di kandang atau pekarangan dan sering mencari makan dengan cara mengais tanah. Selain itu, ayam juga bisa berlari cepat dan melompat meskipun sayapnya tidak cukup besar untuk terbang jauh.\n" +
                "\n" +
                "Ayam adalah hewan yang sangat berguna bagi manusia. Selain daging dan telurnya, mereka juga membantu menjaga kebun dari serangga. Jadi, merawat ayam dengan baik itu penting!", R.drawable.ayam));
        list.add(new OmnivoraItem("Bebek", "Bebek adalah hewan yang suka berenang di air. Bebek punya paruh lebar, kaki berselaput, dan bulu yang licin. Bulunya sering berwarna cokelat, putih, hitam, atau kombinasi warna lainnya. Bebek juga punya leher yang lebih panjang dibanding ayam.\n" +
                "\n" +
                "Bebek tinggal di tempat yang dekat dengan air, seperti kolam, sungai, atau sawah. Mereka suka makan biji-bijian, serangga kecil, dan tanaman yang tumbuh di air.\n" +
                "\n" +
                "Ketika berjalan, bebek terlihat lucu karena jalannya bergoyang-goyang. Suara bebek juga khas, berbunyi \"kwek-kwek.\"\n" +
                "\n" +
                "Bebek betina bisa bertelur, dan telurnya sering diolah menjadi telur asin atau makanan lain yang lezat. Daging bebek juga bisa dimasak dan menjadi makanan favorit banyak orang.\n" +
                "\n" +
                "Bebek adalah hewan yang hebat karena bisa berenang, berjalan, dan terbang. Jadi, mereka sangat menarik untuk dipelajari dan dirawat!", R.drawable.bebek));
        list.add(new OmnivoraItem("Babi", "Babi adalah hewan yang hidup di peternakan. Tubuhnya besar, dengan hidung berbentuk bulat yang disebut moncong. Moncong babi sangat kuat dan berguna untuk menggali tanah mencari makanan. Babi punya kulit yang biasanya berwarna merah muda, cokelat, atau berbintik-bintik.\n" +
                "\n" +
                "Babi suka makan berbagai jenis makanan, seperti sayuran, biji-bijian, buah-buahan, dan sisa makanan. Mereka sering tinggal di kandang yang nyaman dengan tempat berlumpur, karena babi suka berguling di lumpur untuk mendinginkan tubuhnya.\n" +
                "\n" +
                "Babi adalah hewan yang cerdas dan bisa belajar hal-hal baru. Mereka juga sering hidup berkelompok bersama teman-temannya.\n" +
                "\n" +
                "Meskipun babi terkenal karena tubuhnya yang gemuk, mereka sebenarnya sangat aktif dan suka bermain. Babi punya peran penting di peternakan dan alam, seperti membantu memakan sisa makanan dan menjaga kebersihan lingkungan.\n" +
                "\n" +
                "Menjaga hewan seperti babi adalah tanggung jawab besar, jadi penting untuk memberi mereka makanan, tempat tinggal, dan kasih sayang yang cukup!", R.drawable.babi));
        list.add(new OmnivoraItem("Penyu", "Penyu adalah hewan yang hidup di laut dan punya cangkang keras di punggungnya. Cangkang ini melindungi tubuh penyu dari bahaya. Penyu punya empat kaki yang berbentuk seperti sirip, jadi mereka sangat pandai berenang di dalam air.\n" +
                "\n" +
                "Penyu suka tinggal di laut, tapi mereka juga naik ke darat, terutama ketika ingin bertelur. Penyu betina menggali lubang di pasir untuk meletakkan telurnya, lalu kembali ke laut. Setelah beberapa waktu, bayi penyu akan menetas dan berjalan menuju laut.\n" +
                "\n" +
                "Penyu memakan rumput laut, ubur-ubur, atau tumbuhan yang ada di laut. Mereka bisa hidup sangat lama, bahkan sampai puluhan atau ratusan tahun!\n" +
                "\n" +
                "Sayangnya, penyu sering menghadapi bahaya, seperti sampah plastik di laut dan tempat bertelurnya yang terganggu. Karena itu, kita harus menjaga laut tetap bersih dan melindungi penyu supaya mereka tetap bisa hidup dengan aman.\n" +
                "\n" +
                "Penyu adalah hewan yang luar biasa dan penting bagi ekosistem laut. Dengan menjaga mereka, kita juga membantu menjaga kehidupan di laut!", R.drawable.penyu));
        list.add(new OmnivoraItem("Gagak", "Gagak adalah burung yang warnanya hitam pekat dari kepala sampai ekor. Mereka punya paruh yang tajam dan kaki yang kuat. Suara gagak khas, berbunyi \"kraaak-kraaak,\" yang sering terdengar di pohon atau langit.\n" +
                "\n" +
                "Gagak adalah burung yang pintar. Mereka bisa mengingat wajah orang dan bahkan belajar menggunakan alat sederhana untuk mencari makanan! Makanan favorit gagak adalah biji-bijian, serangga, buah-buahan, dan sisa makanan.\n" +
                "\n" +
                "Gagak biasanya hidup di hutan, kebun, atau di kota. Mereka suka tinggal di pohon tinggi untuk membuat sarang dan mengawasi sekeliling.\n" +
                "\n" +
                "Meskipun sering dianggap burung yang seram karena warnanya gelap, sebenarnya gagak punya peran penting. Mereka membantu membersihkan lingkungan dengan memakan sisa-sisa makanan atau bangkai hewan.\n" +
                "\n" +
                "Jadi, gagak adalah burung yang pintar dan berguna. Kalau melihat gagak, kita bisa mengagumi kepintaran dan keunikannya!", R.drawable.gagak));
        return list;
    }
}
