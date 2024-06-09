# Laporan Praktikum 12
<b>NAMA : Octrian Adiluhung TIto Putra<b><br>
<b>KELAS : TI-1H<b><br>
<b>ABSEN : 22<b><br>
<b>NIM : 2341720078<b><br>
<br>

## Percobaan 1 
### OUTPUT
<br>
<img src="1.1.png"> <br>
<img src="1.2.png"> 
<br>
Pertanyaan
<br>
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!<br><br>
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan
variabel tersebut! <br>
- list[] digunakan untuk menyimpan data dari setiap vertex dalam graph
<br><br>
3. Jelaskan alur kerja dari method removeEdge!<br>
- Menerima dua parameter asal dan tujuan, melakukan iterasi melalui semua vertex, pada saat iterasi jika vertex i sama dengan tujuan maka kode akan menghapus tujuan dari daftar vertex asal menggunakan remove(tujuan) pada doublelinkedlist yang menyimpan tetangga vertex asal
<br><br>
4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add
jenis lain saat digunakan pada method addEdge pada class Graph? <br>
- Untuk memastikan penambahan data baru yang cepat dan efisien tanpa memerlukan traversal tambahan
<br><br>
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara
suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). <br>
<img src="1.3.png"> <br>
<img src="1.4.png">
<br><br>

## Percobaan 2
### OUTPUT
<br>
<img src="2.1.png">
<br>
Pertanyaan
<br>
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! <br><br>
2. Apa jenis graph yang digunakan pada Percobaan 2? <br>
- Graph Matrix
<br><br>
3. Apa maksud dari dua baris kode berikut? <br>
- Membuat edge dari gedung B ke gedung C dengan jarak 70m dan gedung C ke gedung B dengan jarak 80m
<br><br>
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk
inDegree dan outDegree! <br>
<img src="2.2.png">
<br><br>


## Latihan Praktikum
<br>
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat
dinamis, setidaknya terdiri dari:<br>
a) Add Edge <br>
b) Remove Edge<br>
c) Degree<br>
d) Print Graph<br>
e) Cek Edge<br>
Pengguna dapat memilih menu program melalui input Scanner <br>
<br>
<img src="3.1.png"> <br>
<img src="3.2.png"> <br>
<img src="3.3.png">
<br><br>
2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak
antara dua node asal dan tujuan! <br>
<br>
<img src="3.4.png">
<br><br>
3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf! <br>
<img src="3.5.png">
<br><br>
