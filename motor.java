class Motor extends Kendaraan {
    private String tipeMotor;

    public Motor(String merk, int tahun, String tipeMotor) {
        super(merk, tahun);
        this.tipeMotor = tipeMotor;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    public void setTipeMotor(String tipeMotor) {
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Jenis : Motor");
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tipe  : " + tipeMotor);
    }
}