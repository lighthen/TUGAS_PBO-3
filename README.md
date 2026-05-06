# TUGAS_PBO-3
Repository ini digunakan untuk memenuhi tugas kelompok mata kuliah PBO

# Sistem Pemesanan Cafe Kedai Kita - Tugas PBO 3

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Selesai-brightgreen?style=for-the-badge)

> **Mata Kuliah**: Pemrograman Berorientasi Objek (PBO)  
> **Dosen Pengampu**: Pak Edi  
> **Semester**: 4  
> **Tugas**: Kelompok - Studi Kasus Cafe
## Anggota Kelompok
1. Hendra Nurfatkhurrohman
2. Hazik Faiz
3. Putri Widanti
4. Fitri Ramadhani
5. Aurora Stefany Martarina
---

## 📌 Deskripsi Proyek

Proyek ini merupakan implementasi **Sistem Pemesanan Cafe** sederhana yang dibangun menggunakan prinsip **Object-Oriented Programming (OOP)** dalam bahasa Java. Program ini mensimulasikan alur pemesanan makanan dan minuman di sebuah cafe, mulai dari menampilkan menu, memilih item, hingga proses pembayaran.

### 🎯 Tujuan Pembelajaran
- Menerapkan konsep **Encapsulation**, **Inheritance**, **Polymorphism**, **Overloading**, dan **Overriding**
- Memahami penggunaan `ArrayList` untuk manajemen koleksi objek
- Melatih kemampuan validasi input user dan struktur percabangan
- Membuat dokumentasi teknis berupa Class Diagram dan Flowchart

---

## ✨ Fitur Utama

| Fitur | Deskripsi |
|-------|-----------|
| 🍽️ **Daftar Menu Dinamis** | Menampilkan makanan dan minuman dengan format berbeda menggunakan polymorphism |
| 🛒 **Keranjang Belanja** | User dapat memilih multiple item dan melihat total harga secara real-time |
| 📏 **Pilihan Ukuran Minuman** | Minuman dapat dipilih ukurannya (Sedang/Besar) dengan input interaktif |
| ✅ **Validasi Input** | Sistem memvalidasi pilihan menu, tipe item (makanan/minuman), dan format input |
| 💳 **Konfirmasi Pembayaran** | User dapat memilih lanjut pembayaran atau membatalkan pesanan |
| 🔐 **Enkapsulasi Data** | Semua atribut kelas menggunakan modifier `private` dengan akses via getter/setter |

---

## 🎯 Implementasi Konsep OOP

Berikut adalah pemetaan konsep OOP terhadap ketentuan tugas:

| No | Ketentuan | Implementasi Kode | File |
|----|-----------|------------------|------|
| **a** | Superclass `Menu` (nama, harga, detailMenu) | `class Menu` dengan atribut private & method `detailMenu()` | `Menu.java` |
| **b** | Subclass `Makanan` & `Minuman` + atribut tambahan | `Makanan` punya `jenis`, `Minuman` punya `ukuran` | `Makanan.java`, `Minuman.java` |
| **c** | Override method superclass | `@Override detailMenu()` di subclass | `Makanan.java`, `Minuman.java` |
| **d** | Atribut `private` + getter/setter | Semua field `private`, akses via method publik | Semua file `.java` |
| **e** | Overloading constructor/setter | Constructor ganda di `Menu`, `Makanan`, `Minuman` | `Menu.java`, dll |
| **f** | Polymorphism: satu tipe, output berbeda | `ArrayList<Menu>` menyimpan objek subclass; `detailMenu()` dipanggil dinamis | `Cafe.java` |
| **g** | Class `Cafe` dengan ArrayList & method manajemen | `class Cafe` dengan `daftarMenu`, `tambahMenu()`, `tampilkanMenu()` | `Cafe.java` |
| **h** | Class `Main` untuk simulasi lengkap | `main()` menangani input, keranjang, total harga, pembayaran | `Main.java` |
| **i** | Struktur percabangan (if/switch) | Validasi `instanceof`, `switch` untuk konfirmasi pembayaran | `Main.java` |
| **j** | Input user interaktif | `Scanner` untuk pilihan menu, ukuran, dan konfirmasi | `Main.java` |

---
## 📊 Class Diagram
<img width="1143" height="742" alt="Screenshot 2026-05-04 215551" src="https://github.com/user-attachments/assets/6f2f178f-f619-4bf8-86e7-f64e08d9c220" />


Keterangan:
▲ = Inheritance (extends)
◆ = Composition (Cafe memiliki ArrayList<Menu>)

## 🔄 Flowchart Program
<img width="884" height="3183" alt="flowcart" src="https://github.com/user-attachments/assets/5d2ebef9-d40c-4dd8-8ea8-a0a6a082eba5" />


---

## 🚀 Cara Menjalankan Program

### 🔧 Prasyarat
- Java Development Kit (JDK) versi 8 atau lebih baru
- Terminal / Command Prompt / PowerShell

### ▶️ Langkah Kompilasi & Eksekusi

# 1. Clone repository
git clone https://github.com/lighthen/TUGAS_PBO-3.git

# 2. Buka terminal di folder proyek
cd "tugas_kelompok"

# 3. Kompilasi semua file Java
javac *.java

# 4. Jalankan program
java Main

## Contoh Output Program
<img width="617" height="383" alt="Screenshot 2026-05-05 073528" src="https://github.com/user-attachments/assets/e7b8c01f-53a5-404b-a8e7-aebefad58b35" />
<img width="624" height="816" alt="Screenshot 2026-05-05 073752" src="https://github.com/user-attachments/assets/1a464b0b-63c8-43a8-8540-d01d8136bf40" />






