# Laporan Praktikum Pertemuan 2
<b>NAMA : Octrian Adiluhung TIto Putra<b><br>
<b>KELAS : TI-1H<b><br>
<b>ABSEN : 22<b><br>
<b>NIM : 2341720078<b><br>
<br>

## Percobaan 1 : Deklarasi Class, Atribut dan Method 
### OUTPUT : 
<br>
<img src="percobaan 1.png" height="40px">
<br>
### Pertanyaan :
<br>
1. Sebutkan dua karakteristik class atau object! 
<br> - a. Encapsulation (Pengkapsulan) : Encapsulation mengacu pada konsep menyembunyikan rincian implementasi dari pengguna luar 
<br> b. Inheritance (Pewarisan) : Inheritance adalah mekanisme di mana kelas baru dapat dibuat dengan mewarisi sifat-sifat dan perilaku dari kelas yang sudah ada <br><br>
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class 
Buku? Sebutkan apa saja atributnya! 
<br> - Terdapat 5 atribut dalam class Buku, yaitu String judul, pengarang dan int halaman, stok, harga<br><br>
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! 
<br> - Terdapat 4 method yaitu, tampilInformasi(), terjual(int jml), restock(int jml), gantiHarga(int hrg)<br><br>
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut 
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)! 
<br><br> - KODE PROGRAM
<br> <img src="terjual.png">
<br> - OUTPUT
<br> <img src="modif percobaan 1.png">
<br><br>
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int? 
<br> - Karena parameter tersebut digunakan untuk menentukan jumlah buku yang akan ditambahkan ke stok. Dengan menggunakan parameter bilangan integer, menentukan jumlah buku yang akan ditambahkan saat melakukan restock akan lebih gampang.<br><br>

## Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
### OUTPUT 
<br>
<img src="percobaan 2.png">

### Pertanyaan :
<br>
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! 
Apa nama object yang dihasilkan? 
<br> - Buku22 bk1 = new Buku22();<br>
Buku22 bk2 = new Buku22 ("Self Reward", "Maheera Ayesha", 160, 29, 59000);
<br> Objek yang dihasilkan oleh kode pertama yaitu bk1, dan yang kedua yaitu bk2<br><br>
2. Bagaimana cara mengakses atribut dan method dari suatu objek? 
<br> - Untuk mengakses atribut dari objek, dapat dengan cara menggunakan nama objek diikuti dengan tanda titik dan nama atribut yang ingin diakses<br>
- Untuk memanggil method dari objek, dapat dengan cara menggunakan nama objek diikuti dengan tanda titik dan nama method yang ingin dipanggil, kemudian diikuti dengan argumen-argumen yang diperlukan jika ada<br><br>
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?
<br> - Karena ada perubahan nilai pada atribut objek bk1
<br><br>

## Percobaan 3: Membuat Konstruktor
### OUTPUT
<br>
<img src="percobaan 3.png">

### Pertanyaan
<br>
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter! 
<br>  <img src="konstruktor.png">
<br><br>
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
<br> - Mendeklarasikan sebuah konstruktor untuk class Buku22
<br><br>
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana 
hasilnya? Jelaskan mengapa hasilnya demikian!
<br> - Terjadi error karena tidak ada konstruktor tanpa parameter yang tersedia untuk digunakan saat membuat objek.<br><br>
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses
secara berurutan? Jelaskan alasannya! 
<br> - Tidak karena setiap method memiliki fungsi yang berbeda, dan urutan method tidak mempengaruhi urutan kode dijalankan. Sehingga kita bisa mengakses method sesuai dengan kebutuhan
<br><br>
5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor 
berparameter dari class Buku!
<br> - KODE PROGRAM
<br> <img src="new object.png" width = 1000 px height = 40px>
<br> - OUTPUT
<br>
<img src="output new object.png">
<br><br>

### LATIHAN PRAKTIKUM - 1
KODE PROGRAM
<br>
<img src="soal 1.png">
<br>
OUTPUT
<br>
<img src="output 1.png">

### LATIHAN PRAKTIKUM - 2
KODE PROGRAM
<br>
<img src="soal 2.png">
<br>
OUTPUT
<br>
<img src="output 2.png">