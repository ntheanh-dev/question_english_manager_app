package managesection;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import mainapp.Utils;

public class QuanLyHocVien extends QuanLy<HocVien> {

    public List<HocVien> timTheoQueQuan(String k) {
        return ds.stream().filter(hv -> hv.getQueQuan().contains(k)).collect(Collectors.toList());
    }

    public List<HocVien> timTheoTen(String k) {
        return ds.stream().filter(hv -> hv.getHoTen().contains(k)).collect(Collectors.toList());
    }

    public List<HocVien> timGioiTinh(String k) {
        return ds.stream().filter(hv -> hv.getGioiTinh().contains(k)).collect(Collectors.toList());
    }

    public List<HocVien> timTheoNgaySinh(String k) {
        return ds.stream().filter(hv -> {
            String ns = Utils.sp.format(hv.getNgaySinh());
            return ns.equals(k);
        }).collect(Collectors.toList());
    }

    public boolean kiemTraTonTai(String username) {
        return ds.stream().filter(hv -> hv.getTenDangNhap().equals(username)).findFirst().isPresent();
    }

    public HocVien timHocVien(String username, String password) {
        Optional<HocVien> hocVien = ds.stream().filter(hv -> hv.getTenDangNhap().equals(username) && hv.getMatKhau().equals(password)).findAny();
        if (hocVien.isPresent()) {
            return hocVien.get();
        }
        return null;
    }

    public boolean capNhap(int id, String ht, String tenDangNhap, String matKhau, Date ngaySinh, String gioiTinh, String queQuan) throws ParseException {
        if (ds.stream().filter(hv -> hv.getTenDangNhap().equals(tenDangNhap) && hv.getId() != id).findAny().isPresent()) {
            return false;
        }
        for (HocVien hv : ds) {
            if (hv.getId() == id) {
                hv.setHoTen(ht);
                hv.setTenDangNhap(tenDangNhap);
                hv.setMatKhau(matKhau);
                hv.setNgaySinh(ngaySinh);
                hv.setGioiTinh(gioiTinh);
                hv.setQueQuan(queQuan);
                return true;
            }
        }
        return false;
    }
}
