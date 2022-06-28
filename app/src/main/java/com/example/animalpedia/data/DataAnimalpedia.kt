package com.example.animalpedia.data

import com.example.animalpedia.R

object DataAnimalpedia {

    val nameMammals = arrayOf(
        "Singa",
        "Anjing",
        "Gajah",
        "Kucing"
    )

    val imageHomeMammals = intArrayOf(
        R.drawable.img_lion,
        R.drawable.img_dog,
        R.drawable.img_elephant,
        R.drawable.img_cat
    )

    val imageDetailMammals = intArrayOf(
        R.drawable.img_detail_lion,
        R.drawable.img_detail_dog,
        R.drawable.img_detail_elephant,
        R.drawable.img_detail_cat
    )

    val liveMammals = arrayOf(
        "Gurun",
        "Darat",
        "Hutan, gurun",
        "Darat"
    )

    val foodMammals = arrayOf(
        "Daging",
        "Makanan anjing",
        "Tumbuhan",
        "Daging"
    )

    val descriptionMammals = arrayOf(
        "Singa (bahasa Sanskerta: Siṃha, atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun.\n" +
                "\n" +
                "Singa betina jauh lebih aktif dalam berburu, sedangkan singa jantan lebih santai bersikap menunggu dan meminta jatah dari hasil buruan para betinanya. Singa jantan dipercaya lebih unggul dan perkasa dibandingkan dengan kucing besar lainnya, tetapi kelemahan singa ialah tidak bisa memanjat pohon sebagus kucing-kucing besar lainnya. Singa jantan ditumbuhi bulu tebal di sekitar tengkuknya, hal ini lebih menguntungkan untuk melindungi tengkuknya, terutama dalam perkelahian bebas antara kucing besar yang cenderung menerkam tengkuk untuk melumpuhkan musuhnya.",
        "Anjing atau anjing domestik (Canis lupus familiaris) adalah mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu,[2] bahkan kemungkinan sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA.[3] Penelitian lain mengungkap sejarah domestikasi anjing yang belum begitu lama.[4][5][6]\n" +
                "\n" +
                "Anjing telah berkembang menjadi ratusan ras dengan berbagai macam variasi. Warna rambut anjing bisa beraneka ragam, mulai dari putih sampai hitam, juga merah, abu-abu (sering disebut \"biru\"), dan cokelat\n"+"\n"+"Selain itu, anjing memiliki berbagai jenis rambut. Rambut anjing bisa lurus atau keriting, dan bertekstur kasar hingga lembut seperti benang wol.",
        "Gajah merupakan hewan herbivora yang dapat ditemui di berbagai habitat, seperti sabana, hutan, gurun, dan rawa-rawa. Mereka cenderung berada di dekat air.\n"+ "\n" + "Gajah dianggap sebagai spesies kunci karena dampaknya terhadap lingkungan. Hewan-hewan lain cenderung menjaga jarak dari gajah, dan predator-predator seperti singa, harimau. hyena, dan anjing liar biasanya hanya menyerang gajah muda.\n" + "\n" + "Gajah betina cenderung hidup dalam kelompok keluarga, yang terdiri dari satu betina dengan anak-anaknya atau beberapa betina yang berkerabat beserta anak-anak mereka. Kelompok ini dipimpin oleh individu gajah yang disebut matriark, yang biasanya merupakan betina tertua. Gajah memiliki struktur kelompok fisi-fusi, yaitu ketika kelompok-kelompok keluarga bertemu untuk bersosialisasi.",
        "Kucing peliharaan atau kucing rumah adalah salah satu predator terhebat di dunia. Kucing ini dapat membunuh atau memakan beberapa ribu spesies, kucing besar biasanya kurang dari 100.\n" + "\n" + "Tetapi karena ukurannya yang kecil, kucing tidak begitu berbahaya bagi manusia. Satu-satunya bahaya yang dapat timbul adalah kemungkinan terjadinya infeksi rabies akibat gigitan kucing dan juga cakaran dari kuku kucing yang sangat perih dan menyakitkan. Kucing dapat berakibat fatal bagi suatu ekosistem yang bukan tempat tinggal alaminya. Pada beberapa kasus, kucing berperan atau menyebabkan kepunahan. Kucing menyergap dan melumpuhkan mangsa dengan cara yang mirip dengan singa dan harimau, menggigit leher mangsa dengan gigi taring yang tajam sehingga melukai saraf tulang belakang atau menyebabkan mangsa kehabisan napas dengan merusak tenggorokan."
    )

    val listMammals: ArrayList<Animalpedia>
    get() {
        val listMammals = arrayListOf<Animalpedia>()
        for (position in nameMammals.indices) {
            val animalpedia = Animalpedia(
                name = nameMammals[position],
                live = liveMammals[position],
                food = foodMammals[position],
                description = descriptionMammals[position],
                imageHome = imageHomeMammals[position],
                imageDetail = imageDetailMammals[position]
            )
            listMammals.add(animalpedia)
        }
        return listMammals
    }

    val nameReptile = arrayOf(
        "Buaya",
        "Ular",
        "Kadal",
        "Kura-kura"
    )

    val imageHomeReptile = arrayOf(
        R.drawable.img_crocodile,
        R.drawable.img_snake,
        R.drawable.img_lizard,
        R.drawable.img_turtle
    )

    val imageDetailReptile = arrayOf(
        R.drawable.img_detail_crocodile,
        R.drawable.img_detail_snake,
        R.drawable.img_detail_lizard,
        R.drawable.img_detail_turtle
    )

    val liveReptile = arrayOf(
        "Air Tawar",
        "Hutan",
        "Darat",
        "Darat"
    )

    val foodReptile = arrayOf(
        "Daging",
        "Daging, Telur",
        "Daging, Sayur",
        "Daging, Sayur"
    )

    val descriptionReptile = arrayOf(
        "Buaya adalah reptil bertubuh besar yang hidup di air. Secara ilmiah, buaya meliputi seluruh spesies anggota suku Crocodylidae, termasuk pula buaya sepit (Tomistoma schlegelii). Meski demikian nama ini dapat pula dikenakan secara longgar untuk menyebut ‘buaya’ aligator, kaiman dan gavial; yakni kerabat-kerabat buaya yang berlainan suku. Buaya umumnya menghuni habitat perairan tawar seperti sungai, danau, rawa dan lahan basah lainnya, namun ada pula yang hidup di air payau seperti buaya muara. Makanan utama buaya adalah hewan-hewan bertulang belakang seperti bangsa ikan, reptil dan mamalia, kadang-kadang juga memangsa moluska dan krustasea bergantung pada spesiesnya. Buaya merupakan hewan purba, yang hanya sedikit berubah karena evolusi semenjak zaman dinosaurus.\n"+
                "\n" +
                "Dikenal pula beberapa nama daerah untuk menyebut buaya, seperti misalnya buhaya (Sd.); buhaya (bjn); baya atau bajul (Jw.); bicokok (Btw.), bekatak, atau buaya katak untuk menyebut buaya bertubuh kecil gemuk; senyulong, buaya jolong-jolong (Mly.), atau buaya julung-julung untuk menyebut buaya ikan; buaya pandan, yakni buaya yang berwarna kehijauan; buaya tembaga, buaya yang berwarna kuning kecoklatan; dan lain-lain",
        "Ular merupakan salah satu reptilia yang paling sukses berkembang di dunia. Mereka dapat ditemukan di semua tipe habitat: hutan, padang rumput, gurun/padang pasir, sungai, danau, dataran tinggi, perkebunan, persawahan, laut, dan juga di pemukiman manusia. Akan tetapi, seperti halnya reptilia lainnya, ular tidak terdapat dan tidak bisa ditemukan di daerah dingin seperti di puncak gunung dan di daerah lingkar kutub (beberapa spesies ada yang mampu hidup di daerah dekat kutub utara). Ular juga tidak terdapat dan tidak ditemukan di Irlandia, Selandia baru, Greenland, pulau-pulau terisolasi di Pasifik seperti Hawaii, serta di Samudera Atlantik.\n"+
                "\n"+
                "Sebagian besar ular hidup dan tinggal di tanah, sebagian lagi hidup dan tinggal di atas pohon atau tanaman. Walau begitu,sebagian besar spesies ular di tanah dapat memanjat pohon. Selain di tanah dan pohon, ular juga hidup di perairan, bahkan ada golongan ular yang hidup di air dan tidak pernah berkelana di darat samasekali, misalnya ular-ular golongan Hydrophiidae.",
        "Kadal adalah kelompok reptilia bersisik berkaki empat (beberapa spesies tidak berkaki dan mirip ular, tetapi bukan ular) yang tersebar sangat luas di dunia. Secara ilmiah, kelompok besar ini dikenal sebagai subordo atau anak bangsa Lacertilia (beberapa literatur menyebut Sauria) yang merupakan anggota dari bangsa reptilia bersisik (Squamata) bersama dengan ular.\n"+
                "\n"+
                "Secara umum, istilah \"kadal\" atau \"bengkarung\" (bahasa Inggris: lizards) juga mencakup kelompok cecak, tokek, bunglon, cecak terbang, biawak, iguana, dan lain-lain. Sedangkan secara sempit, istilah kadal (dan bengkarung) dalam bahasa Indonesia hanya merujuk kepada kelompok kadal yang umumnya bertubuh kecil, padat, bersisik licin dan berkilau, serta hidup di tanah (Ingg.: skink, yaitu semua jenis dari famili Scincidae, atau jenis-jenis dari infraordo Scincomorpha).\n" + "\n" + "Kadal pada umumnya memiliki empat kaki, lubang telinga luar, dan kelopak mata yang dapat dibuka-ditutup. Walau begitu, ada pula jenis-jenis yang tidak memiliki sebagian ciri itu. Contohnya adalah ular kaca (glass snake atau glass lizard, suku Anguidae) yang tidak 6 kaki fisik sehingga menyerupai ular, tetapi masih bisa dibedakan dengan ular berdasarkan ciri-ciri yang lain",
        "Kura-kura adalah hewan bersisik berkaki empat yang termasuk golongan reptil. Bangsa hewan yang disebut (ordo) Testudines (atau Chelonians) ini khas dan mudah dikenali dengan adanya ‘rumah’ atau batok (bony shell) yang keras dan kaku.\n"+
                "\n"+
                "Batok kura-kura ini terdiri dari dua bagian. Bagian atas yang menutupi punggung disebut karapas (carapace) dan bagian bawah (ventral, perut) disebut plastron. Kemudian setiap bagiannya ini terdiri dari dua lapis. Lapis luar umumnya berupa sisik-sisik besar dan keras, dan tersusun seperti genting; sementara lapis bagian dalam berupa lempeng-lempeng tulang yang tersusun rapat seperti tempurung. Perkecualian terdapat pada kelompok labi-labi (Trionychoidea) dan jenis penyu belimbing, yang lapis luarnya tiada bersisik dan digantikan lapisan kulit di bagian luar tempurung tulangnya. Dalam bahasa Indonesia, kita mengenal tiga kelompok hewan yang termasuk bangsa ini, ialah penyu (bahasa Inggris: sea turtles), labi-labi atau bulus (freshwater turtles), dan kura-kura (tortoises). Dalam bahasa Inggris, dibedakan lagi antara kura-kura darat (land tortoises) dan kura-kura air tawar (freshwater tortoises atau terrapins)."
    )
    val listReptile: ArrayList<Animalpedia>
        get() {
            val listReptile = arrayListOf<Animalpedia>()
            for (position in nameReptile.indices) {
                val animalpedia = Animalpedia(
                    name = nameReptile[position],
                    live = liveReptile[position],
                    food = foodReptile[position],
                    description = descriptionReptile[position],
                    imageHome = imageHomeReptile[position],
                    imageDetail = imageDetailReptile[position]
                )
                listReptile.add(animalpedia)
            }
            return listReptile
        }

    val namePisces = arrayOf(
        "Paus",
        "Anjing Laut",
        "Lumba-lumba",
        "Kepiting"
    )

    val imageHomePisces = arrayOf(
        R.drawable.img_whale,
        R.drawable.img_seals,
        R.drawable.img_dolphin,
        R.drawable.img_crab
    )

    val imageDetailPisces = arrayOf(
        R.drawable.img_detail_whale,
        R.drawable.img_detail_seals,
        R.drawable.img_detail_dolphin,
        R.drawable.img_detail_crab
    )

    val livePisces = arrayOf(
        "Laut",
        "Laut",
        "Laut",
        "Laut"
    )

    val foodPisces = arrayOf(
        "Ikan kecil",
        "Ikan, Daging",
        "Ikan",
        "Alga"
    )

    val descriptionPisces = arrayOf(
        "Paus atau lodan (khusus yang bergigi dan bukan berukuran kecil) adalah kelompok mamalia yang hidup di lautan. Ikan ini sangat besar. Paus bukan tergolong dalam keluarga ikan.ada masa kini dikenal dua kelompok paus, yaitu paus bergigi (Odontoceti) dan paus tidak bergigi (Mysticeti).\n" + "\n" + "Paus Odontoceti yang bergigi merupakan pemangsa yang memakan ikan, sotong, dan mamalia laut, mempunyai satu lubang pernapasan. Paus bergigi berkerabat dekat dengan lumba-lumba dan pesut. Paus tidak bergigi berukuran lebih besar daripada paus bergigi dan mempunyai struktur yang dikenal sebagai balin yang berbentuk sikat. Struktur ini berguna untuk menyaring plankton, makanannya, di air. Paus berbalin mempunyai dua lubang pernapasan.",
        "Anjing laut umumnya bertubuh licin dan cukup besar. Tubuhnya beradaptasi dengan baik untuk habitat akuatiknya, di mana mereka menghabiskan sebagian besar masa hidupnya. Sebagai tangan, kaki depannya berukuran besar dan berbentuk seperti sirip, dan tubuhnya menyempit ke belakang.\n" + "\n" + "Anjing laut terkecil, yaitu Arctocephalus galapagoensis memiliki berat sekitar 30 kg untuk ukuran dewasa dan panjang 1.2 meter. Anjing laut terbesar, yaitu anjing laut gajah selatan (Mirounga leonina) memiliki panjang maksimal hingga 4 meter dan berat 2200 kg.Semua jenis anjing laut merupakan hewan karnivora yang memakan ikan, cumi dan hewan laut lainnya. Anjing laut leopard (Hydrurga leptonyx) kemungkinan merupakan predator terbesar di antara jenis-jenis anjing laut lainnya, yang memakan berbagai macam hewan dari kril,penguin hingga anjing laut lainnya.",
        "Lumba-lumba adalah mamalia laut yang sangat cerdas, selain itu sistem alamiah yang melengkapi tubuhnya sangat kompleks. Sehingga banyak teknologi yang terinspirasi dari lumba-lumba. Salah satu contoh adalah kulit lumba-lumba yang mampu memperkecil gesekan dengan air, sehingga lumba-lumba dapat berenang dengan sedikit hambatan air. Hal ini yang digunakan para perenang untuk merancang baju renang yang mirip kulit lumba-lumba.\n"+
                "\n"+
                "Lumba-lumba tergolong sebagai mamalia yang cerdas. Lumba-lumba dapat menolong manusia, bila lumba-lumba sudah terlatih, bahkan lingkaran api pun dapat mereka terobos. Singa laut, spesies primata, paus dan anjing juga termasuk binatang yang cerdas.\n" + "\n" + "Lumba-lumba yang sudah terlatih dapat melakukan berbagai atraksi dan mereka juga dapat berhitung, tetapi Lumba-lumba liar belum dapat melakukan berbagai atraksi. Sekarang ini, lumba-lumba dan paus sudah langka, maka lumba-lumba dan paus harus dilindungi. Lumba-lumba dan paus telah mulai dilindungi di seluruh dunia",
        "Kepiting adalah binatang anggota krustasea berkaki sepuluh dari upabangsa (infraordo) Brachyura, yang dikenal mempunyai \"ekor\" yang sangat pendek (bahasa Yunani: brachy = pendek, ura = ekor), atau yang perutnya (abdomen) sama sekali tersembunyi di bawah dada (thorax).\n" + "\n" + "Tubuh kepiting dilindungi oleh cangkang yang sangat keras, tersusun dari kitin, dan dipersenjatai dengan sepasang capit. Ketam adalah nama lain bagi kepiting.Kepiting terdapat di semua samudra dunia. Ada pula kepiting air tawar dan darat, khususnya di wilayah-wilayah tropis. Rajungan adalah kepiting yang hidup di perairan laut dan jarang naik ke pantai, sedangkan yuyu adalah ketam penghuni perairan tawar (sungai dan danau). Kepiting beraneka ragam ukurannya, dari ketam kacang, yang lebarnya hanya beberapa milimeter, hingga kepiting laba-laba Jepang, dengan rentangan kaki hingga 4 m "
    )

    val listPisces: ArrayList<Animalpedia>
        get() {
            val listPisces = arrayListOf<Animalpedia>()
            for (position in namePisces.indices) {
                val animalpedia = Animalpedia(
                    name = namePisces[position],
                    live = livePisces[position],
                    food = foodPisces[position],
                    description = descriptionPisces[position],
                    imageHome = imageHomePisces[position],
                    imageDetail = imageDetailPisces[position]
                )
                listPisces.add(animalpedia)
            }
            return listPisces
        }

    val nameAves = arrayOf(
        "Merpati",
        "Merak",
        "Elang",
        "Burung Hantu"
    )

    val imageHomeAves = arrayOf(
        R.drawable.img_pigeon,
        R.drawable.img_peacock,
        R.drawable.img_eagle,
        R.drawable.img_owl
    )

    val imageDetailAves = arrayOf(
        R.drawable.img_detail_pigeon,
        R.drawable.img_detail_peacock,
        R.drawable.img_detail_eagle,
        R.drawable.img_detail_owl
    )

    val liveAves = arrayOf(
        "Di semua habitat",
        "Dataran rendah",
        "Dataran tinggi",
        "Hutan"
    )

    val foodAves = arrayOf(
        "Biji-bijian",
        "Biji-bjian",
        "Daging",
        "Daging"
    )

    val descriptionAves = arrayOf(
        "Merpati dan dara termasuk dalam famili Columbidae atau burung berparuh merpati dari ordo Columbiformes, yang mencakup sekitar 300 spesies burung kerabat pekicau.\n" + "\n" + "Dalam percakapan umum, istilah \"dara\" dan \"merpati\" dapat saling menggantikan. Dalam praktik ornitologi, terdapat suatu kecenderungan \"dara\" digunakan untuk spesies yang lebih kecil dan \"merpati\" untuk yang besar, tetapi hal ini tidak secara konsisten diterapkan, dan secara historis nama umum untuk burung-burung tersebut memiliki banyak variasi antara istilah \"dara\" dan \"merpati.\" Famili ini terdapat di seluruh dunia, tetapi varietas terbesar terdapat di Indomalaya dan Ekozona Australasia. Dara dan merpati muda disebut \"squabs.\"Merpati dan dara adalah burung berbadan gempal dengan leher pendek dan paruh ramping pendek dengan cere berair\n."+ "\n"+ "Spesies yang umumnya dikenal sebagai \"merpati\" adalah merpati karang liar, umum digunakan di banyak kota.Dara dan merpati membangun sangkarnya dari ranting dan sisa-sisa lainnya, yang ditempatkan di pepohonan, birai, atau tanah, tergantung spesiesnya. Mereka mengerami satu atau dua telur, dan kedua induknya sangat memedulikan anaknya, yang akan meninggalkan sangkarnya setelah 7 hingga 28 hari.[1] Dara makan biji, buah dan tanaman. Tidak seperti kebanyakan burung lainnya (namun lihat juga flamingo), dara dan merpati menghasilkan \"susu tembolok.\" Kedua jenis kelamin menghasilkan zat bernutrisi tinggi ini untuk memberi makan anaknya.",
        "Merak biru atau Merak india, yang dalam nama ilmiahnya Pavo cristatus adalah salah satu burung dari tiga spesies burung merak. Merak biru mempunyai bulu berwarna biru gelap mengilap.\n" + "\n"+ "Burung jantan dewasa berukuran besar, panjangnya dapat mencapai 230 cm, dengan penutup ekor yang sangat panjang berwarna hijau metalik. Di atas kepalanya terdapat jambul tegak biru membentuk kipas. Burung betina berukuran lebih kecil dari burung jantan. Bulu-bulunya tidak mengilap, berwarna coklat kehijauan dengan garis-garis hitam dan tanpa dihiasi bulu penutup ekor. Burung muda seperti betina. Populasi Merak biru tersebar di hutan terbuka dengan padang rumput di India, Pakistan, Sri Lanka, Nepal dan Bhutan. Sebelumnya spesies ini ditemukan juga di Bangladesh, tetapi sekarang kemungkinan besar telah punah di sana. Merak jantan adalah poligami spesies, mempunyai pasangan lebih dari satu. Pada musim berbiak, burung jantan memamerkan bulu ekornya di depan burung betina. Bulu-bulu penutup ekor dibuka membentuk kipas dengan bintik berbentuk mata berwarna biru. Burung betina biasanya menetaskan tiga sampai enam butir telur. Pakan burung Merak biru terdiri dari aneka biji-bijian, pucuk rumput dan dedaunan, aneka serangga, serta berbagai jenis hewan kecil seperti cacing, laba-laba dan kadal kecil. Merak biru adalah burung nasional negara India. Spesies ini juga memegang peranan penting dalam mitologi Buddha, Hindu dan kebudayaan-kebudayaan lainnya.",
        "Elang adalah hewan berdarah panas, mempunyai sayap dan tubuh yang diselubungi bulu pelepah. Sebagai burung, elang berkembang biak dengan cara bertelur yang mempunyai cangkang keras di dalam sarang yang dibuatnya.\n" + "\n" + "Ia menjaga anaknya sampai mampu terbang.Elang merupakan hewan pemangsa. Makanan utamanya hewan mamalia kecil seperti tikus, tupai, kadal, ikan dan ayam, juga jenis-jenis serangga tergantung ukuran tubuhnya.\n" + "\n" + "Terdapat sebagian elang yang menangkap ikan sebagai makanan utama mereka.Biasanya elang tersebut tinggal di wilayah perairan. Paruh elang tidak bergigi tetapi melengkung dan kuat untuk mengoyak daging mangsanya. Burung ini juga mempunyai sepasang kaki yang kuat dan kuku yang tajam dan melengkung untuk mencengkeram mangsa serta daya penglihatan yang tajam untuk memburu mangsa dari jarak jauh tak terkira. Elang mempunyai sistem pernapasan yang baik dan mampu untuk membekali jumlah oksigen yang banyak yang diperlukan ketika terbang. Jantung burung elang terdiri dari empat bilik seperti manusia. Bilik atas dikenal sebagai atrium, sementara bilik bawah dikenali sebagai ventrikel.",
        "Burung hantu adalah kelompok burung yang merupakan anggota ordo Strigiformes. Burung ini termasuk golongan burung buas (karnivora, pemakan daging) dan merupakan hewan malam (nokturnal).\n" + "\n" + "Seluruhnya, terdapat sekitar 222 spesies yang telah diketahui, yang menyebar di seluruh dunia kecuali Antarktika, sebagian besar Greenland, dan beberapa pulau-pulau terpencil. Di dunia barat, hewan ini dianggap simbol kebijaksanaan, tetapi di beberapa tempat di Indonesia dianggap pembawa pratanda maut, maka namanya Burung Hantu. Walau begitu tidak di semua tempat di Nusantara burung ini disebut sebagai burung hantu. Di Jawa misalnya, nama burung ini adalah darès atau manuk darès yang tidak ada konotasinya dengan maut atau hantu. Di Sulawesi Utara, burung hantu dikenal dengan nama Manguni.\n"+
                "\n"+
                "Burung hantu dikenal karena matanya besar dan menghadap ke depan, tak seperti umumnya jenis burung lain yang matanya menghadap ke samping. Bersama paruh yang bengkok tajam seperti paruh elang dan susunan bulu di kepala yang membentuk lingkaran wajah, tampilan \"wajah\" burung hantu ini demikian mengesankan dan kadang-kadang menyeramkan. Apalagi leher burung ini demikian lentur sehingga wajahnya dapat berputar 180 derajat ke belakang. Umumnya burung hantu berbulu burik, kecoklatan atau abu-abu dengan bercak-bercak hitam dan putih. Dipadukan dengan perilakunya yang kerap mematung dan tidak banyak bergerak, menjadikan burung ini tidak mudah kelihatan; begitu pun ketika tidur di siang hari di bawah lindungan daun-daun. Ekor burung hantu umumnya pendek, namun sayapnya besar dan lebar. Rentang sayapnya mencapai sekitar tiga kali panjang tubuhnya."
    )

    val listAves: ArrayList<Animalpedia>
        get() {
            val listAves = arrayListOf<Animalpedia>()
            for (position in nameAves.indices) {
                val animalpedia = Animalpedia(
                    name = nameAves[position],
                    live = liveAves[position],
                    food = foodAves[position],
                    description = descriptionAves[position],
                    imageHome = imageHomeAves[position],
                    imageDetail = imageDetailAves[position]
                )
                listAves.add(animalpedia)
            }
            return listAves
        }
}