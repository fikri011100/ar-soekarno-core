package binus.bmcc.artry.menu;

public class Menu {
    private String namaMobil, keterangan;
    private int image;

    public Menu(String namaMobil, String keterangan, int image) {
        this.namaMobil = namaMobil;
        this.keterangan = keterangan;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
