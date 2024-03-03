# Laporan Praktikum Pertemuan 3
<b>NAMA : Octrian Adiluhung TIto Putra<b><br>
<b>KELAS : TI-1H<b><br>
<b>ABSEN : 22<b><br>
<b>NIM : 2341720078<b><br>
<br>

## Percobaan 1 : : Membuat Array dari Object, Mengisi dan Menampilkan 
### OUTPUT : 
<br>
<img src="Output percobaan 1.png">
<br>
Pertanyaan :
<br>
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!
<br>
- Tidak, sebuah class yang akan digunakan untuk membuat array of objects tidak harus memiliki atribut dan method secara wajib. Kehadiran atribut dan method tergantung pada kebutuhan fungsionalitas dari objek yang direpresentasikan oleh class tersebut.
<br><br>
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :
<br>
<img src="1.1.png" height = 35px>
<br>
- Ya, class PersegiPanjang memiliki konstruktor default secara implisit yang disediakan oleh Java. Meskipun konstruktor tidak didefinisikan secara eksplisit dalam kode, Java akan menyediakan konstruktor default secara otomatis jika tidak ada konstruktor lain yang didefinisikan.
<br><br>
3. Apa yang dimaksud dengan kode berikut ini :
<br>
<img src="1.2.png" height = 25px width = 500px>
<br>
- Kode tersebut merupakan inisialisasi dari sebuah array objek dari kelas PersegiPanjang dengan length array 3.
<br><br>
4. Apa yang dimaksud dengan kode berikut ini :
<br>
<img src ="1.3.png">
<br>
- Baris kode tersebut merupakan proses pembuatan object dan mengisi atribut dari object tersebut
<br><br>
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
<br>
- Karena class PersegiPanjang merupakan konstruktor object
<br>

## Percobaan 2: Menerima Input Isian Array Menggunakan Looping
### OUTPUT
<br>
<img src="Output percobaan 2.png" height = 400px width = 250px>
<br>
Pertanyaan
<br>
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
<br>
- Ya, array of object dapat diimplementasikan dalam array 2 dimensi. Dalam konteks ini, array 2 dimensi akan menjadi array yang berisi objek-objek, di mana setiap elemen dari array utama adalah array lagi yang berisi objek-objek.
<br><br>
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
<br>
<img src="contoh.png">
<br><br>
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
dibawah ini akan memunculkan error saat dijalankan. Mengapa?
<br>
<img src="2.1.png">
<br>
- Objek tersebut belum diinstansiasi
<br><br>
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
<br>
<img src="contoh2.png">
<br><br>
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
pada ppArray[i] sekaligus ppArray[0]? Jelaskan !
<br>
- Boleh jika proses instansiasi menggunakan looping. Jika tidak,maka akan mendapatkan kompilasi yang menghasilkan eror
<br>

## Percobaan 3: Penambahan Operasi Matematika di Dalam Method
### OUTPUT
<br>
<img src= "Output percobaan 3.png">
<br>
Pertanyaan :
<br>
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
<br>
- Bisa, contohnya :<br>
<img src="contoh3.png">
<br><br>
2. Jika diketahui terdapat class Segitiga seperti berikut ini :
<br>
<img src="3.1.png">
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
<br>
<img src="contoh4.png">
<br><br>
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan
library Math pada Java untuk mengkalkulasi sisi miring)
<br>
-<img src="contoh5.png">
<br><br>
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10
<br>
<img src="contoh6.png">
<br><br>
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method
hitungLuas() dan hitungKeliling().
<br>
<img src="contoh7.png">
<br>

## Latihan Praktikum - 1
### OUTPUT
<br>
<img src ="prak1.png">
<br>

## Latihan Praktikum - 2
### OUTPUT
<br>
<img src ="Output tugas 3.png">
<br>

## Latihan Praktikum - 3
### OUTPUT
<br>
<img src ="Output tugas 3.png">
<br>
