package managesection;
import java.util.Date;
import mainapp.Utils;
public abstract class TaiKhoan {
    private static int dem = 0;
    private int id = ++dem;
    private String hoTen;
    private String queQuan;
    private Date ngaySinh;
    private String gioiTinh;
    private String tenDangNhap;
    private String matKhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String hoTen, String queQuan, Date ngaySinh, String gioiTinh, String tenDangNhap, String matKhau) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
 
    public Object[] getFields() {
        return new Object[]{id,hoTen,Utils.sp.format(ngaySinh),gioiTinh,queQuan,tenDangNhap,matKhau};
    }  

    public static int getDem() {
        return dem;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
}
