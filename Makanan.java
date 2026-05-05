//subclass Makanan yang mewarisi Menu
public class Makanan extends Menu {
    private String jenis;

    // Constructor untuk inisialisasi nama, harga, dan jenis makanan
    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }
    // Constructor overloading: jika jenis tidak diberikan, default "Standar"
    public Makanan(String nama, double harga) {
        super(nama, harga);
        this.jenis = "Standar";
    }
    // Getter & Setter untuk jenis makanan
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    // Override method detailMenu() untuk menambahkan informasi jenis makanan
    @Override
    public String detailMenu() {
        return super.detailMenu() + " [Jenis: " + jenis + "]";
    }
}


