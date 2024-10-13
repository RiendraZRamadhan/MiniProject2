# MiniProject2


# Manajemen Bank Darah PMR
Program ini adalah sistem manajemen sederhana untuk Bank Darah PMR (Palang Merah Remaja) yang memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data donor darah.


# Cara Kerja Program


# 1. Struktur Program
Program terdiri dari beberapa kelas yang diorganisir dalam package:

*model:*

* Orang: Kelas abstrak yang menjadi dasar untuk DonorDarah dan Petugas.
* DonorDarah: Kelas yang merepresentasikan donor darah.
* Petugas: Kelas yang merepresentasikan petugas PMR.


*service:*

* CRUDInterface: Interface yang mendefinisikan operasi CRUD.
* BankDarahService: Kelas yang mengimplementasikan CRUDInterface untuk mengelola data donor.
* CRUDInterface untuk mengelola data donor.

*main:*
* ManajemenBankDarah: Kelas utama yang menjalankan program dan menangani interaksi dengan pengguna.


# 2. Alur Program

1. Program dimulai dari kelas ManajemenBankDarah.
2. Pengguna disajikan menu dengan 5 opsi:
* Tambah Donor
* Tampilkan Daftar Donor
* Update Data Donor
* Hapus Donor
* Keluar

3. Berdasarkan pilihan pengguna, program akan memanggil method yang sesuai dari BankDarahService.

# 3. Fitur-fitur Program
*a. Tambah Donor*

* Pengguna diminta memasukkan nama dan golongan darah donor.
* Program membuat ID unik untuk donor baru.
* Data donor disimpan dalam ArrayList di BankDarahService.

*b. Tampilkan Daftar Donor*

* Program menampilkan semua data donor yang tersimpan.
* Jika tidak ada data, program akan memberitahu bahwa daftar kosong.

*c. Update Data Donor*

* Pengguna diminta memasukkan ID donor yang akan diupdate.
* Jika ID ditemukan, pengguna dapat memasukkan data baru untuk donor tersebut.
* Data donor diperbarui dalam ArrayList.

*d. Hapus Donor*

* Pengguna diminta memasukkan ID donor yang akan dihapus.
* Jika ID ditemukan, data donor dihapus dari ArrayList.

# 4. Konsep OOP yang Diterapkan

* Inheritance: DonorDarah dan Petugas mewarisi dari kelas abstrak Orang.
* Encapsulation: Penggunaan access modifier dan getter/setter.
* Abstraction: Penggunaan kelas abstrak Orang dan interface CRUDInterface.
* Polymorphism: Implementasi method abstrak getInfo() di subclass.

# Cara Menjalankan Program

1. Pastikan Java Development Kit (JDK) telah terinstal di sistem Anda.
2. Kompilasi semua file Java dalam package masing-masing.
3. Jalankan kelas ManajemenBankDarah dari package main.

# CONTOH PENGGUNAAN

[MENU UTAMA] [image](https://github.com/user-attachments/assets/175348f4-8b13-4a02-8341-29ca5e45327a)
