# Laporan Praktikum #11 - GUI

## Kompetensi
Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu:
1. Membuat aplikasi Graphical User Interface sederhana dengan bahasa pemrograman java;
2. Mengenal komponen GUI seperti frame, label, textfield, combobox, radiobutton, checkbox,
textarea, menu, serta table;
3. Menambahkan event handling pada aplikasi GUI.

## Ringkasan Materi

GUI (_Graphical User Interface_) menurut sepemahaman saya adalah bentuk desain dari program yang telah dibuat sebelumnya, fungsinya untuk mempermudah user menggunakan aplikasi tersebut. Sehingga user tidak perlu membaca ribuan baris kode saat menggunakan aplikasi tersebut.

## Praktikum
### Percobaan 1
Percobaan pertama ini hanya membuat frame sederhana.

![skrinsut hasil 1](img/hasil_1.png)
 

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

- [Kalkulator](../../src/10_Polimorfisme/tugaszombiejs10/Tester1841720184Yusril.java)


## Kesimpulan

GUI merupakan interface yang mempermudah user untuk berinteraksi dengan koputer. Pembuatan GUI bisa menggunakan GUI Layout atau dengan Native Code. GUI pada java memanfaatkan library swing yang merupakan turunan dari library awt.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***Muhammad Yusril Hasriansyah***