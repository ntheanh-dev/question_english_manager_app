package questionssection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import managesection.HocVien;

public class CauHoi {
    private static int dem = 0;
    private int id = ++dem;
    private DoKho doKho;
    private List<MultipleChoise> ds = new ArrayList<>();
    private List<HocVien> hocVienDaLam = new ArrayList<>();
    
    public CauHoi(DoKho doKho) {
        this.doKho = doKho;
    }
    
    public void themCauHoi(MultipleChoise mtp) {
        this.ds.add(mtp);
    }
    
    public void themCauHoi(MultipleChoise...mtp) {
        this.ds.addAll(Arrays.asList(mtp));
    }
    
    public int getId() {
        return id;
    }

    public List<MultipleChoise> getDs() {
        return ds;
    }

    public DoKho getDoKho() {
        return doKho;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDanhSach(List<MultipleChoise> danhSach) {
        this.ds = danhSach;
    }

    public String getNoiDung(){return " ";}
    
    public Object[] getFields() {
        return new Object[]{id,ds.get(0).getNoiDung(),ds.get(0).layPhuongAnDung().getNoiDung(),
        ds.get(0).getDanhMuc(),doKho,"MultipleChoise"};
    }

    public List<HocVien> getHocVienDaLam() {
        return hocVienDaLam;
    }
    
    
    
}
