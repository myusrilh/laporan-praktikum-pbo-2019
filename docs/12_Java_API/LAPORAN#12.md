# Laporan Praktikum #12 - GUI

## Kompetensi
* Memahami cara penyimpanan objek menggunakan Collection dan Map.
* Mengetahui pengelompokan dari Collection.
* Mengetahui perbedaan dari interface Set, List dan Map.
* Mengetahui penggunaan class-class dari interface Set, List, dan Map.
* Memahami koneksi database menggunakan JDBC dan JDBC API

## Ringkasan Materi

Collection adalah sebuah objek yang digunakan untuk menyimpan sekumpulan objek. Bisa berupa objek yang berbeda beda tipe data. Terdapat tiga macam collection, yaitu **Set**,**List** dan **Map**. Untuk **Collection Set** objeknya harus bersifat unik, dengan kata lain harus berbeda satu sama lain. Jika ada yang sama maka ketika dimunculkan hanya salah satu yang dimunculkan. Untuk **Collection List**  bisa menerima duplikat. Cara penyimpanannya seperti array namun Array. dan untuk **Collection Map** dia menyimpan seperti array juga hanya saja memanfaatkan key dan value.

Ada juga untuk penerapan API memanfaatkan JDBC API (Java Database Connectivity API). Beberapa fungsi dari JDBC adalah: 
- Membangun koneksi antara aplikasi Java dan database
- Membangun dan mengeksekusi query
- Memproses hasil

## Praktikum
### Percobaan 1
Untuk percobaan ini melakukan percobaan mengenai HashSet, yaitu penampungan nilai yang berbeda tipe data dan tidak berduplikat. Saya juga mencoba menjalankan perintah TreeSet pada percobaan ini, hasilnya untuk pemunculan data pada TreeSet tampil secara terurut.

![skrinsut hasil 1](img/hasil_1.png)

#### Pertanyaan
1. Fungsi _import java.util.*_ adalah meng-*import* library java.util yang kemudian bisa mengimplementasikan method atau method yang bisa diakses dari library tersebut.

2. Pada kode program `Set mSetCity = new HashSet();`

3. Untuk menambahkan objek pada HashSet yang objek tersebut bernama **Malang**, **Banyuwangi**, **Jogjakarta**, dan **Batu**.

4. Terjadi error karena objek dipanggil (`set`) belum diinstansiasi.


#### Kode Program

- [Hello Gui](../../src/11_GUI/HelloGui1841720184Yusril.java)



### Percobaan 2
Percobaan kedua ini adalah mengenai inputan pada GUI, baik cara _setting_ ***textfield*** nya hingga cara mengambil data dari inputan pada textfield tersebut.

![hasil 2](img/hasil_2.PNG)

#### Pertanyaan
Berikut adalah hasil modifikasi dari kode program diatas.

![skrinsut pertanyaan](img/hasil_pertanyaan_percobaan_2.PNG)

#### Kode Program

- [My Input Form](../../src/11_GUI/MyInputForm1841720184Yusril.java)
- [Main Program](../../src/11_GUI/MainProgram1841720184Yusril.java)



### Percobaan 3
Percobaan ketiga ini adalah melakukan manajemen pada layout GUI, yaitu mengatur posisi dan ukuran dari layout. Terdapat tiga macam layout pada GUI  yaitu **Box**, **Grid**, dan **Border**

![hasil 3](img/hasil_3.png)

#### Pertanyaan
1. Perbedaan dari **Grid**, **Box** dan **Border** Layout adalah pada peletakan posisi dan tampilannya pada saat program berjalan

2. fungsi dari 
- JFrame frameObject = new (Layout()) adalah untuk melakukan casting sesuai layout yang diinginkan, gunanya untuk membuat layout terpanggil pada sebuah frame.
- `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` berfungsi untuk mengatur program otomatis stop ketika frame di*close*
- `setVisible(true)` berfungsi untuk menampilkan Frame

#### Kode Program

- [Box](../../src/11_GUI/Box1841720184Yusril.java)
- [Grid](../../src/11_GUI/Grid1841720184Yusril.java)
- [Border](../../src/11_GUI/Border1841720184Yusril.java)
- [Layout GUI](../../src/11_GUI/LayoutGUI1841720184Yusril.java)

### Percobaan 4

percobaan keempat ini adalah memanfaatkan GUI secara langsung dengan kombinasi sedikit _native code_.

![hasil 4](img/hasil_4.png)

#### Pertanyaan
1. Untuk membuat JFrame muncul dan menjadi terlihat.

2. Karena terdapat dua tombol pilihan logika untuk checkbox dan radio button sehingga ketika hendak mengganti pilihan dari satu radio ke satunya maka hasilnya atau outputnya pun bisa berganti

3. hasil modifikasi:
![ss hasil 4 modif](img/hasil_4_modif.png)

#### Kode Program
- [Swing Java](../../src/11_GUI/Swing1841720184Yusril.java)
- [Swing Form](../../src/11_GUI/Swing1841720184Yusril.form)

### Percobaan 5
Percobaan terakhir ini adalah memanfaatkan panel tab.

![hasil 5](img/hasil_5.png)

#### Pertanyaan
1. JTabpane berfungsi untuk membuat beberapa halaman pada satu panel dengan memanfaatkan tab dan JTree berfungsi untuk menampilkan struktur isi folder 

2. 
- Halaman Pertama
![modif 1](img/hasil_5_modif_1.png)

- Halaman Kedua
![modif 2](img/hasil_5_modif_2.png)

### Kode Program
- [Swing 2 Java](../../src/11_GUI/Swing21841720184Yusril.java)
- [Swing 2 Form](../../src/11_GUI/Swing21841720184Yusril.form)

## Tugas
Tugas kali ini mmebuat kalkulator sederhana.

![hasil tugas](img/hasil_tugas.png)

### Kode Program

- [Kalkulator Java](../../src/11_GUI/Kalkulator1841720184Yusril.java)
- [Kalkulator Form](../../src/11_GUI/Kalkulator1841720184Yusril.form)


## Kesimpulan

GUI merupakan interface yang mempermudah user untuk berinteraksi dengan koputer. Pembuatan GUI bisa menggunakan GUI Layout atau dengan Native Code. GUI pada java memanfaatkan library swing yang merupakan turunan dari library awt.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***Muhammad Yusril Hasriansyah***