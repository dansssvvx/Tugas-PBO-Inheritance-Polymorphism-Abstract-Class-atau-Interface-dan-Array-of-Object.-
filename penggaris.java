public class penggaris implements info {
    private int panjangCm;
    private String bahan;

    public penggaris(int panjangCm, String bahan) {
        this.panjangCm = panjangCm;
        this.bahan = bahan;
    }

    public void tampilkanInfo() {
        System.out.println("Ini adalah penggaris " + this.bahan + " dengan panjang " + this.panjangCm + " cm.");
    }
}