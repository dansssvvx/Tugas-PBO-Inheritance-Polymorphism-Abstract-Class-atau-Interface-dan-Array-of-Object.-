public class lingkaran implements BangunDatar, info {
    private double jariJari;

    public lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public void tampilkanInfo() {
        System.out.println("Ini adalah sebuah lingkaran.");
    }
}