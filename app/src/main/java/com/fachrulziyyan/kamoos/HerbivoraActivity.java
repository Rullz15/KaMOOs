package com.fachrulziyyan.kamoos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HerbivoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbivora);

        // Initialize RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewHerbivora);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HerbivoraAdapter adapter = new HerbivoraAdapter(this, getHerbivoraList()); // Context diberikan di sini
        recyclerView.setAdapter(adapter);

        // Initialize btnBack and set click listener
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(HerbivoraActivity.this, TabActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private List<HerbivoraItem> getHerbivoraList() {
        List<HerbivoraItem> list = new ArrayList<>();
        list.add(new HerbivoraItem("Sapi","\n" +
                "Berikut adalah deskripsi untuk sapi, kelinci, jerapah, kuda, dan kambing, masing-masing dengan panjang empat paragraf:\n" +
                "\n" +
                "Sapi adalah hewan besar yang sering dijumpai di peternakan. Mereka memiliki tubuh kuat dengan leher pendek dan kepala besar. Kulit sapi biasanya berwarna cokelat, hitam, putih, atau kombinasi dari warna-warna tersebut. Sapi memiliki tanduk kecil di atas kepala dan ekor panjang dengan ujung berbulu yang mereka gunakan untuk mengusir serangga.\n" +
                "\n" +
                "Sapi adalah pemakan tumbuhan, atau herbivora. Mereka suka makan rumput, jerami, dan biji-bijian. Sapi sering menghabiskan banyak waktu makan di padang rumput. Sistem pencernaan sapi sangat unik karena memiliki empat bagian perut, yang membantu mereka mencerna makanan dengan sangat baik. Setelah makan, sapi sering terlihat duduk santai sambil mengunyah makanan mereka yang disebut \"memamah biak.\"\n" +
                "\n" +
                "Sapi adalah hewan yang sangat penting bagi manusia. Mereka menghasilkan susu yang bisa dijadikan berbagai produk, seperti keju, mentega, dan yogurt. Selain itu, sapi juga digunakan untuk membantu pekerjaan di ladang atau menarik gerobak. Mereka adalah hewan yang ramah dan sering hidup berkelompok dalam kandang atau padang rumput.\n" +
                "\n" +
                "Meski terlihat besar dan lambat, sapi sebenarnya cukup cerdas dan memiliki ingatan yang baik. Mereka bisa mengenali wajah manusia dan hewan lain di sekitarnya. Dengan perawatan yang baik, sapi bisa hidup dengan sehat dan bahagia di peternakan.", R.drawable.sapi,R.raw.sapi));
        list.add(new HerbivoraItem("Kelinci","Kelinci adalah hewan kecil yang lucu dengan tubuh berbulu lembut. Mereka memiliki telinga panjang, kaki belakang yang kuat, dan ekor kecil yang berbentuk bulat. Kelinci biasanya berwarna putih, cokelat, abu-abu, atau kombinasi dari warna-warna tersebut. Mata kelinci sangat tajam, sehingga mereka bisa melihat dengan baik, bahkan di malam hari.\n" +
                "\n" +
                "Kelinci adalah pemakan tumbuhan. Mereka suka makan wortel, daun hijau, dan buah-buahan seperti apel. Gigi kelinci selalu tumbuh, jadi mereka perlu terus mengunyah makanan untuk menjaga gigi mereka tetap pendek. Kelinci juga memiliki kebiasaan menggali lubang di tanah untuk membuat tempat tinggal yang nyaman dan aman.\n" +
                "\n" +
                "Kelinci hidup dalam kelompok kecil dan sangat sosial. Mereka suka bermain dan melompat-lompat, terutama ketika merasa senang. Kelinci juga sangat cepat dan bisa melarikan diri dari bahaya dengan lompatan panjangnya. Anak-anak kelinci, yang disebut kitten, sangat lucu dan sering terlihat mengikuti induknya ke mana-mana.\n" +
                "\n" +
                "Kelinci adalah hewan peliharaan yang populer karena sifatnya yang lembut dan menggemaskan. Mereka membutuhkan perhatian dan kasih sayang, serta tempat tinggal yang bersih dan nyaman. Dengan perawatan yang baik, kelinci bisa menjadi teman yang menyenangkan bagi manusia.", R.drawable.kelinci,R.raw.kelinci));
        list.add(new HerbivoraItem("Jerapah","Jerapah adalah hewan tertinggi di dunia! Mereka memiliki leher yang sangat panjang, yang membantu mereka mencapai daun di pohon-pohon tinggi. Tubuh jerapah ditutupi dengan pola berbentuk kotak berwarna cokelat yang unik untuk setiap individu, seperti sidik jari manusia. Kaki jerapah juga sangat panjang, sehingga mereka bisa berjalan dengan langkah besar.\n" +
                "\n" +
                "Makanan utama jerapah adalah daun, terutama dari pohon akasia. Lidah mereka sangat panjang, bahkan bisa mencapai 50 cm! Lidah ini membantu mereka memetik daun dari dahan yang tinggi. Jerapah juga memiliki bibir yang kuat dan mulut yang dilapisi pelindung agar tidak terluka saat makan daun berduri.\n" +
                "\n" +
                "Jerapah hidup di padang rumput dan sabana di Afrika. Mereka sering terlihat berjalan dalam kelompok kecil atau berpasangan. Meski terlihat tenang, jerapah bisa berlari dengan kecepatan hingga 60 km/jam saat merasa terancam. Mereka menggunakan kaki panjangnya untuk menendang musuh, seperti singa, jika perlu.\n" +
                "\n" +
                "Selain tubuhnya yang unik, jerapah juga memiliki cara minum yang menarik. Karena lehernya panjang, mereka harus membungkuk dengan posisi lucu untuk mencapai air. Jerapah adalah hewan yang damai dan sangat penting bagi ekosistem karena membantu menyebarkan biji pohon ke berbagai tempat.", R.drawable.jerapah,R.raw.jerapah));
        list.add(new HerbivoraItem("Kuda","Kuda adalah hewan yang anggun dan kuat. Mereka memiliki tubuh yang ramping dengan kaki panjang yang memungkinkan mereka berlari dengan cepat. Kuda memiliki bulu yang halus dan biasanya berwarna cokelat, hitam, putih, atau abu-abu. Mereka juga memiliki surai dan ekor panjang yang sering dikepang atau dihias.\n" +
                "\n" +
                "Kuda adalah herbivora yang suka makan rumput, jerami, dan biji-bijian. Mereka memiliki gigi yang kuat untuk mengunyah makanan keras. Kuda juga dikenal sebagai hewan pekerja yang membantu manusia, seperti menarik gerobak, membajak ladang, atau menjadi tunggangan untuk perjalanan.\n" +
                "\n" +
                "Kuda adalah hewan yang sangat cerdas dan sosial. Mereka hidup dalam kelompok yang disebut kawanan dan saling berkomunikasi dengan suara atau gerakan tubuh. Anak kuda, yang disebut foal, bisa berdiri dan berjalan hanya beberapa jam setelah lahir. Mereka sering terlihat bermain dan berlari-lari di padang rumput.\n" +
                "\n" +
                "Kuda juga sering digunakan dalam olahraga seperti pacuan kuda dan berkuda. Mereka membutuhkan perawatan yang baik, termasuk membersihkan bulu, memberi makan yang cukup, dan menyediakan tempat tinggal yang nyaman. Kuda adalah sahabat manusia yang setia dan penuh energi.", R.drawable.kuda,R.raw.kuda));
        list.add(new HerbivoraItem("Kambing","Kambing adalah hewan kecil yang sering hidup di peternakan atau pegunungan. Mereka memiliki tubuh yang kuat dengan tanduk kecil melengkung di kepala. Bulu kambing bisa berwarna putih, cokelat, hitam, atau campuran dari ketiganya. Kambing juga memiliki ekor kecil yang sering bergerak-gerak ketika mereka senang.\n" +
                "\n" +
                "Kambing suka makan rumput, daun, dan bahkan ranting pohon. Mereka adalah pemakan yang tidak pilih-pilih dan sering terlihat memanjat batu atau pohon kecil untuk mencari makanan. Mulut kambing sangat kuat, sehingga mereka bisa menggigit dan mengunyah makanan keras dengan mudah.\n" +
                "\n" +
                "Kambing adalah hewan yang lincah dan suka bermain. Mereka sering melompat-lompat di sekitar kandang atau pegunungan. Anak kambing, yang disebut kid, sangat lucu dan energik. Mereka suka berlari bersama teman-temannya dan belajar banyak dari induknya.\n" +
                "\n" +
                "Kambing adalah hewan yang bermanfaat bagi manusia. Mereka menghasilkan susu, daging, dan bulu yang bisa digunakan untuk membuat pakaian. Selain itu, kambing juga membantu membersihkan rumput liar di ladang. Dengan perawatan yang baik, kambing bisa hidup sehat dan bahagia di peternakan.\n" +
                "\n",R.drawable.kambing,R.raw.kambing));
        return list;
    }
}

