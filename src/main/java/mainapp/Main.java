package mainapp;
import controller.LoginPage;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Utils.napHocVien();
        Utils.napTatCaCacDangCauHoi();
        new LoginPage().setVisible(true);
    }
}
