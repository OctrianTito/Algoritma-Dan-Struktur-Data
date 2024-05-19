# Laporan Praktikum 11
<b>NAMA : Octrian Adiluhung TIto Putra<b><br>
<b>KELAS : TI-1H<b><br>
<b>ABSEN : 22<b><br>
<b>NIM : 2341720078<b><br>
<br>

## Percobaan 1 
### OUTPUT
<br>
<img src="1.1.png">
<br>
Pertanyaan
<br>
1. Jelaskan perbedaan antara single linked list dengan double linked lists!<br>
> Pada Single Linked List:
- Setiap node  mengandung data dan pointer ke node berikutnya dalam urutan.<br>
- Referensi dari node terakhir menunjuk ke null, menandakan akhir dari list.<br>
- Tidak ada cara untuk menelusuri list ke arah belakang dari sebuah node tertentu, hanya bisa bergerak dalam satu arah (maju). <br>
> Pada Double Linked List:
- Setiap node dalam double linked list mengandung data, referensi ke node berikutnya (next), dan referensi ke node sebelumnya (prev). <br>
- pada Double Linked List kita bisa menelusuri list dalam kedua arah (maju dan mundur).
<br><br>
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut
tersebut? <br>
> Atribut next adalah pointer yang menunjuk ke node berikutnya dalam linked list, sedangkan atribut prev adalah pointer yang menunjuk ke node sebelumnya dalam linked list.
<br><br>
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan
size seperti pada gambar berikut ini? <br>
> `head` diinisialisasi dengan nilai null yang berarti linked list tersebut masih kosong dan belum ada node yang menjadi kepala dari linked list. Dan `size` diinisialisasi dengan nilai 0 yang berarti pada saat objek `DoubleLinkedLists` pertama kali dibuat, linked list tersebut tidak memiliki elemen apapun.
<br><br>
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev
dianggap sama dengan null? 
Node newNode = new Node(null, item, head); <br>
> Pembuatan object dari konstruktor kelas Node dengan prev dianggap sama dengan null karena node yang ditambahkan akan menjadi node pertama (head) dalam linked list yang mana node pertama (head) pastinya tidak boleh memiliki pointer prev.
<br><br>
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ? <br>
> Statement tesebut dijalankan saat keadaan head sudah terisi, sehingga ketika kita ingin menambahkan node baru sebagai head, maka newNode ini akan menempati head.prev (yang mana akan mengganti peran head yang lama).
<br><br>
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan
parameter prev dengan current, dan next dengan null?
Node newNode = new Node(current, item, null); <br>
> Node baru akan dibuat dengan prevnya diset ke current, yang menunjuk ke node terakhir saat ini. item diset dengan nilai item yang akan ditambahkan ke node baru. next diset ke null karena node baru ini akan menjadi node terakhir dalam linked list, sehingga tidak ada node lagi setelahnya.
<br><br>
7. Pada method add(), terdapat potongan kode program sebagai berikut:
jelaskan maksud dari bagian yang ditandai dengan kotak kuning. <br>
> Kode ini memastikan bahwa ketika sebuah node baru ditambahkan pada indeks 0 atau head (di depan linked list), node tersebut diatur dengan benar sebagai node pertama (head). Node yang awalnya adalah node pertama sekarang menjadi node kedua, dan referensi head diperbarui untuk menunjuk ke node baru.
<br><br>

## Percobaan 2 
### OUTPUT
<br>
<img src="2.1.png">
<br>
Pertanyaan
<br>
1. Apakah maksud statement berikut pada method removeFirst()?
head = head.next; 
head.prev = null;<br>
> Kode ini akan memindahkan atau menggeser posisi head ke node yang ke-2 kemudian menghapus pointer prev dari node ke-2 (yang sekarang menjadi head) menjadi null.
<br><br>
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? <br>
> Dengan cara perulangan untuk mencari node kedua terakhir (sebelum node terakhir)dalam linked list. Setelah node tersebut ditemukan, kita menghapus referensi dari node kedua terakhir ke node terakhir, sehingga node terakhir dihapus.
<br><br>
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove! <br>
> tmp seharusnya dijadikan sebagai node pertama (head) bukan head.next. Dan dengan mengatur head.next ke tmp.next, maka akan melewati node kedua dan langsung menghubungkan node pertama ke node setelahnya. Ini akan menghilangkan node kedua dari linked list, bukan node yang dimaksud.
<br><br>
4. Jelaskan fungsi kode program berikut ini pada fungsi remove! <br>
> Kode ini akan menghubungkan node sebelum dan sesudah node yang dihapus sehingga tidak ada lagi node yang terhubung langsung ke node yang dihapus.
<br><br>

## Percobaan 3 
### OUTPUT
<br>
<img src="3.1.png">
<br>
Pertanyaan
<br>
1. Jelaskan method size() pada class DoubleLinkedLists! <br>
> Metode size() pada kelas DoubleLinkedLists digunakan untuk mengembalikan jumlah elemen atau berapa node yang ada dalam double linked list pada saat ini.
<br><br>
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1! <br>
> Caranya adalah dengan memodifikasi beberapa metode, contohnya Metode add(int item, int index): Mengubah logika dalam metode add sehingga ketika kita menambahkan elemen pada indeks ke-1, itu akan menambahkannya sebagai elemen pertama dalam linked list, bukan sebelumnya. Kemudian, saat menambahkan elemen pada indeks ke-2, itu akan dimasukkan di antara elemen pertama dan kedua.
<br><br>
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! <br>
> Pada double linked lists, setiap node memiliki dua pointer, yaitu prev (pointer ke node sebelumnya) dan next (pointer ke node berikutnya). Saa tmenambahkan elemen baru, kita perlu memperbarui kedua pointer ini untuk menyambungkan node baru dengan node sebelumnya dan node berikutnya. Sedangkan pada single linked lists, setiap node hanya memiliki satu pointer, yaitu next (pointer ke node berikutnya).
<br><br>
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini! <br>
> Potongan kode pertama menggunakan variabel size untuk menentukan apakah linked list kosong atau tidak. Linked list dianggap kosong jika tidak ada elemen yang disimpan di dalamnya yaitu saat size = 0 Potongan kode kedua menggunakan variabel head untuk menentukan apakah linked list kosong atau tidak. Ini menunjukkan bahwa linked list dianggap kosong jika tidak ada node yang menunjuk ke node pertama (tidak ada head)
<br><br>

## Latihan Praktikum
<br>
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang
telah divaksinasi di menu Hapus Data(2) harus ada) <br><br><br>
2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara
descending. Class Film wajib diimplementasikan dalam soal ini.
Contoh Ilustrasi Program
Menu Awal dan Penambahan Data

### OUTPUT TUGAS 1
<br>
<img src="4.1.png">
<br>
<img src="4.2.png">
<br>
<img src="4.3.png">

### OUTPUT TUGAS 2
<br>
<img src="5.1.png">
<br>
<img src="5.2.png">
<br>
<img src="5.3.png">
<br>
<img src="5.4.png">
<br>
<img src="5.5.png">
<br>
<img src="5.6.png">
<br>
<img src="5.7.png">
