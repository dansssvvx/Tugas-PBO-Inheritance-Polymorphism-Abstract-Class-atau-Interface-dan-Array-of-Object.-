public class main {
    public static void main(String[] args) {
        persegi persegi1 = new persegi(10);
        lingkaran lingkaran1 = new lingkaran(5);

        persegi1.tampilkanInfo();
        System.out.println("Luas Persegi: " + persegi1.hitungLuas());

        System.out.println("---");

        lingkaran1.tampilkanInfo();
        System.out.println("Luas Lingkaran: " + lingkaran1.hitungLuas());

        System.out.println("---");

        penggaris penggaris1 = new penggaris(30, "Besi");

        penggaris1.tampilkanInfo();

    }
}