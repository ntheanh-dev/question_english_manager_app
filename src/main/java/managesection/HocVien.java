package managesection;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import mainapp.Utils;

public class HocVien extends TaiKhoan{
    private final List<KiemTra> kiemTra = new ArrayList<>();
    public HocVien() {
//        super();
    }

    public HocVien(String hoTen, String queQuan, Date ngaySinh, String gioiTinh, String tenDangNhap, String matKhau) {
        super(hoTen, queQuan, ngaySinh, gioiTinh, tenDangNhap, matKhau);
    }

    public HocVien(String hoTen, String queQuan, String ngaySinh, String gioiTinh, String tenDangNhap, String matKhau) throws ParseException {
        super(hoTen, queQuan, Utils.sp.parse(ngaySinh), gioiTinh, tenDangNhap, matKhau);
    }
    public List<KiemTra> getKiemTra() {
        return kiemTra;
    }
    
    public List<KiemTra> layKiemTraTrongThang(int thang) {
        return kiemTra.stream().filter(diem -> {
            return diem.getNgayThi().getMonth() == thang;
        }).collect(Collectors.toList());
    }

    public double layDiemTrungBinhTrongThang(int thang) {
        List<KiemTra> kiemTraTrongThang = this.layKiemTraTrongThang(thang);
        if(kiemTraTrongThang.isEmpty()) return 0;
        double diemTrungBinh = 0;
        for(var x : kiemTraTrongThang) {
            diemTrungBinh += x.getDiem();
        }
        return diemTrungBinh / kiemTraTrongThang.size();
    }
}
