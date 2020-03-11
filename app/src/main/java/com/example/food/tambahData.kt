package com.example.food

//Membuat List ResepData
fun tambahData(): List<ResepData> {
    val partList = ArrayList<ResepData>()
    partList.add(
        ResepData(
            "Sayur Asem",
            "Sayur asem merupakan salah satu resep masakan jawa yang  enak, murah, dan juga  mudah dibuatnya. Masakan ini memiliki karakter rasa yang asam dan segar. Sayur asem termasuk dalam makan favorit dari berbagai kalangan masyarakat.",
            "- Jagung manis 2 Buah, potong 3 bagian" +
                    "\n- Kacang panjang 200 gram"+
                    "\n- Tomat" +
                    "\n- Tomat" +
                    "\n- Labu Siam 1-2 buah"+
                    "\n- Lengkuas, 1 cm" +
                    "\n- Daun Salam, 3 lembar"+
                    "\n- Asam Muda, 3 Buah"+
                    "\n- Air asam jawa, secukupnya"+
                    "\n- Garam secukupnya"
            ,
            "1. Langkah pertama yang perlu dilakukan dalam membuatnya adalah Rebus asam muda dan daun salam, biarkan mendidih" +
                    "\n2. lalu tambahkan tomat utuh. Jika tomat sudah matang, bisa angkat tomat, tumbuk, lalu disaring. Masukkan air tomat ke dalam panci dan buang sisa ampasnya." +
                    "\n3. Setelah itu bisa masukkan bumbu halus, didihkan kembali. Lalu masukkan jagung manis, kacang panjang, dan labu siam." +
                    "\n4. Didihkan dengan api sedang hingga matang. Bumbui dengan garam dan sedikit gula, serta masukkan air asam jawa." +
                    "\n5. Koreksi dan cicipi rasa hingga sesuai dengan yang diinginkan."
            ,
            R.drawable.sayur_asem
        )
    )
    partList.add(
        ResepData(
            "Lodeh",
            "Sayur lodeh ini benar-benar khas. Dan mempunyai cita rasa  yang sangat enak dan segar. Hal ini, menjadikan makanan yang satu ini, juga cukup dikenal oleh para turis asing mancanegara pula.",
            "- 2000 cc santan dari 2 butir kelapa" +
                    "\n- 200 gram nangka muda, potong" +
                    "\n- 100 gram daun melinjo muda" +
                    "\n- 300 gram labu siam, potong" +
                    "\n- 8 kacang panjang yang dipotong-potong" +
                    "\n- 3 cm lengkuas" +
                    "\n- 3 buah cabai hijau, iris" +
                    "\n- 2 lembar daun salam" +
                    "\n- 1 buah terong, potong",
            "1. Pertama-tama rebuslah santan bersama dengan bumbu halus, lengkuas dan daun salam. Tunggulah sampai mengeluarkan bau yang harum." +
                    "\n2. Setelah agak matang, bisa masukkan dan campurkan nangka muda, gula merah, serta garam ke dalamnya." +
                    "\n3. Dan rebus kembali rebusan santan tadi bersama bumbu yang sudah dimasukkan." +
                    "\n4. Sambil merebus bahan tersebut, dapat tambahkan labu siam, kacang panjang, cabai hijau, terong, dan daun melinjo yang telah disiapkan." +
                    "\n5. Terakhir masak sampai dan tunggu sampai sayur lodeh benar-benar matang.",
            R.drawable.lodeh
        )
    )
    partList.add(
        ResepData(
            "Rawon",
            "Sajian ini adalah masakan khas dari Jawa Timur, dengan potongan daging yang lembut serta kuah warna hitam khas dari buah kluwak.",
            "- 500 gram daging sandung lamur (brisket)" +
                    "\n- 6 lembar daun jeruk" +
                    "\n- 3 batang serai, geprek" +
                    "\n- 1 ruas lengkuas" +
                    "\n- Bawang merah dan bawang putih 4 buah" +
                    "\n- Kluwek ukuran sedang, keruk isinya 4 butir" +
                    "\n- Kemiri, sangrai 2 cm" +
                    "\n- Kunyit 1 1/2 sdt",
            "1. Langkah pertama yang perlu dilakukan yaitu makanan rebus dahulu daging sampai cukup matang dan empuk." +
                    "\n2. Selanjutnya angkat dari air rebusan tadi dan potong daging yang sudah dimasak tadi kecil-kecil atau sesuai selera." +
                    "\n3. Kemudian bisa saring air kaldu dari hasil rebusan yang tadi, lalu masukkan kembali daging yang sudah dipotong-potong tadi bersama dengan serai, daun jeruk, beserta juga lengkuas." +
                    "\n4. Masak semua bumbu halus dan campurkan kluwek. Setelah itu campurkan dan tuangkan ke dalam rebusan daging." +
                    "\n5. Masak hingga matang dan daging empuk. Jika air sudah menyusu, tetapi daging belum empuk, bisa beri air lagi secukupnya dan masak kembali rawon sampai daging benar-benar matang dan empuk.",
            R.drawable.rawon
        )
    )
    partList.add(
        ResepData(
            "Gudeg",
            "Gudeg adalah masakan dengan sayur nangka yang dimasak menggunakan santan hingga dapat menghasilkan kuah yang kental.",
            "- Nangka muda, potong kotak sedang 200 gram" +
                    "\n- Santan pekat 3 gelas" +
                    "\n- Telur ayam, rebus 5 butir" +
                    "\n- Daun jati- 5 lembar" +
                    "\n- Daun salam – 5 lembar" +
                    "\n- Lengkuas- 3 cm" +
                    "\n- Kemiri- 5 buah" +
                    "\n- Ketumbar",
            "1. Pertama panaskan air banyak di dalam panci. Lalu selanjutnya bisa tambahkan nangka muda, daun jati 3 lembar, lengkuas ½ bagian, dan juga daun salam." +
                    "\n2. Rebus semua bahan tersebut, sampai empuk dan berubah warna kemerahan, Proses ini dapat dilakukan selama kurang lebih sekitar 1 jam, Setelah itu bisa angkat hasil rebusan tadi dan bilas dengan menggunakan air bersih yang matang." +
                    "\n3. Setelah itu bisa tiriskan lagi, dan masaklah nangka bersama bumbu bumbu halus yang sudah disiapkan. Lalu beri separuh santan sesuai takaran." +
                    "\n4. Masukkan telur rebus, dan tambahkan 2 lembar daun salam, sisa lengkuas, gula merah, kecap, dan garam. Aduk terus sampai santan dapat meresap dan menyusut." +
                    "\n5. Selanjutnya, tutuplah pancinya lalu tunggu dan biarkan gudeg sampai mengering. Proses ini bisa ditunggu selama kurang lebih sekitar 2 jam." +
                    "\n6. Setelah 2 jam bisa buka gudeg tadi, dan diamkan gudeg selama satu malam."+
                    "\n7. Jika akan dihidangkan dapat panaskan kembali gudeg tersebut."+
                    "\n8. Hasil masakan gudeg ini akan mendapatkan hasil yang baik jika kering dan berwarna merah kehitaman.",
            R.drawable.gudeg
        )
    )
    partList.add(
        ResepData(
            "Orek Tempe",
            "Orek tempe merupakan makanan khas yang dikenal oleh berbagai kalangan masyarakat. Hampir setiap orang pasti pernah merasakan enaknya masakan dari olahan tempe satu ini.",
            "- Tempe 500 gram, Potong berbentuk dadu" +
                    "\n- Lengkuas 2 jangan lupa kupas kulitnya" +
                    "\n- Daun salam 1 lembar" +
                    "\n- Kecap manis" +
                    "\n- Gula, garam, minyak",
            "1. Cara pertama tumis dan masak bawang putih dengan minyak secukupnya saja. Masak bawang putih tersebut sampai bau harum dan jangan terlalu matang." +
                    "\n2. Selanjutnya, tambahkan lengkuas dan daun salam. Lalu tumis bumbu-bumbu tesebut sampai berubah warnanya." +
                    "\n3. Jika tumisan tadi telah matang dan berubah warnanya, masukkan tempe yang sudah diiris-iris, dan tambahkan juga gula, garam, penyedap rasa, dan kecap secukupnya jangan terlalu banyak." +
                    "\n4. Terakhir aduk dan tumis tempe tadi bersama bumbunya sampai tercampur dengan rata. Selanjutnya bisa beri sedikit air, lalu tunggu sampai benar-benar matang. Ingat memasaknya menggunakan api yang sedang saja.  Orek tempe pun sudah siap dihidangkan.",
            R.drawable.orek_tempe
        )
    )
    return partList
}
