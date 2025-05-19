class Mobil {
    private String merk;
    private Mesin mesin;

    Mobil() {
    }

    public void setMerk(String var1) {
        this.merk = var1;
    }

    public void setMesin(Mesin var1) {
        this.mesin = var1;
    }

    public String getMerk()  {
        return this.merk;
    }

    public Mesin getMesin() {
        return this.mesin;
    }
}