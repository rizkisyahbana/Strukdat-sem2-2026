class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Jenis : Mobil");
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Pintu : " + jumlahPintu);
    }
}