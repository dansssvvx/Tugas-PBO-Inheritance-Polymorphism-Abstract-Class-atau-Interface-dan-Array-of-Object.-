# Tugas Pemrograman Berorientasi Objek (PBO)

Repositori ini berisi contoh kode Java sederhana untuk mendemonstrasikan konsep-konsep inti dalam Pemrograman Berorientasi Objek (PBO). Proyek ini mencakup implementasi interface, polimorfisme, dan struktur dasar kelas dan objek.

## Penjelasan Kode

Proyek ini terdiri dari beberapa kelas dan interface yang saling berinteraksi:

* **`BangunDatar.java`**: Sebuah interface yang mendefinisikan "kontrak" untuk kelas-kelas bangun datar. Setiap kelas yang mengimplementasikan interface ini harus menyediakan metode `hitungLuas()` dan `hitungKeliling()`.
* **`info.java`**: Sebuah interface yang mendefinisikan metode `tampilkanInfo()`. Kelas yang mengimplementasikannya harus bisa menampilkan informasi tentang objeknya.
* **`persegi.java`**: Kelas yang merepresentasikan objek persegi. Kelas ini mengimplementasikan interface `BangunDatar` dan `info`, sehingga memiliki metode untuk menghitung luas, keliling, dan menampilkan info.
* **`lingkaran.java`**: Kelas yang merepresentasikan objek lingkaran. Sama seperti persegi, kelas ini juga mengimplementasikan interface `BangunDatar` dan `info`.
* **`penggaris.java`**: Kelas yang merepresentasikan objek penggaris. Kelas ini hanya mengimplementasikan interface `info` karena bukan merupakan bangun datar.
* **`main.java`**: Kelas utama yang berisi metode `main` untuk menjalankan program. Kelas ini membuat objek dari `persegi`, `lingkaran`, dan `penggaris`, lalu memanggil metode-metodenya.

## Topik Penting PBO

Berikut adalah penjelasan konsep-konsep PBO yang diterapkan dalam proyek ini.

### 1. Interface

Interface adalah sebuah tipe referensi di Java yang mirip dengan kelas. Interface hanya berisi konstanta dan deklarasi metode tanpa isi (metode abstrak). Kelas dapat mengimplementasikan sebuah interface, sehingga "berjanji" untuk menyediakan implementasi untuk semua metode yang ada di dalam interface tersebut.

* **Contoh dalam Proyek**:
    * Interface `BangunDatar` memaksa kelas `persegi` dan `lingkaran` untuk memiliki fungsionalitas perhitungan luas dan keliling.
    * Interface `info` memastikan setiap kelas yang mengimplementasikannya (`persegi`, `lingkaran`, `penggaris`) memiliki kemampuan untuk menampilkan informasi.

### 2. Inheritance (Pewarisan) dan Abstract Class

* **Inheritance**: Adalah mekanisme di mana sebuah objek dapat mewarisi semua properti dan perilaku dari objek lain. Dalam proyek ini, pewarisan tidak diimplementasikan secara langsung menggunakan kata kunci `extends`. Namun, implementasi interface (`implements`) adalah salah satu cara untuk mencapai pewarisan tipe (type inheritance).

* **Abstract Class**: Adalah kelas yang tidak dapat diinstansiasi menjadi objek. Kelas ini bisa berisi metode abstrak dan metode biasa. `BangunDatar` bisa saja dibuat sebagai *abstract class* jika ada properti atau metode umum yang ingin dibagikan ke semua turunannya, misalnya properti `namaBangunDatar`.

### 3. Polimorfisme

Polimorfisme berarti "banyak bentuk". Dalam PBO, ini adalah kemampuan sebuah objek untuk memiliki banyak bentuk. Polimorfisme memungkinkan Anda untuk menulis kode yang lebih fleksibel. Sebuah variabel dengan tipe interface dapat merujuk ke objek dari kelas mana pun yang mengimplementasikan interface tersebut.

* **Contoh dalam Proyek**:
    Meskipun tidak dieksplorasi sepenuhnya di `main.java`, Anda bisa membuat objek `persegi` dan `lingkaran` dan menugaskannya ke variabel bertipe `BangunDatar`.
    ```java
    BangunDatar bangun1 = new persegi(10);
    BangunDatar bangun2 = new lingkaran(7);

    System.out.println("Luas bangun 1: " + bangun1.hitungLuas()); // Memanggil hitungLuas() milik persegi
    System.out.println("Luas bangun 2: " + bangun2.hitungLuas()); // Memanggil hitungLuas() milik lingkaran
    ```

### 4. Array of Objects

*Array of Objects* adalah sebuah array yang elemen-elemennya merupakan objek dari sebuah kelas. Ini berguna untuk mengelola banyak objek sejenis secara efisien.

* **Contoh Penggunaan dalam Proyek**:
    File `main.java` saat ini belum menggunakan array. Namun, Anda bisa memanfaatkannya untuk mengelola beberapa objek bangun datar sekaligus seperti ini:
    ```java
    // Membuat array untuk menampung objek yang mengimplementasikan BangunDatar
    BangunDatar[] koleksiBangunDatar = new BangunDatar[2];

    // Mengisi array dengan objek persegi dan lingkaran
    koleksiBangunDatar[0] = new persegi(8);
    koleksiBangunDatar[1] = new lingkaran(14);

    // Menampilkan luas setiap objek dalam array
    for (BangunDatar bangun : koleksiBangunDatar) {
        System.out.println("Luas: " + bangun.hitungLuas());
    }
    ```
