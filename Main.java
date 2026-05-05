import java.util.ArrayList;// Import ArrayList untuk menyimpan daftar menu dan keranjang belanja
import java.util.List; // Import List untuk tipe data keranjang
import java.util.Scanner; // Import Scanner untuk input user

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafe cafe = new Cafe("KEDAI KITA");

        // MEMBUAT OBJEK MENU (Polymorphism: tipe referensi Menu, objek aktual Makanan/Minuman)
       // System.out.println("=======MAKANAN=======");
        cafe.tambahMenu(new Makanan("Nasi Goreng", 15000, "Nasi"));
        cafe.tambahMenu(new Makanan("Nasi Lengko", 5000, "Nasi"));
        cafe.tambahMenu(new Makanan("Roti Bakar", 10000, "Roti"));
        //System.out.println("=======MINUMAN=======");
        cafe.tambahMenu(new Minuman("Es Teh Manis", 3000, "Sedang"));
        cafe.tambahMenu(new Minuman("Kopi Susu", 8000, "Sedang"));
        cafe.tambahMenu(new Minuman("Es Susu", 5000, "Sedang"));
        cafe.tambahMenu(new Minuman("Kopi Hitam", 5000, "Sedang"));

        //MENAMPILKAN DAFTAR MENU
        cafe.tampilkanMenu();

        List<Menu> keranjang = new ArrayList<>();
        String input;

        // PROSES PEMILIHAN MAKANAN (Percabangan & Input User)
        System.out.println("[MENU] SILAHKAN PILIH MAKANAN:");
        System.out.println("(Ketik nomor menu atau ketik 'selesai' untuk lanjut)");
        while (true) {
            System.out.print("Pilih: ");
            input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("selesai")) break;

            try {
                int pilih = Integer.parseInt(input);
                // Validasi rentang nomor menu
                if (pilih >= 1 && pilih <= cafe.getDaftarMenu().size()) {
                    Menu item = cafe.getDaftarMenu().get(pilih - 1);
                    // instanceof: memastikan user hanya memilih makanan di fase ini
                    if (item instanceof Makanan) {
                        keranjang.add(item);
                        System.out.println("[BERHASIL]" + item.getNama() + " masuk keranjang.");
                    } else {
                        System.out.println("[SALAH]Itu minuman. Silakan pilih makanan saja.");
                    }
                } else {
                    System.out.println("[SALAH] Nomor menu tidak tersedia.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Input harus berupa angka atau 'selesai'.");
            }
        }

        // PROSES PEMILIHAN MINUMAN + INPUT UKURAN
        System.out.println("\nSILAHKAN PILIH MINUMAN:");
        System.out.println("(Ketik nomor menu atau ketik 'selesai' untuk lanjut)");
        while (true) {
            System.out.print("Pilih: ");
            input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("selesai")) break;

            try {
                int pilih = Integer.parseInt(input);
                if (pilih >= 1 && pilih <= cafe.getDaftarMenu().size()) {
                    Menu item = cafe.getDaftarMenu().get(pilih - 1);
                    if (item instanceof Minuman) {
                        // Casting eksplisit untuk mengakses setter ukuran spesifik
                        Minuman minum = (Minuman) item;
                        System.out.print("Pilih ukuran (Sedang/Besar)? : ");
                        String ukuranInput = sc.nextLine().trim();
                        
                        // vlidasi input ukuran dengan percabangan if-else
                        if (!ukuranInput.equalsIgnoreCase("Sedang") && !ukuranInput.equalsIgnoreCase("Besar")) {
                            ukuranInput = "Sedang"; // Fallback default jika input salah
                        }
                        minum.setUkuran(ukuranInput); // Menggunakan setter
                        keranjang.add(item);
                        System.out.println("[BERHASIL]" + item.getNama() + " (" + ukuranInput + ") masuk keranjang.");
                    } else {
                        System.out.println("[SALAH]Itu makanan. Silakan pilih minuman saja.");
                    }
                } else {
                    System.out.println("[SALAH] Nomor menu tidak tersedia.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Input harus berupa angka atau 'selesai'.");
            }
        }

        // TAMPILKAN KERANJANG & HITUNG TOTAL HARGA
        System.out.println("\nKERANJANG ANDA:");
        double total = 0;
        if (keranjang.isEmpty()) {
            System.out.println("(Keranjang kosong)");
        } else {
            for (Menu item : keranjang) {
                // Polymorphism: detailMenu() otomatis menampilkan format berbeda sesuai subclass
                System.out.println("- " + item.detailMenu());
                total += item.getHarga();
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("TOTAL HARGA: Rp " + String.format("%.0f", total));
        System.out.println("-----------------------------------\n");

        // KONFIRMASI PEMBAYARAN/PEMBATALAN (Switch Case & Validasi)
        System.out.println("Ingin melanjutkan pembayaran?");
        System.out.println("1. Lanjut Pembayaran");
        System.out.println("2. Batal");
        System.out.print("Pilih opsi (1/2): ");
        String opsi = sc.nextLine().trim();

        switch (opsi) {
            case "1":
                System.out.println("\n💳 PEMBAYARAN BERHASIL!");
                System.out.println("Terima kasih telah memesan di " + cafe.getNamaCafe());
                System.out.println("Silakan ambil pesanan Anda.");
                break;
            case "2":
                System.out.println("\nPesanan dibatalkan. Keranjang dikosongkan.");
                keranjang.clear();
                break;
            default:
                System.out.println("\nPilihan tidak valid. Pesanan otomatis dibatalkan.");
                keranjang.clear();
        }
        // Menutup Scanner
        sc.close();
    }
}