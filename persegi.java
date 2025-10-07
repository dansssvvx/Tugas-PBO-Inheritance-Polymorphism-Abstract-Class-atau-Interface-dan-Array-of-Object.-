public class persegi implements BangunDatar, info {
    // Atribut khusus untuk persegi.
    private double sisi;

    public persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah sebuah persegi.");
    }
}