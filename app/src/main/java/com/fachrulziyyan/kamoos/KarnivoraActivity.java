package com.fachrulziyyan.kamoos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KarnivoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnivora);

        // Initialize RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewKarnivora);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        KarnivoraAdapter adapter = new KarnivoraAdapter(this, getKarnivoraList()); // Context diberikan di sini
        recyclerView.setAdapter(adapter);

        // Initialize btnBack and set click listener
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(KarnivoraActivity.this, TabActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private List<KarnivoraItem> getKarnivoraList() {
        List<KarnivoraItem> list = new ArrayList<>();
        list.add(new KarnivoraItem("Singa","Singa sering disebut sebagai \"Raja Hutan\" karena keberaniannya dan suara auman yang sangat keras. Singa biasanya hidup di padang rumput dan sabana di Afrika, meskipun ada juga singa yang hidup di daerah hutan. Tubuh mereka ditutupi bulu berwarna cokelat keemasan, dan singa jantan memiliki surai lebat yang mengelilingi kepala mereka. Surai ini tidak hanya membuat mereka terlihat gagah, tetapi juga membantu melindungi leher saat bertarung.\n" +
                "\n" +
                "Singa hidup dalam kelompok yang disebut kebanggaan. Dalam kebanggaan, biasanya ada satu atau dua singa jantan, beberapa singa betina, dan anak-anak singa. Mereka adalah pemburu yang hebat dan sering bekerja sama untuk menangkap mangsa seperti zebra, rusa, atau kerbau. Singa betina biasanya yang lebih sering berburu, sementara singa jantan menjaga wilayah mereka dari bahaya.\n" +
                "\n" +
                "Singa adalah hewan yang sangat kuat, tetapi mereka juga menghabiskan banyak waktu untuk beristirahat. Mereka bisa tidur hingga 20 jam setiap hari! Istirahat ini penting karena berburu dan menjaga kebanggaan memerlukan banyak energi. Anak-anak singa yang masih kecil sering terlihat bermain dengan saudara-saudaranya, berlatih berburu, dan belajar dari induk mereka.\n" +
                "\n" +
                "Selain berburu, singa juga berkomunikasi dengan cara yang unik. Mereka mengaum untuk menandai wilayah, memanggil anggota kebanggaan, atau bahkan untuk menakuti musuh. Auman singa bisa terdengar hingga jarak 8 kilometer! Singa adalah simbol kekuatan dan keberanian di banyak budaya, membuat mereka menjadi salah satu hewan yang paling dikagumi di dunia.", R.drawable.singa,R.raw.singa));
        list.add(new KarnivoraItem("Beruang","Beruang adalah hewan besar yang hidup di hutan, pegunungan, dan daerah bersalju. Ada banyak jenis beruang, seperti beruang cokelat, beruang kutub, dan beruang hitam. Mereka memiliki tubuh besar dengan cakar yang kuat dan telinga kecil yang bulat. Beruang juga memiliki indra penciuman yang luar biasa, bahkan lebih tajam daripada anjing! Ini membantu mereka menemukan makanan dari jarak jauh.\n" +
                "\n" +
                "Beruang adalah pemakan segala, yang artinya mereka makan daging, buah-buahan, madu, dan bahkan serangga. Beruang cokelat suka menangkap ikan di sungai, sementara beruang kutub berburu anjing laut di atas es. Ketika makanan sulit ditemukan, beruang bisa bertahan hidup dengan lemak tubuhnya. Beberapa jenis beruang bahkan hibernasi atau tidur panjang di musim dingin untuk menghemat energi.\n" +
                "\n" +
                "Meski terlihat besar dan kuat, beruang juga suka bermain. Anak-anak beruang sering terlihat saling bergulat atau memanjat pohon. Mereka belajar banyak dari induknya, termasuk cara mencari makanan dan menjaga diri. Beruang juga dikenal sangat melindungi keluarga mereka, terutama induk beruang yang memiliki anak kecil.\n" +
                "\n" +
                "Beruang adalah hewan yang penting bagi ekosistem, karena mereka membantu menyebarkan biji tanaman melalui kotorannya. Namun, banyak beruang yang kehilangan tempat tinggal karena hutan ditebang. Penting bagi kita untuk menjaga habitat mereka agar beruang tetap bisa hidup dengan aman di alam liar.", R.drawable.beruang,R.raw.beruang));
        list.add(new KarnivoraItem("Orca","Orca, atau paus pembunuh, adalah mamalia laut besar yang dikenal dengan warna tubuh hitam dan putih yang mencolok. Mereka tinggal di lautan seluruh dunia, mulai dari perairan dingin dekat Kutub Utara hingga laut tropis yang hangat. Orca dikenal sebagai perenang yang sangat cepat dan cerdas. Mereka memiliki tubuh yang ramping dengan sirip besar di punggung mereka, yang membantu mereka berenang dengan lincah di dalam air.\n" +
                "\n" +
                "Orca hidup dalam kelompok keluarga yang disebut pod. Setiap pod bisa terdiri dari 5 hingga 30 orca dan biasanya dipimpin oleh orca betina tertua. Mereka memiliki cara komunikasi yang unik, menggunakan suara klik dan siulan untuk berkomunikasi satu sama lain. Orca sangat kompak dan sering bekerja sama untuk berburu makanan seperti ikan, cumi-cumi, atau anjing laut. Mereka juga dikenal menggunakan teknik khusus untuk menangkap mangsanya, menunjukkan kecerdasan luar biasa mereka.\n" +
                "\n" +
                "Selain itu, orca adalah hewan yang sangat sosial dan suka bermain. Mereka sering melompat keluar dari air, menggulung tubuh mereka, atau bahkan \"menepuk\" permukaan air dengan ekor mereka. Anak-anak orca belajar banyak dari induknya, mulai dari cara berburu hingga cara berenang dengan baik. Mereka juga menunjukkan rasa kasih sayang kepada anggota keluarga mereka, membuat mereka menjadi salah satu hewan laut yang paling menarik.\n" +
                "\n" +
                "Meski disebut \"paus pembunuh,\" orca tidak berbahaya bagi manusia. Sebutan itu berasal dari kebiasaan mereka berburu hewan besar di lautan. Orca juga memiliki peran penting dalam ekosistem laut, menjaga keseimbangan populasi ikan dan hewan laut lainnya. Keindahan dan kecerdasan mereka membuat orca sering menjadi daya tarik utama dalam penelitian laut.\n", R.drawable.orca,R.raw.orca));
        list.add(new KarnivoraItem("Cheetah","Cheetah adalah hewan tercepat di darat dan dapat berlari dengan kecepatan hingga 100 km/jam. Mereka memiliki tubuh yang ramping dan panjang, serta bulu berbintik-bintik hitam di atas warna kuning kecokelatan. Bintik-bintik ini membantu mereka menyamar di rerumputan, sehingga mereka bisa mendekati mangsa tanpa mudah terlihat. Cheetah juga memiliki garis hitam di wajahnya, yang membantu melindungi mata dari sinar matahari.\n" +
                "\n" +
                "Cheetah biasanya berburu hewan kecil seperti rusa, kelinci, atau burung besar. Mereka berburu pada siang hari, berbeda dari kucing besar lainnya yang lebih aktif di malam hari. Saat berburu, cheetah menggunakan kecepatan luar biasa untuk mengejar mangsanya. Namun, lari cepat ini hanya bisa berlangsung beberapa detik karena membutuhkan energi yang sangat besar. Setelah menangkap mangsa, mereka sering makan dengan cepat untuk menghindari hewan lain yang mencoba merebut makanannya.\n" +
                "\n" +
                "Cheetah hidup di padang rumput dan hutan terbuka di Afrika serta beberapa bagian Asia. Mereka sering terlihat sendirian atau bersama anak-anak mereka. Anak cheetah memiliki bulu tebal di punggung yang membantu melindungi mereka dari musuh. Selama masa kecil, anak cheetah suka bermain dan belajar berburu dari induknya, yang sangat sabar dalam mengajari mereka.\n" +
                "\n" +
                "Hewan ini termasuk salah satu yang paling terancam punah karena habitat mereka semakin sedikit. Cheetah membutuhkan ruang luas untuk berburu dan hidup. Itulah mengapa sangat penting bagi kita untuk menjaga alam dan memastikan mereka tetap memiliki tempat tinggal. Cheetah adalah hewan yang luar biasa dengan kecepatan dan kecerdasan yang mengagumkan.\n", R.drawable.cheetah,R.raw.cheetah));
        list.add(new KarnivoraItem("Harimau","Harimau adalah kucing besar yang memiliki tubuh belang-belang hitam dan oranye. Mereka adalah hewan yang kuat dan tinggal di hutan-hutan Asia. Harimau memiliki tubuh yang besar, dengan kaki yang kuat dan ekor panjang untuk menjaga keseimbangan. Selain itu, harimau memiliki penglihatan yang sangat tajam, terutama di malam hari, yang membantu mereka berburu dengan mudah.\n" +
                "\n" +
                "Harimau suka berburu sendirian, biasanya mencari mangsa seperti rusa, babi hutan, atau kerbau. Mereka sangat pandai mengendap-endap dan menyerang mangsa dengan cepat. Harimau juga dikenal sebagai perenang yang handal, berbeda dari kucing lainnya. Mereka sering terlihat bermain atau berburu di dekat sungai atau kolam air.\n" +
                "\n" +
                "Harimau hidup di wilayah yang luas dan menjaga daerah mereka dengan sangat baik. Mereka menandai wilayahnya menggunakan aroma khusus untuk memberi tahu harimau lain agar tidak masuk. Harimau juga sangat peduli pada anak-anaknya. Anak harimau tinggal bersama induknya hingga mereka cukup besar dan belajar berburu sendiri.\n" +
                "\n" +
                "Namun, harimau adalah salah satu hewan yang terancam punah. Jumlah mereka semakin berkurang karena hutan tempat tinggalnya ditebang atau dijadikan tempat tinggal manusia. Kita harus melindungi harimau dan habitatnya, agar mereka tetap ada di alam liar. Harimau adalah simbol kekuatan dan keindahan yang harus dijaga.\n" +
                "\n",R.drawable.harimau,R.raw.harimau));
        return list;
    }
}

