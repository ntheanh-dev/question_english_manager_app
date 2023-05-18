package managesection;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import questionssection.CauHoi;
import questionssection.Conversation;
import questionssection.DanhMuc;
import questionssection.DoKho;
import questionssection.Incomplete;
import questionssection.MultipleChoise;

public class QuanLyCauHoi extends QuanLy<CauHoi> {

    public List<CauHoi> getMultipleChoi(int n, HocVien hv) {
        return ds.stream().filter(ch -> ch.getDs().size() == 1 && !ch.getHocVienDaLam().contains(hv)).collect(Collectors.toList());
    }

    public int getSoLuongCauHoiMultiple() {
        return (int) ds.stream().filter(ch -> ch.getDs().size() == 1).count();
    }

    public CauHoi layConverstationTheoDoKho(DoKho dh) {
        Optional<CauHoi> cvs = getDs().stream().filter(ch -> ch instanceof Conversation && ch.getDoKho().equals(dh)).findAny();
        return cvs.isPresent() ? cvs.get() : null;
    }

    public CauHoi layIncompleteTheoDoKho(DoKho dh) {
        Optional<CauHoi> cvs = getDs().stream().filter(ch -> ch instanceof Incomplete && ch.getDoKho().equals(dh)).findAny();
        return cvs.isPresent() ? cvs.get() : null;
    }

    public List<CauHoi> timTheoNoiDung(String k) {
        return ds.stream().filter(ch -> {
            if (ch.getDs().size() == 1) {
                return ch.getDs().get(0).getNoiDung().contains(k);
            } else {
                return ch.getNoiDung().contains(k);
            }
        }).collect(Collectors.toList());
    }

    public List<CauHoi> timTheoDoKho(DoKho dh) {
        return ds.stream().filter(ch -> ch.getDoKho().equals(dh)).collect(Collectors.toList());
    }

    public List<CauHoi> timTheoDanhMuc(DanhMuc dm) {
        return ds.stream().filter(ch -> {
            for (MultipleChoise x : ch.getDs()) {
                if (x.getDanhMuc().equals(dm)) {
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toList());
    }

}
