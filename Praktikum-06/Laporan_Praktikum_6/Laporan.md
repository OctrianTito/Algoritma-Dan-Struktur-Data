# Laporan Praktikum 5
<b>NAMA : Octrian Adiluhung TIto Putra<b><br>
<b>KELAS : TI-1H<b><br>
<b>ABSEN : 22<b><br>
<b>NIM : 2341720078<b><br>
<br>

## Percobaan 1 : Sequential Search
### OUTPUT
<br>
<img src="">
<br>
Pertanyaan
<br>
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!
<br><br>
- Menghentikan perulangan for jika data yang dicari sudah ditemukan
<br><br><br>
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
<br><br> 
<img src="1.3.png"> <br>
- Kode program masih bisa berjalan, karena data yang tersusun atau teracak tidak mempengaruhi kode program.
<br><br><br>
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :
<br><br>
<img src="1.2.png">
<br><br><br>

## Percobaan 2 :  Pencarian Menggunakan Binary Search
### OUTPUT
<br>
<img src="output2.png">
<br>
Pertanyaan
<br>
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
<br><br>
- int mid = (left + right) / 2;
<br><br><br>
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
<br><br>
else if (listBk[mid].kodeBuku > cari) {<br>
    return findBinarySearch(cari, left, mid - 1);<br>
} else {<br>
    return findBinarySearch(cari, mid + 1, right);<br>
}
<br><br><br>
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan
Mengapa hal tersebut bisa terjadi?
<br><br>
<img src="2.1.png">
<br>
- Program akan tetap berjalan, hanya saja data yang ada tidak berurutan. Hal ini dapat terjadi karena data yang berurutan tidak mempengaruhi binary dan sequential search, jika kode buku ditemukan maka akan ditamapilkan.
<br><br><br>
4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214,
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search?
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!
<br><br>
<img src="2.2.png">
<br><br><br>

## Percobaan 3 :  Percobaan Pengayaan Divide and Conquer
### OUTPUT
<br>
<img src="output3.png">
<br><br>


## Latihan Praktikum
### OUTPUT
<br>
<img src="laprak.png">

