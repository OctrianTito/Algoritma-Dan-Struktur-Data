# Laporan Praktikum 11
<b>NAMA : Octrian Adiluhung TIto Putra<b><br>
<b>KELAS : TI-1H<b><br>
<b>ABSEN : 22<b><br>
<b>NIM : 2341720078<b><br>
<br>

## Percobaan 1 
### OUTPUT
<br>
<img src="1.png">
<br>
Pertanyaan
<br>
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding 
binary tree biasa? <br>
- Karena hanya perlu melakukan pencarian pada bagian elemen tertentu (jika lebih kecil akan mencari di elemen sebelah kiri, jika lebih besar akan mencari disebelah kanan
<br><br>
2. Untuk apakah di class Node, kegunaan dari atribut left dan right? <br>
- left digunakan untuk menunjukkan child sebelah kiri, right digunakan untuk menunjuk child sebelah kanan
<br><br>
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? <br>
- Digunakan untuk menunjuk elemen pertama dari sebuah Tree
<br>
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root? <br>
- Ketika pertama dibuat, root akan bernilai null yang mengindikasikan bahwa Tree masih kosong
<br><br>
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? <br>
- Node baru akan menjadi root dari Tree
<br><br>
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan 
secara detil untuk apa baris program tersebut? <br>
- if(data < current.data) : digunakan untuk mengecek apakah data yang dicari lebih kecil dari current data yang sedang dicek <br><br>
if(current.left!=null) : Mengecek apakah current memiliki left child
current = current.left; , jika memiliki, akan memindahkan current menjadi left child dari current 
} else, jika node tidak memiliki left child
current.left = new Node(data); membuat node baru menjadi left child dari current
break; , menghentikan perulangan setelah data ditambahkan
<br><br>

## Percobaan 2
### OUTPUT
<br>
<img src="2.png">
<br>
Pertanyaan
<br>
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? <br>
- Data digunakan untuk menampung nilai/data dari node dalam Tree
idxLast digunakan untuk menampung indeks node terakhir
<br><br>
2. Apakah kegunaan dari method populateData()? <br>
- PopulateData() digunakan untuk mengisi array berdasarkan Binary Tree dan juga menentukan idxLast
<br><br>
3. Apakah kegunaan dari method traverseInOrder()? <br>
- TraverseInOrder() digunakan untuk menampilkan/print node secara in-order (kiri, root, kanan)
<br><br>
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi 
left child dan rigth child masin-masing? <br>
- Jika node disimpan di indeks 2, left child ada di indeks 5 (2*2+1) dan right child ada di indeks 6 (2*2+2).
<br><br>
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4? <br>
- int idxLast = 6 Digunakan untuk menunjukkan bahwa elemen terakhir ada di indeks 6
<br><br>

## Latihan Praktikum
<br>
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara 
rekursif. <br>
<br>
<img src="1.3.png">
<br><br>
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang 
paling besar yang ada di dalam tree. <br>
<br>
<img src="1.4.png">
<br>
<img src="1.5.png">
<br><br>
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf. <br>
<img src="1.6.png">
<br><br>
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada 
di dalam tree. <br>
<img src="1.7.png">
<br><br>
5. Modifikasi class BinaryTreeArray, dan tambahkan :  <br>
• method add(int data) untuk memasukan data ke dalam tree  <br>
<img src="1.8.png">
<br><br>
• method traversePreOrder() dan traversePostOrder() <br>
<img src="1.9.png">
<br><br>

### OUTPUT TUGAS 1
<br>
<img src="2.png">
<br>

### OUTPUT TUGAS 2
<br>
<img src="1.2.png">
<br>