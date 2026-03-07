abstract class Kendaraan {
    private String merk;
    private int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void tampilInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun);
    }

    public abstract void jenisKendaraan();
}