package com.example.ilhamrofiqi.negaraasean;

import java.util.ArrayList;

public class AseanData {
    public static String[][] data = new String[][]{
            {"Filipina","Negara Pendiri ASEAN","https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_the_Philippines.svg/800px-Flag_of_the_Philippines.svg.png","Filipina adalah negara paling maju di Benua Asia setelah Perang Dunia II, namun sejak saat itu telah tertinggal di belakang negara-negara lain akibat pertumbuhan ekonomi yang lemah, penyitaan kekayaan yang dilakukan pemerintah, korupsi yang luas, dan pengaruh-pengaruh neo-kolonial.","Manila","Inggris dan Tagalog","12 juni 1898","Peso Filipina","300.000 km2"},
            {"Indonesia","Negara Pendiri ASEAN","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/450px-Flag_of_Indonesia.svg.png","Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau.","Jakarta","Indonesia","17 agustus 1945","Rupiah","1.904.596 km2"},
            {"Malaysia","Negara Pendiri ASEAN","https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Flag_of_Malaysia.svg/800px-Flag_of_Malaysia.svg.png","Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km persegi. Ibukotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal. Jumlah penduduk negara ini melebihi 27 juta jiwa.","Kuala Lumpur","Bahasa Melayu","31 Agustus 1957","Ringgit","329.847 km2"},
            {"Singapura","Negara Pendiri ASEAN","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Singapore.svg/800px-Flag_of_Singapore.svg.png","Singapura adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya, 137 kilometer (85 mi) di utara khatulistiwa di Asia Tenggara. Negara ini terpisah dari Malaysia oleh Selat Johor di utara, dan dari Kepulauan Riau, Indonesia oleh Selat Singapura di selatan.","Singapura","Inggris, Melayu, Mandarin, Tamil","9 Agustus 1965","Dolar Singapura","716 km2"},
            {"Thailand","Negara Pendiri ASEAN","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Flag_of_Thailand.svg/800px-Flag_of_Thailand.svg.png","Thailand adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat. Kerajaan Thai dahulu dikenal sebagai Siam sampai tanggal 11 Mei 1949. Kata Thai (ไทย) berarti kebebasan dalam bahasa Thai, namun juga dapat merujuk kepada suku Thai.","Bangkok","Thai","11 Mei 1949","Bath","513.120 km2"},
            {"Brunei Darussalam","Bergabung pada 7 Januari 1984","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Brunei.svg/800px-Flag_of_Brunei.svg.png","Brunei Darussalam adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. Negara ini memiliki wilayah seluas 5.765 km² yang menempati pulau Borneo dengan garis pantai seluruhnya menyentuh Laut Cina Selatan. Wilayahnya dipisahkan ke dalam dua negara bagian di Malaysia yaitu Sarawak dan Sabah.","Bandar Seri Begawan","Melayu","1 Januari 1984","Dolar Brunei","5.765 km2"},
            {"Vietnam","Bergabung pada 28 Juli 1995","https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/800px-Flag_of_Vietnam.svg.png","Vietnam adalah negara paling timur di Semenanjung Indochina di Asia Tenggara. Vietnam berbatasan dengan Republik Rakyat Tiongkok di sebelah utara, Laos di sebelah barat laut, Kamboja di sebelah barat daya dan di sebelah timur terbentang Laut China Selatan.","Hanaoi","Vietnam","2 September 1945","Dong","332.698 km2"},
            {"Laos","Bergabung pada 23 Juli 1997","https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Flag_of_Laos.svg/600px-Flag_of_Laos.svg.png","Laos adalah negara yang terkurung daratan di Asia Tenggara, berbatasan dengan Myanmar dan Republik Rakyat Tiongkok di sebelah barat laut, Vietnam di timur, Kamboja di selatan, dan Thailand di sebelah barat. Dari abad ke-14hingga abad ke-18, negara ini disebut Lan Xang atau Negeri Seribu Gajah.","Vientiane","Laos","22 Oktober 1953","Kip","236.800 km2"},
            {"Myanmar","Bergabung pada 23 Juli 1997","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_Myanmar.svg/800px-Flag_of_Myanmar.svg.png","Myanmar adalah sebuah negara berdaulat di Asia Tenggara. Myanmar berbatasan dengan India dan Bangladesh di sebelah barat, Thailand dan Laos di sebelah timur dan Chinadi sebelah utara dan timur laut.","Naypyidaw","Myanmar","4 Januari 1948","Kyat","676.578 km2"},
            {"Kamboja","Bergabung pada 30 April 1999","https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_Cambodia.svg/625px-Flag_of_Cambodia.svg.png","Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14.","Phnom Penh","Khmer","9 November 1953","Reil","676.578 km2"},
    };

    public static ArrayList<Asean> getListData(){
        Asean asean = null;
        ArrayList<Asean> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
            asean = new Asean();
            asean.setName(data[i][0]);
            asean.setRemarks(data[i][1]);
            asean.setPhoto(data[i][2]);
            asean.setDeskripsi(data[i][3]);
            asean.setIbukota(data[i][4]);
            asean.setBahasa(data[i][5]);
            asean.setMerdeka(data[i][6]);
            asean.setMatauang(data[i][7]);
            asean.setLuas(data[i][8]);

            list.add(asean);
        }
        return list;
    }
}
