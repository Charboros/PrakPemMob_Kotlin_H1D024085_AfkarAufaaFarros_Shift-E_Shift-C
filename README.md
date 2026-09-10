# Praktikum Pemrograman Mobile - Jetpack Compose

Repository ini berisi proyek praktikum Pemrograman Mobile menggunakan **Kotlin** dan **Jetpack Compose**.

---

## 📌 Daftar Pertemuan

### 🚀 Pertemuan 1: Dasar-dasar Layout & Navigasi Jetpack Compose
Pada pertemuan pertama ini, dipelajari dasar-dasar pembuatan antarmuka pengguna (UI) secara deklaratif menggunakan **Jetpack Compose**, komponen tata letak Material 3, serta sistem navigasi antar layar.

#### 🛠️ Fitur & Tampilan yang Dihasilkan:
1. **Layar Info Dasar (`BasicInfoScreen`)**:
   - **Header & Logo**: Menampilkan logo aplikasi UMKM *JualanSawit* / produk lokal.
   - **Teks Deskripsi**: Informasi tentang platform UMKM lokal di wilayah Kabupaten Purbalingga, Jawa Tengah.
   - **Misi Kami (Card Component)**: Komponen `Card` yang menampilkan visi/misi aplikasi dengan tema Material 3.
   - **Tombol Navigasi**: Tombol `"Hubungi Kami"` untuk berpindah ke layar formulir.

2. **Layar Formulir Kontak (`HubungiKamiScreen`)**:
   - **TopAppBar**: Bilah navigasi atas lengkap dengan tombol kembali (*Back Icon*).
   - **Form Input**: Menggunakan `OutlinedTextField` untuk input *Email Anda* (dengan ikon email) dan *Pesan*.
   - **Tata Letak Responsif**: Menggunakan `Scaffold`, `Column`, `Spacer`, dan `PaddingValues` agar tampilan rapi.

3. **Sistem Navigasi (`NavHost` & `NavController`)**:
   - Pengaturan *rute* navigasi dari rute awal `basic_info` menuju `form_screen`.

---

## 📁 Struktur Proyek

```text
app/src/main/java/com/example/praktikkummobile/
├── MainActivity.kt                  # Entry point & NavHost setup
└── ui/
    ├── screen/
    │   ├── BasicInfoScreen.kt      # Layar Info Utama (Pertemuan 1)
    │   └── HubungiKamiScreen.kt    # Layar Formulir Kontak (Pertemuan 1)
    └── theme/                      # Konfigurasi Tema, Warna, & Tipografi
```

---

## 🛠️ Teknologi yang Digunakan
- **Bahasa**: Kotlin
- **UI Framework**: Jetpack Compose (Material 3)
- **Navigation**: Jetpack Navigation Compose
- **Minimum SDK**: Android 10 (API Level 29)
- **Target SDK**: Android 15 (API Level 35/37)
