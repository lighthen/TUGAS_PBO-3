public class Menu {
    // atribut private untuk enkapsulasi
    private String nama;
    private double harga;
    
    // construktor untuk inisialisasi nama dan harga
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // constructor overloading: jika hanya nama yang diberikan, harga default 0.0
    public Menu(String nama) {
        this.nama = nama;
        this.harga = 0.0;
    }
    // getter dan setter untuk nama dan harga
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
    // method untuk menampilkan detail menu, bisa di-override oleh subclass
    public String detailMenu() {
        return nama + " - Rp " + String.format("%.0f", harga);
    }
}



