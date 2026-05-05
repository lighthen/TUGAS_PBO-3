public class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    // Constructor overloading: jika ukuran tidak diberikan, default "Sedang"
    public Minuman(String nama, double harga) {
        super(nama, harga);
        this.ukuran = "Sedang";
    }

    public String getUkuran() { return ukuran; }
    public void setUkuran(String ukuran) { this.ukuran = ukuran; }

    // Override method detailMenu() untuk menambahkan informasi ukuran minuman
    @Override
    public String detailMenu() {
        return super.detailMenu() + " (Ukuran: " + ukuran + ")";
    }
}