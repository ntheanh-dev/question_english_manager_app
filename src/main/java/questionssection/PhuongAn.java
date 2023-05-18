package questionssection;

public class PhuongAn {

    private static int dem = 0;
    private int id = ++ dem;
    private String noiDung;
    private boolean isPhuongAnDung;
    private String giaiThich;
    private int cauHoi_id;
    public PhuongAn(){};
    
    public PhuongAn(String noiDung, boolean isPhuongAnDung, String giaiThich, int cauHoi_id) {
        this.noiDung = noiDung;
        this.isPhuongAnDung = isPhuongAnDung;
        this.giaiThich = giaiThich;
        this.cauHoi_id = cauHoi_id;
    }

    public void hienThi() {
        System.out.println(this.noiDung);
    }

    public String getNoiDung() {
        return noiDung;
    }

    public boolean isIsPhuongAnDung() {
        return isPhuongAnDung;
    }

    public String getGiaiThich() {
        return giaiThich;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setIsPhuongAnDung(boolean isPhuongAnDung) {
        this.isPhuongAnDung = isPhuongAnDung;
    }

    public void setGiaiThich(String giaiThich) {
        this.giaiThich = giaiThich;
    }

    public void setCauHoi_id(int cauHoi_id) {
        this.cauHoi_id = cauHoi_id;
    }
}
