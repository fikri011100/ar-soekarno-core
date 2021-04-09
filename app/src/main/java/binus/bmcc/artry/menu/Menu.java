package binus.bmcc.artry.menu;

public class Menu {
    private String namaMobil, keterangan, ukuran, berat, buatan, ar, desc;
    private int image;

    public Menu(String namaMobil, String keterangan, String ukuran, String berat, String buatan, String ar, String desc, int image) {
        this.namaMobil = namaMobil;
        this.keterangan = keterangan;
        this.ukuran = ukuran;
        this.berat = berat;
        this.buatan = buatan;
        this.ar = ar;
        this.desc = desc;
        this.image = image;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public String getBuatan() {
        return buatan;
    }

    public void setBuatan(String buatan) {
        this.buatan = buatan;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
