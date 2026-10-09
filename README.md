# Topan-Izazih_Tugas-Inheritance

Program Java sederhana dengan 4 kelas bentuk geometri.

## Struktur Kelas

```
Bentuk
 ├── BujurSangkar
 └── Lingkaran
      └── Silinder
```

## Penerapan Konsep

### 1. Encapsulation
Atribut dibungkus dengan *access modifier*:
- `sisi`, `radius`, dan `tinggi` dibuat `private`, hanya bisa diakses lewat
  getter/setter seperti `getSisi()` dan `setSisi()`.
- `warna` di `Bentuk` dibuat `protected`, jadi tidak bisa diakses dari luar paket/kelas
  lain secara bebas, tetapi bisa dipakai langsung oleh kelas turunannya
  (`BujurSangkar`, `Lingkaran`, `Silinder`). Dari luar tetap diakses lewat
  `getWarna()` dan `setWarna()`.

### 2. Inheritance
- `BujurSangkar` dan `Lingkaran` mewarisi `Bentuk` (`extends Bentuk`).
- `Silinder` mewarisi `Lingkaran`, jadi memakai ulang `radius` dan `hitungLuas()`
  (luas alas) untuk menghitung volume.
- Constructor kelas anak memanggil constructor induk dengan `super(...)`.

### 3. Polymorphism
Method `printInfo()` di-*override* di setiap kelas anak. Pada `Main`,
array bertipe `Bentuk` diisi objek `Bentuk`, `BujurSangkar`, `Lingkaran`,
dan `Silinder`. Saat `printInfo()` dipanggil, yang dijalankan adalah
versi milik objek aslinya.

## Screenshot Hasil