public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil("Toyota Avanza", 2022, 4);
        Kendaraan kendaraan2 = new Motor("Honda Vario", 2023, "Matic");

        System.out.println("=== Data Kendaraan 1 ===");
        kendaraan1.jenisKendaraan();
        kendaraan1.tampilInfo();

        System.out.println();

        System.out.println("=== Data Kendaraan 2 ===");
        kendaraan2.jenisKendaraan();
        kendaraan2.tampilInfo();
    }
}