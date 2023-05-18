package managesection;

import java.util.Date;
import java.util.List;
import questionssection.CauHoi;

public class KiemTra {

    private static int dem = 0;
    private int id = ++dem;
    private double diem;
    private Date ngayThi;
    private HocVien hocVien;
    private List<CauHoi> cauHoi;

//    public KiemTra(double diem, Date ngayThi, HocVien hocVien, List<CauHoi> ds) {
//        this.diem = diem;
//        this.ngayThi = ngayThi;
//        this.hocVien = hocVien;
//        this.cauHoi = ds;
//    }
    public KiemTra() {
        
    }

    public void ghiDiem(double diem, Date ngayThi, HocVien hocVien, List<CauHoi> ds) {
        this.diem = diem;
        this.ngayThi = ngayThi;
        this.hocVien = hocVien;
        this.cauHoi = ds;
        
        hocVien.getKiemTra().add(this);
        cauHoi.forEach(ch -> ch.getHocVienDaLam().add(hocVien));
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }

    /**
     * @return the ngayThi
     */
    public Date getNgayThi() {
        return ngayThi;
    }

    /**
     * @param ngayThi the ngayThi to set
     */
    public void setNgayThi(Date ngayThi) {
        this.ngayThi = ngayThi;
    }

    /**
     * @return the hocVien
     */
    public HocVien getHocVien() {
        return hocVien;
    }

    /**
     * @param hocVien the hocVien to set
     */
    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    /**
     * @return the cauHoi
     */
    public List<CauHoi> getCauHoi() {
        return cauHoi;
    }

    /**
     * @param cauHoi the cauHoi to set
     */
    public void setCauHoi(List<CauHoi> cauHoi) {
        this.cauHoi = cauHoi;
    }

    
    
    
}