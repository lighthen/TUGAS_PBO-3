import java.util.ArrayList;

// Kelas Cafe yang memiliki nama dan daftar menu
public class Cafe {
    private String namaCafe;

    // Daftar menu yang tersedia di cafe, menggunakan ArrayList sesuai instruksi tugas
    private ArrayList<Menu> daftarMenu;

    // Constructor untuk inisialisasi nama cafe dan daftar menu
    public Cafe(String namaCafe) {
        this.namaCafe = namaCafe;
        this.daftarMenu = new ArrayList<>();
    }

    // Getter untuk nama cafe dan daftar menu
    public String getNamaCafe() { return namaCafe; }
    // Tidak perlu setter untuk nama cafe karena biasanya nama tidak berubah setelah dibuat
    //
    public ArrayList<Menu> getDaftarMenu() { return daftarMenu; }

    // Method untuk menambahkan menu ke daftar menu cafe
    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    // polymorphism: method untuk menampilkan semua menu di cafe, memanfaatkan method detailMenu() yang bisa di-override
    public void tampilkanMenu() {
        System.out.println("\nDAFTAR MENU " + namaCafe + ":");
        System.out.println("------------------------------------------");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMenu.get(i).detailMenu());
        }
        System.out.println("------------------------------------------\n");
    }
}