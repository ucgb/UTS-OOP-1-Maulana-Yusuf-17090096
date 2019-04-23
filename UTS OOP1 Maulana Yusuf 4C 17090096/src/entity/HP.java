package entity;

public class HP {

    private String id;
    private String pelanggan;
    private String merk;

    public String getId() { return id; }

    public void setId(String Id) { this.id = id; }

    public String getPelanggan() { return pelanggan; }

    public void setPelanggan(String pelanggan) { this.pelanggan = pelanggan; }

    public String getMerk() { return merk; }

    public void setMerk(String merk) { this.merk = merk; }

    public HP (String id, String pelanggan, String merk) {
        this.id = id;
        this.pelanggan = pelanggan;
        this.merk = merk;
    }


    public boolean equals(Object object) {
        HP temp = (HP) object;
        return id.equals(temp.getId());
    }
}