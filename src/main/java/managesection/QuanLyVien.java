package managesection;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mainapp.Utils;

public class QuanLyVien extends TaiKhoan {
    public QuanLyVien() {
//        super();
    }

    public QuanLyVien(String hoTen, String queQuan, Date ngaySinh, String gioiTinh, String tenDangNhap, String matKhau) {
        super(hoTen, queQuan, ngaySinh, gioiTinh, tenDangNhap, matKhau);
    }

    public QuanLyVien(String hoTen, String queQuan, String ngaySinh, String gioiTinh, String tenDangNhap, String matKhau) throws ParseException {
        super(hoTen, queQuan, Utils.sp.parse(ngaySinh), gioiTinh, tenDangNhap, matKhau);
    }
}
