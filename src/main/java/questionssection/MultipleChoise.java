package questionssection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultipleChoise {
    private static int dem = 0;
    private int id = ++dem;
    private String noiDung;
    private DanhMuc danhMuc;
    private List<PhuongAn> cacPhuongAn = new ArrayList<>();

    public MultipleChoise(){};
    
    public MultipleChoise(String noiDung, DanhMuc danhMuc) {
        this.noiDung = noiDung;
        this.danhMuc = danhMuc;
    }

    public void themPhuongAn(PhuongAn pa) {
        this.cacPhuongAn.add(pa);
    }
    
    public void themPhuongAn(PhuongAn...a) {
        this.cacPhuongAn.addAll(Arrays.asList(a));
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setCacPhuongAn(List<PhuongAn> cacPhuongAn) {
        this.cacPhuongAn = cacPhuongAn;
    }

    public int getId() {
        return id;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public List<PhuongAn> getCacPhuongAn() {
        return cacPhuongAn;
    }

    public PhuongAn layPhuongAnDung() {
        return cacPhuongAn.stream().filter(pa -> pa.isIsPhuongAnDung()).findFirst().get();
    }
}
