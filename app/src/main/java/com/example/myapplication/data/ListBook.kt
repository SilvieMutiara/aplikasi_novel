package com.example.myapplication.data

import com.example.myapplication.R

data class ListBook(
    var title: String,
    var author: String,
    var genre: String,
    var imageRes: Int,
    var synopsis: String
)

fun getAllListBooks() : List<ListBook>{
    return listOf<ListBook>(
        ListBook("Laut Bercerita",
            "Leila S. Chudori",
            "Fiksi Sejarah, Drama",
            R.drawable.c1,
            "Buku ini terdiri atas dua bagian. Bagian pertama mengambil sudut pandang seorang mahasiswa aktivis bernama Laut, menceritakan bagaimana Laut dan kawan-kawannya menyusun rencana, berpindah-pindah dalam pelarian, hingga tertangkap oleh pasukan rahasia. Sedangkan bagian kedua dikisahkan oleh Asmara, adik Laut. Bagian kedua mewakili perasaan keluarga korban penghilangan paksa, bagaimana pencarian mereka terhadap kerabat mereka yang tak pernah kembali.\n" +
                    " \n" +
                    "Buku ini ditulis sebagai bentuk tribute bagi para aktivis yang diculik, yang kembali, dan yang tak kembali dan keluarga yang terus menerus sampai sekarang mencari-cari jawaban. \n"
        ),

        ListBook("Gadis Kretek",
            "Ratih Kumala",
            "Fiksi Sejarah, Drama Keluarga",
            R.drawable.c5,
            "Pak Raja sekarat. Dalam menanti ajal, ia memanggil satu nama perempuan yang bukan istrinya; Jeng Yah. Tiga anaknya, pewaris Kretek Djagad Raja, dimakan gundah. Sang ibu pun terbakar cemburu terlebih karena permintaan terakhir suaminya ingin bertemu Jeng Yah. Maka berpacu dengan malaikat maut, Lebas, Karim, dan Tegar, pergi ke pelosok Jawa untuk mencari Jeng Yah, sebelum ajal menjemput sang Ayah.\n" +
                    " \n" +
                    "Perjalanan itu bagai napak tilas bisnis dan rahasia keluarga. Lebas, Karim, dan Tegar bertemu dengan pelinting tua dan menguak asal-usul Kretek Djagad Raja hingga menjadi kretek nomor 1 di Indonesia. Lebih dari itu, ketiganya juga mengetahui kisah cinta ayah mereka dengar; Jeng Yah, yang ternyata adalah pemilik Kretek Gadis, kretek lokal Kota M yang terkenal pada zamannya.\n" +
                    " \n" +
                    "Apakah Lebas, Karim, dan Tegar akhirnya berhasil menemukan Jeng Yah?"
        ),

        ListBook("Aroma Karsa",
            "Dee Lestari",
            "Fiksi Ilmiah, Petualangan",
            R.drawable.c3,
            "Dari sebuah lontar kuno, Raras Prayagung mengetahui bahwa Puspa Karsa yang dikenalnya sebagai dongeng, ternyata tanaman sungguhan yang tersembunyi di tempat rahasia. Obsesi Raras untuk memburu dan menemukan Puspa Karsa, bunga sakti yang konon mampu mengendalikan kehendak dan hanya bisa diidentifikasi melalui aroma, mempertemukannya dengan Jati Wesi.\n" +
                    " \n" +
                    "Jati memiliki penciuman yang luar biasa. Di TPA Bantar Gebang, tempatnya tumbuh besar, ia dijuluki si Hidung Tikus. Dari berbagai pekerjaan yang dilakoninya untuk bertahan hidup, satu yang paling Jati banggakan, yakni meracik parfum. Kemampuan penciuman Jati ini mampu memikat Raras yang ingin mencari Puspa Karsa. \n" +
                    " \n" +
                    "Demi bisa lebih dekat dengan Jati dan memanfaatkan kemampuan Jati, Raras bahkan mempekerjakan Jati di perusahaannya. Raras juga turut mengundang Jati masuk ke dalam kehidupan pribadinya. Bertemulah Jati dengan Tanaya Suma, anak tunggal Raras, yang memiliki kemampuan serupa dengannya.\n" +
                    " \n" +
                    "Semakin jauh Jati terlibat dengan keluarga Prayagung dan Puspa Karsa, semakin banyak misteri yang ia temukan, tentang dirinya dan masa lalu yang tak pernah ia tahu. Akan kah semua misteri dibalik kehidupan Jati, niat Raras, dan keajaiban bunga Puspa Karsa terungkap? Ungkap semua rahasia dalam novel misteri Aroma Karsa karya Dee Lestari dengan edisi tanda tangan.\n"
        ),

        ListBook("Pulang",
            "Leila S. Chudori",
            "Fiksi Sejarah, Drama",
            R.drawable.c4,
            "Novel Pulang adalah kisah dua generasi—Dimas Suryo dan putrinya, Lintang Utara—yang bersama-sama menetap di Paris, Prancis. Seperti ribuan warga Indonesia lain yang terjebak di berbagai negara dengan status stateless, keluarga Dimas Suryo tak pernah bisa pulang ke Indonesia karena paspor mereka dicabut dan kehidupan mereka terancam. Pada tahun 1998, Lintang Utara akhirnya berhasil menyentuh tanah air. Dia datang untuk mereka pengalaman keluarga korban Tragedi 1965 sebagai tugas akhir kuliahnya. Apa yang terkuak oleh Lintang bukan sekadar masa lalu ayahnya, tetapi juga bagaimana sejarah paling berdarah di Indonesia berkaitan dengan Dimas Suryo dan kawan-kawannya."
        ),

        ListBook("Bumi Manusia",
            "Pramoedya A. Toer",
            "Fiksi Sejarah, Drama, Romansa",
            R.drawable.c2,
            "Bumi Manusia adalah kisah epik tentang kolonialisme dan perjuangan untuk kebebasan. Berlatar di Hindia Belanda pada awal abad ke-20, novel ini menceritakan kehidupan Minke, seorang pribumi cerdas yang berpendidikan dan memiliki cita-cita besar. Minke jatuh cinta pada Annelies, seorang wanita berdarah campuran Belanda-Pribumi. Mereka harus menghadapi ketidakadilan hukum kolonial yang memisahkan keluarga dan menghancurkan cinta mereka. Bumi Manusia mengangkat tema besar tentang identitas, cinta, perjuangan kelas, dan nasionalisme, menjadikannya karya yang penuh kritik sosial dan kaya akan nuansa sejarah."
        ),

        ListBook("Cantik Itu Luka",
            "Eka Kurniawan",
            "Fiksi Sejarah, Drama",
            R.drawable.c6,
            "Hidup di era kolonialisme bagi para wanita dianggap sudah setara seperti hidup di neraka. Terutama bagi para wanita berparas cantik yang menjadi incaran tentara penjajah untuk melampiaskan hasrat mereka. Itu lah takdir miris yang dilalui Dewi Ayu, demi menyelamatkan hidupnya sendiri Dewi harus menerima paksaan menjadi pelacur bagi tentara Belanda dan Jepang selama masa kedudukan mereka di Indonesia.\n" +
                    "\n" +
                    "Kecantikan Dewi tidak hanya terkenal dikalangan para penjajah saja, seluruh desa pun mengakui pesona parasnya itu. Namun bagi Dewi, kecantikannya ini seperti kutukan, kutukan yang membuat hidupnya sengsara, dan kutukan yang mengancam takdir keempat anak perempuannya yang ikut mewarisi genetik cantiknya.\n" +
                    "\n" +
                    "Tapi tidak dengan satu anak terakhir Dewi, si Cantik, yang lahir dengan kondisi buruk rupa. Tak lama setelah mendatangkan Cantik ke dunia, Dewi harus berpulang. Tapi di satu sore, dua puluh satu tahun kemudian, Dewi kembali, bangkit dari kuburannya. Kebangkitannya menguak kutukan dan tragedi keluarga.\n"
        ),

        ListBook("Ganjil Genap",
            "Almira Bastari",
            "Romansa, Drama",
            R.drawable.c7,
            "Gimana rasanya diputusin setelah berpacaran selama tiga belas tahun? Hidup Gala yang mendadak jomblo semakin runyam ketika adiknya kebelet nikah! Gala bertekad pantang lajang menjelang umur kepala tiga. Bersama ketiga sahabatnya, Nandi, Sydney, dan Detira, strategi pencarian jodoh pun disusun. Darat, udara, bahkan laut “disisir” demi menemukan pria idaman. Akankah Gala berhasil menemukan pasangan untuk menggenapi hari-hari ganjilnya?\n"
        ),

        ListBook("Critical Eleven",
            "Ika Natassa",
            "Romansa, Drama",
            R.drawable.c8,
            "Dalam dunia penerbangan, dikenal istilah critical eleven, sebelas menit paling kritis di dalam pesawat––tiga menit setelah take off dan delapan menit sebelum landing––karena secara statistik delapan puluh persen kecelakaan pesawat umumnya terjadi dalam rentang waktu sebelas menit itu. It's when the aircraft is most vulnerable to any danger.\n" +
                    " \n" +
                    "In a way, it's kinda the same with meeting people. Tiga menit pertama kritis sifatnya karena saat itulah kesan pertama terbentuk, lalu ada delapan menit sebelum berpisah––delapan menit ketika senyum, tindak tanduk, dan ekspresi wajah orang tersebut jelas bercerita apakah itu akan jadi awal sesuatu ataukah justru menjadi perpisahan.\n" +
                    " \n" +
                    "Ale dan Anya pertama kali bertemu dalam penerbangan Jakarta-Sydney. Tiga menit pertama Anya terpikat, tujuh jam berikutnya mereka duduk bersebelahan dan saling mengenal lewat percakapan serta tawa, dan delapan menit sebelum berpisah Ale yakin dia menginginkan Anya.\n" +
                    " \n" +
                    "Kini, lima tahun setelah perkenalan itu, Ale dan Anya dihadapkan pada satu tragedi besar yang membuat mereka mempertanyakan pilihan-pilihan yang mereka ambil, termasuk keputusan pada sebelas menit paling penting dalam pertemuan pertama mereka."
        ),

        ListBook("Sisi Tergelap Surga",
            "Brian Khrisna",
            "Drama, Fiksi",
            R.drawable.c9,
            "Jakarta kerap menjadi pelabuhan bagi mereka yang datang membawa sekoper harapan. Mereka yang siap bertaruh dengan nasibnya sendiri-sendiri. Namun, kota ini selalu mampu melumat habis harapan dan menukarnya dengan keputusasaan. Pemulung, pengamen, pramuria yang menjajakan tubuh agar anaknya bisa makan, pemimpin-pemimpin kecil yang culas, lelaki tua di balik kostum badut ayam, pencuri motor yang ingin membeli obat untuk ibunya, remaja yang melumuri tubuh dengan cat perak, hingga mereka yang bergelut di terminal setelah terpaksa merelakan impiannya habis digerus kejinya ibu kota. Di Jakarta, semua orang dipaksa bergelut dan bertempur demi bisa hidup dari hari ke hari. Dan di kampung inilah semua itu dimulai. Sebuah cerita tentang kehidupan orang-orang yang hidup di sisi tergelap surga kota bernama Jakarta...\n"
        ),

        ListBook("Home Sweet Loan",
            "Almira Bastari",
            "Komedi, Romansa",
            R.drawable.c10,
            "Empat orang yang berteman sejak SMA bekerja di perusahaan yang sama meski beda nasib. Di usia 31 tahun, mereka berburu rumah idaman yang minimal...nyerempet Jakarta.\n" +
                    "\n" +
                    "Kaluna, pegawai Bagian Umum, yang gajinya tak pernah menyentuh dua digit. Gadis ini kerja sampingan sebagai model bibir, bermimpi membeli rumah demi keluar dari situasi tiga kepala keluarga yang bertumpuk di bawah satu atap. Di tengah perjuangannya menabung, Kaluna dirongrong oleh kekasihnya untuk pesta pernikahan mewah."
        ),
        )
}

fun getAllHorizontalListBook()  : List<ListBook>{
    return listOf<ListBook>(
        ListBook("Malice",
            "Keigo Higashino",
            "Aksi, Pembunuhan, Kriminal, dan Misteri",
            R.drawable.c11,
            "Novelis laris Hidaka Kunihiko ditemukan tewas di rumahnya pada malam sebelum ia meninggalkan Jepang untuk pindah ke Kanada. Tubuhnya ditemukan di ruang kerjanya yang terkunci di rumahnya yang juga terkunci oleh istri dan sahabatnya. Keduanya punya alibi kuat. Mungkin.\n" +
                    " \n" +
                    "Detektif Kaga Kyoichiro yang menyelidiki kasus pembunuhan tersebut menemukan bahwa hubungan Hidaka dengan sang sahabat, Nonoguchi Osamu, tidak seperti yang diceritakan oleh Nonoguchi. Tapi pertanyaan yang paling mengusik Kaga bukanlah siapa atau bagaimana, melainkan kenapa. Dari situlah sang detektif dan sang pembunuh bertarung membeberkan kebenaran tentang masa lalu dan masa kini versi masing-masing. Dan jika Kaga gagal menguak motif sang pembunuh yang sebenarnya, kebenaran takkan terungkap seutuhnya.\n"
        ),

        ListBook("Funiculi Funicula",
            "Toshikazu Kawaguchi",
            "Fiksi Fantasi",
            R.drawable.c12,
            "Kafe tua yang berada di gang kecil Tokyo terletak di bawah gedung lain, tidak butuh pendingin untuk mendinginkan Kafe tersebut. Tidak begitu ramai, namun terkenal karena bisa membawa pengunjungnya menjelajahi waktu. Keajaiban kafe itu menarik seorang wanita yang ingin memutar waktu untuk berbaikan dengan kekasihnya, seorang perawat yang ingin membaca surat yang tak sempat diberikan suaminya yang sakit, seorang kakak yang ingin menemui adiknya untuk terakhir kali, dan seorang ibu yang ingin bertemu dengan anak yang mungkin takkan pernah dikenalnya. Namun ada banyak peraturan yang harus diingat. Satu, mereka harus tetap duduk di kursi yang telah ditentukan. Dua, apapun yang mereka lakukan di masa yang didatangi takkan mengubah kenyataan di masa kini. Tiga, mereka harus menghabiskan kopi khusus yang disajikan sebelum kopi itu dingin. Rentetan peraturan lainnya tak menghentikan orang-orang itu untuk menjelajahi waktu. Akan tetapi, jika kepergian mereka tak mengubah satu hal pun di masa kini, layakkah semua itu dijalani?\n"
        ),

        ListBook("Little Women",
            "Louisa May Alcott",
            "Fiksi, Romansa",
            R.drawable.c13,
            "Empat perempuan kakak beradik tinggal di sebuah rumah sederhana bersama ibunya. Ayahnya menjadi prajurit Perang Saudara di Washington. Sehari-hari mereka sibuk untuk bekerja, belajar, dan menunggu kabar ayahnya. Empat orang berarti empat karakter yang berbeda. Meg adalah anak tertua yang anggun dan feminin. Jo anak tomboy, temperamen, dan penyuka sastra. Beth, anak ketiga yang pemalu, penurut, dan pandai bermain piano. Bakat bermain piano dan hati Beth yang lembut membuat Mr. Laurence teringat akan cucu perempuannya, lalu menghadiahi Beth piano. Terakhir adalah Amy, anak bungsu yang berusaha terlihat dewasa dan senang melukis.\n" +
                    "\n" +
                    "Hingga suatu hari, keluarga March mendapat kabar bahwa Mr. March yang berada di Washington sakit parah dan meminta Mrs. March untuk datang ke sana. Berita tersebut dengan cepat mengubah suasana rumah keluarga March yang semula ceria dan hangat menjadi muram, panik, dan dingin. Bahkan Jo nekat menjual rambutnya demi membantu ayahnya. Berangkatlah sang ibu ke Washington ditemani Mr. Brooke, guru privat Laurie. Ia meninggalkan keempat putrinya bersama Hannah, pelayan yang juga merangkap orang tua ketika Mrs. March pergi.\n" +
                    "\n" +
                    "Cobaan tidak selesai begitu saja. Beth sakit demam setelah menggendong bayi di rumah keluarga Hummel. Keadaan Beth semakin parah, sementara Mrs. March yang sengaja tidak diberitahu perihal Beth belum kembali dari Washington."
        ),

        ListBook("Midnight Sun",
            "Stephenie Meyer",
            "Fiksi, Fantasi, Romansa",
            R.drawable.c14,
            "Edward Cullen bisa merasakan dirinya jatuh cinta ketika melihat Bella Swan tiba di Forks. Gadis itu tak seperti manusia lain yang isi kepalanya membuat Edward pening. Bella justru membuatnya takut karena dia benar-benar tak terbaca. Midnight Sun mengisahkan pertemuan Edward dan Bella serta menggambarkan bagaimana kisah cinta mereka terjalin dari sudut pandang Edward, sang vampir. Detail masa lalu serta benak Edward yang rumit semakin menunjukkan mengapa cintanya pada Bella merupakan pertentangan hidupnya yang terbesar. Bagaimana mungkin ia begitu egois mengikuti kata hatinya jika itu berarti membahayakan hidup Bella?\n"
        ),

        ListBook("Second Sister",
            "Chan Ho-Kei",
            "Fiksi, Misteri",
            R.drawable.c15,
            "Siu-Man melompat dari jendela di lantai dua puluh dan tewas seketika. Nga-Yee, kakak perempuan yang selama ini membesarkannya, menolak percaya bahwa adiknya bunuh diri. Nga-Yee meminta bantuan seorang peretas, yang hanya dikenal sebagai N, untuk menyelidiki kasus kematian adiknya. Penyelidikan amatir mereka berlanjut seperti permainan kucing dan tikus ke seluruh penjuru kota Hong Kong serta dunia digital bawah tanah mereka, terutama di platform-platform gosip daring, tempat seseorang menjatuhkan nama baik Siu-Man tanpa ampun. Berawal dari kasus pelecehan seksual di transportasi umum, yang berlanjut menjadi kasus perundungan di dunia daring ternyata membuat Siu-Man menyerah. Tetapi, benarkah itu penyebab Siu-Man memutuskan untuk bunuh diri? Di era sekarang, dengan percakapan daring dan luring yang terus berlangsung, terkadang manusia melupakan bahwa yang mereka libatkan adalah manusia yang nyata, bukan maya.\n"
        ),

        ListBook("Yellowface",
            "R. F. Kuang",
            "Fiksi Psikologis, Satire",
            R.drawable.c16,
            "June Hayward dan Athena Liu sama-sama penulis. Athena, keturunan Asia, ternyata lebih ngetop. Sementara June berpendapat tak ada yang akan tertarik pada karyanya, gadis kulit putih biasa. Ketika Athena mendadak meninggal, June mencuri manuskrip Athena lalu menyerahkannya sebagai karyanya. \n" +
                    " \n" +
                    "Penerbit membuatkan citra baru bagi June, lengkap dengan foto yang ambigu mengenai etnik dirinya. Di luar dugaan, buku itu sukses besar. Namun, June tidak bisa lolos dari bayangan Athena, dan bukti-bukti bermunculan, mengancam kesuksesan June. Saat berpacu untuk menutupi rahasianya, June jadi tahu seberapa jauh ia berani bertindak untuk mempertahankan apa yang menurutnya layak ia dapatkan. \n"
        ),

        ListBook("The Song of Achilles",
            "Madeline Miller",
            "Fiksi Sejarah, Romansa, Fantasi",
            R.drawable.c17,
            "Yunani pada zaman para pahlawan. Patroclus, seorang pangeran muda yang kikuk, diasingkan ke istana Raja Peleus dan putranya yang sempurna, Achilles. Mereka tumbuh menjadi pemuda yang cakap dalam seni perang dan pengobatan, dan kedekatan mereka berkembang menjadi hubungan yang lebih dalam meski sangat ditentang oleh ibu Achilles, Thetis, dewi laut yang kejam. Lalu tersiar kabar bahwa Helen dari Sparta telah diculik. Bimbang antara takut dan rasa sayang terhadap sahabatnya, Patroclus pergi bersama Achilles ke Troy, tanpa menyadari bahwa tahun-tahun selanjutnya akan menjadi ujian bagi semua yang mereka sayangi.\n"
        ),

        ListBook("The Alchemist",
            "Paulo Coelho",
            "Fiksi Fantasi, Petualangan",
            R.drawable.c18,
            "Novel Sang Alkemis menceritakan tentang mimpi, harapan, dan impian seorang anak bernama Santiago, yang mengembala untuk mencari harta karun. Ia melakukan pencarian harta karun setelah seorang peramal mengatakan bahwa Santiago akan menemukan dan mendapatkan harta karun yang tidak akan habis dipakai sampai tujuh turunan. Dalam perjalanannya, ia bertemu dengan Melchizedek yang memberikan nasihat bahwa saat seseorang menginginkan sesuatu, alam semesta akan membantu menolong agar seseorang itu dapat meraih impiannya. Mechizedek juga memberikan Santiago dua buah batu untuk membaca tanda dan meminta Santiago untuk tidak menyerah dengan mimpinya dan mengikuti pertanda yang ada. Santiago meneruskan menggembala sampai akhirnya ia bertemu dengan penunggang kuda, Sang Alkemis. \n"
        ),

        ListBook("Love From A to Z",
            "S. K. Ali",
            "Romansa",
            R.drawable.c19,
            "Adam adalah pemuda yang tenang dan terampil. Di tangannya, barang-barang yang tak berharga bisa menjadi karya seni penuh makna. Zayneb adalah perempuan yang bersemangat. Ia takkan pernah bisa diam melihat ketidakadilan yang terjadi di sekitarnya dan terkadang juga ditujukan padanya. Keduanya bertemu secara tak sengaja dan saling terpukau pada kepribadian masing-masing. Zayneb kagum pada Adam yang mampu membuat keputusan besar untuk menjadi mualaf di usia belia, dan Adam selalu bersemangat melihat pancaran energi dari apapun yang dilakukan Zayneb. Namun, saat mereka mulai mengerti perasaan masing-masing, keduanya sadar bahwa ada perbedaan yang tak bisa dijembatani"
        ),

        ListBook("Salt to the Sea",
            "Ruta Sepetys",
            "Fiksi Sejarah",
            R.drawable.c20,
            "Tahun 1945. Perang Dunia II merambah Prusia Timur. Jutaan pengungsi pergi mencari tempat aman. Di antara mereka terdapat empat orang dengan kisah dan rahasia yang berbeda. Takdir mempertemukan keempatnya di Wilhelm Gustloff, kapal megah yang menjadi tempat mereka menggantungkan harapan bersama lebih dari sepuluh ribu penumpang lainnya. Tapi sebelum kebebasan sempat diraih, tragedi besar pun terjadi. Tak peduli dari negara mana mereka berasal dan status apa yang mereka sandang, ribuan penumpang kapal harus berjuang keras melakukan satu hal: bertahan hidup.\n"
        ),
    )
}

fun getFavoriteBooks () : List<ListBook>{
    return listOf<ListBook>(
        ListBook("Aroma Karsa",
            "Dee Lestari",
            "Fiksi Ilmiah, Petualangan",
            R.drawable.c3,
            "Dari sebuah lontar kuno, Raras Prayagung mengetahui bahwa Puspa Karsa yang dikenalnya sebagai dongeng, ternyata tanaman sungguhan yang tersembunyi di tempat rahasia. Obsesi Raras untuk memburu dan menemukan Puspa Karsa, bunga sakti yang konon mampu mengendalikan kehendak dan hanya bisa diidentifikasi melalui aroma, mempertemukannya dengan Jati Wesi.\n" +
                    " \n" +
                    "Jati memiliki penciuman yang luar biasa. Di TPA Bantar Gebang, tempatnya tumbuh besar, ia dijuluki si Hidung Tikus. Dari berbagai pekerjaan yang dilakoninya untuk bertahan hidup, satu yang paling Jati banggakan, yakni meracik parfum. Kemampuan penciuman Jati ini mampu memikat Raras yang ingin mencari Puspa Karsa. \n" +
                    " \n" +
                    "Demi bisa lebih dekat dengan Jati dan memanfaatkan kemampuan Jati, Raras bahkan mempekerjakan Jati di perusahaannya. Raras juga turut mengundang Jati masuk ke dalam kehidupan pribadinya. Bertemulah Jati dengan Tanaya Suma, anak tunggal Raras, yang memiliki kemampuan serupa dengannya.\n" +
                    " \n" +
                    "Semakin jauh Jati terlibat dengan keluarga Prayagung dan Puspa Karsa, semakin banyak misteri yang ia temukan, tentang dirinya dan masa lalu yang tak pernah ia tahu. Akan kah semua misteri dibalik kehidupan Jati, niat Raras, dan keajaiban bunga Puspa Karsa terungkap? Ungkap semua rahasia dalam novel misteri Aroma Karsa karya Dee Lestari dengan edisi tanda tangan.\n"
        ),

        ListBook("Critical Eleven",
            "Ika Natassa",
            "Romansa, Drama",
            R.drawable.c8,
            "Dalam dunia penerbangan, dikenal istilah critical eleven, sebelas menit paling kritis di dalam pesawat––tiga menit setelah take off dan delapan menit sebelum landing––karena secara statistik delapan puluh persen kecelakaan pesawat umumnya terjadi dalam rentang waktu sebelas menit itu. It's when the aircraft is most vulnerable to any danger.\n" +
                    " \n" +
                    "In a way, it's kinda the same with meeting people. Tiga menit pertama kritis sifatnya karena saat itulah kesan pertama terbentuk, lalu ada delapan menit sebelum berpisah––delapan menit ketika senyum, tindak tanduk, dan ekspresi wajah orang tersebut jelas bercerita apakah itu akan jadi awal sesuatu ataukah justru menjadi perpisahan.\n" +
                    " \n" +
                    "Ale dan Anya pertama kali bertemu dalam penerbangan Jakarta-Sydney. Tiga menit pertama Anya terpikat, tujuh jam berikutnya mereka duduk bersebelahan dan saling mengenal lewat percakapan serta tawa, dan delapan menit sebelum berpisah Ale yakin dia menginginkan Anya.\n" +
                    " \n" +
                    "Kini, lima tahun setelah perkenalan itu, Ale dan Anya dihadapkan pada satu tragedi besar yang membuat mereka mempertanyakan pilihan-pilihan yang mereka ambil, termasuk keputusan pada sebelas menit paling penting dalam pertemuan pertama mereka."
        ),

        ListBook("Yellowface",
            "R. F. Kuang",
            "Fiksi Psikologis, Satire",
            R.drawable.c16,
            "June Hayward dan Athena Liu sama-sama penulis. Athena, keturunan Asia, ternyata lebih ngetop. Sementara June berpendapat tak ada yang akan tertarik pada karyanya, gadis kulit putih biasa. Ketika Athena mendadak meninggal, June mencuri manuskrip Athena lalu menyerahkannya sebagai karyanya. \n" +
                    " \n" +
                    "Penerbit membuatkan citra baru bagi June, lengkap dengan foto yang ambigu mengenai etnik dirinya. Di luar dugaan, buku itu sukses besar. Namun, June tidak bisa lolos dari bayangan Athena, dan bukti-bukti bermunculan, mengancam kesuksesan June. Saat berpacu untuk menutupi rahasianya, June jadi tahu seberapa jauh ia berani bertindak untuk mempertahankan apa yang menurutnya layak ia dapatkan. \n"
        ),

        ListBook("Cantik Itu Luka",
            "Eka Kurniawan",
            "Fiksi Sejarah, Drama",
            R.drawable.c6,
            "Hidup di era kolonialisme bagi para wanita dianggap sudah setara seperti hidup di neraka. Terutama bagi para wanita berparas cantik yang menjadi incaran tentara penjajah untuk melampiaskan hasrat mereka. Itu lah takdir miris yang dilalui Dewi Ayu, demi menyelamatkan hidupnya sendiri Dewi harus menerima paksaan menjadi pelacur bagi tentara Belanda dan Jepang selama masa kedudukan mereka di Indonesia.\n" +
                    "\n" +
                    "Kecantikan Dewi tidak hanya terkenal dikalangan para penjajah saja, seluruh desa pun mengakui pesona parasnya itu. Namun bagi Dewi, kecantikannya ini seperti kutukan, kutukan yang membuat hidupnya sengsara, dan kutukan yang mengancam takdir keempat anak perempuannya yang ikut mewarisi genetik cantiknya.\n" +
                    "\n" +
                    "Tapi tidak dengan satu anak terakhir Dewi, si Cantik, yang lahir dengan kondisi buruk rupa. Tak lama setelah mendatangkan Cantik ke dunia, Dewi harus berpulang. Tapi di satu sore, dua puluh satu tahun kemudian, Dewi kembali, bangkit dari kuburannya. Kebangkitannya menguak kutukan dan tragedi keluarga.\n"
        ),

        ListBook("The Alchemist",
            "Paulo Coelho",
            "Fiksi Fantasi, Petualangan",
            R.drawable.c18,
            "Novel Sang Alkemis menceritakan tentang mimpi, harapan, dan impian seorang anak bernama Santiago, yang mengembala untuk mencari harta karun. Ia melakukan pencarian harta karun setelah seorang peramal mengatakan bahwa Santiago akan menemukan dan mendapatkan harta karun yang tidak akan habis dipakai sampai tujuh turunan. Dalam perjalanannya, ia bertemu dengan Melchizedek yang memberikan nasihat bahwa saat seseorang menginginkan sesuatu, alam semesta akan membantu menolong agar seseorang itu dapat meraih impiannya. Mechizedek juga memberikan Santiago dua buah batu untuk membaca tanda dan meminta Santiago untuk tidak menyerah dengan mimpinya dan mengikuti pertanda yang ada. Santiago meneruskan menggembala sampai akhirnya ia bertemu dengan penunggang kuda, Sang Alkemis. \n"
        ),

        ListBook("Salt to the Sea",
            "Ruta Sepetys",
            "Fiksi Sejarah",
            R.drawable.c20,
            "Tahun 1945. Perang Dunia II merambah Prusia Timur. Jutaan pengungsi pergi mencari tempat aman. Di antara mereka terdapat empat orang dengan kisah dan rahasia yang berbeda. Takdir mempertemukan keempatnya di Wilhelm Gustloff, kapal megah yang menjadi tempat mereka menggantungkan harapan bersama lebih dari sepuluh ribu penumpang lainnya. Tapi sebelum kebebasan sempat diraih, tragedi besar pun terjadi. Tak peduli dari negara mana mereka berasal dan status apa yang mereka sandang, ribuan penumpang kapal harus berjuang keras melakukan satu hal: bertahan hidup.\n"
        ),

        ListBook("Ganjil Genap",
            "Almira Bastari",
            "Romansa, Drama",
            R.drawable.c7,
            "Gimana rasanya diputusin setelah berpacaran selama tiga belas tahun? Hidup Gala yang mendadak jomblo semakin runyam ketika adiknya kebelet nikah! Gala bertekad pantang lajang menjelang umur kepala tiga. Bersama ketiga sahabatnya, Nandi, Sydney, dan Detira, strategi pencarian jodoh pun disusun. Darat, udara, bahkan laut “disisir” demi menemukan pria idaman. Akankah Gala berhasil menemukan pasangan untuk menggenapi hari-hari ganjilnya?\n"
        ),

        ListBook("Second Sister",
            "Chan Ho-Kei",
            "Fiksi, Misteri",
            R.drawable.c15,
            "Siu-Man melompat dari jendela di lantai dua puluh dan tewas seketika. Nga-Yee, kakak perempuan yang selama ini membesarkannya, menolak percaya bahwa adiknya bunuh diri. Nga-Yee meminta bantuan seorang peretas, yang hanya dikenal sebagai N, untuk menyelidiki kasus kematian adiknya. Penyelidikan amatir mereka berlanjut seperti permainan kucing dan tikus ke seluruh penjuru kota Hong Kong serta dunia digital bawah tanah mereka, terutama di platform-platform gosip daring, tempat seseorang menjatuhkan nama baik Siu-Man tanpa ampun. Berawal dari kasus pelecehan seksual di transportasi umum, yang berlanjut menjadi kasus perundungan di dunia daring ternyata membuat Siu-Man menyerah. Tetapi, benarkah itu penyebab Siu-Man memutuskan untuk bunuh diri? Di era sekarang, dengan percakapan daring dan luring yang terus berlangsung, terkadang manusia melupakan bahwa yang mereka libatkan adalah manusia yang nyata, bukan maya.\n"
        ),

        ListBook("Pulang",
            "Leila S. Chudori",
            "Fiksi Sejarah, Drama",
            R.drawable.c4,
            "Novel Pulang adalah kisah dua generasi—Dimas Suryo dan putrinya, Lintang Utara—yang bersama-sama menetap di Paris, Prancis. Seperti ribuan warga Indonesia lain yang terjebak di berbagai negara dengan status stateless, keluarga Dimas Suryo tak pernah bisa pulang ke Indonesia karena paspor mereka dicabut dan kehidupan mereka terancam. Pada tahun 1998, Lintang Utara akhirnya berhasil menyentuh tanah air. Dia datang untuk mereka pengalaman keluarga korban Tragedi 1965 sebagai tugas akhir kuliahnya. Apa yang terkuak oleh Lintang bukan sekadar masa lalu ayahnya, tetapi juga bagaimana sejarah paling berdarah di Indonesia berkaitan dengan Dimas Suryo dan kawan-kawannya."
        ),

        ListBook("Funiculi Funicula",
            "Toshikazu Kawaguchi",
            "Fiksi, Fantasi",
            R.drawable.c12,
            "Kafe tua yang berada di gang kecil Tokyo terletak di bawah gedung lain, tidak butuh pendingin untuk mendinginkan Kafe tersebut. Tidak begitu ramai, namun terkenal karena bisa membawa pengunjungnya menjelajahi waktu. Keajaiban kafe itu menarik seorang wanita yang ingin memutar waktu untuk berbaikan dengan kekasihnya, seorang perawat yang ingin membaca surat yang tak sempat diberikan suaminya yang sakit, seorang kakak yang ingin menemui adiknya untuk terakhir kali, dan seorang ibu yang ingin bertemu dengan anak yang mungkin takkan pernah dikenalnya. Namun ada banyak peraturan yang harus diingat. Satu, mereka harus tetap duduk di kursi yang telah ditentukan. Dua, apapun yang mereka lakukan di masa yang didatangi takkan mengubah kenyataan di masa kini. Tiga, mereka harus menghabiskan kopi khusus yang disajikan sebelum kopi itu dingin. Rentetan peraturan lainnya tak menghentikan orang-orang itu untuk menjelajahi waktu. Akan tetapi, jika kepergian mereka tak mengubah satu hal pun di masa kini, layakkah semua itu dijalani?\n"
        ),

    )
}