package id.teladanbarat.smartmeta.ui.theme

import androidx.compose.ui.graphics.Color

// Palet ini disamakan dengan dashboard admin (web) supaya identitas visual
// SMART META konsisten di semua platform: latar navy gelap ala pusat kendali
// lapangan, biru terang (signal) untuk status "live"/aksi utama, hijau
// (melati) untuk kategori Melati, biru muda (bestari) untuk kategori Bestari
// — sama persis dengan tailwind.config.ts di smart-meta-admin.

// --- Aksen inti (dipakai di kedua mode), disamakan dengan web ---
val SignalAmber = Color(0xFF2F8AF0)   // "signal" — biru terang, status live, aksi utama
val MelatiSage = Color(0xFF22B573)    // "melati" — hijau, kategori Melati
val BestariDusty = Color(0xFF5AA9E6)  // "bestari" — biru muda, kategori Bestari
val DangerCoral = Color(0xFFE1554C)   // "danger"

// --- Mode Gelap (menyamai base/panel/line/ink web) ---
val TealDeep = Color(0xFF0A1830)      // "base" — background
val TealPanel = Color(0xFF0F2340)     // "panel" — surface / card
val TealLine = Color(0xFF1E3A5F)      // "line" — border/divider halus
val IvoryText = Color(0xFFEEF4FA)     // "ink" — teks utama di atas latar gelap

// --- Mode Terang ---
val CreamBackground = Color(0xFFF5F8FC)
val CreamSurface = Color(0xFFFFFFFF)
val InkText = Color(0xFF0A1830)
val LineLight = Color(0xFFDCE6F2)

// Warna "on-X" aksen (teks/ikon di atas warna aksen, dipakai kedua mode)
val OnAmber = Color.White
val OnSage = Color.White
val OnDusty = Color(0xFF071522)
