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
[MENU UTAMA]


![Screenshot 2024-10-13 145823](https://github.com/user-attachments/assets/5f4bfd6c-6c97-4d44-9138-735607d39a55)

[PENAMBAHAN DATA DONOR]


![image](https://github.com/user-attachments/assets/a62c664f-4079-435b-81ff-fee97331d2c1)

[MENAMPILKAN DATA DONOR]


![image](https://github.com/user-attachments/assets/b41d815f-275d-4073-adf9-fde9d42c4908)

[MEMPERBARUI DATA DONOR]


![image](https://github.com/user-attachments/assets/892d793a-f9e2-4169-ba3e-94605c58564d)

[MENGHAPUS DATA DONOR]


![image](https://github.com/user-attachments/assets/bec9e7a8-3974-4b77-b2cc-46966f8e3b26)

[KELUAR DARI PROGRAM]


![image](https://github.com/user-attachments/assets/c040772c-9827-4adb-b707-cd6985b03cf7)
