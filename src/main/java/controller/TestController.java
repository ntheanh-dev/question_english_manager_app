package controller;
import java.text.ParseException;
import mainapp.Utils;

public class TestController {

    public static void main(String[] args) throws ParseException {
//        try {
//            List<Diem> ds = new ArrayList<>();
//            Diem d1 = new Diem(9, Service.sp.parse("1/1/2023"), new HocVien(), new Utils().napConversation());
//            Diem d2 = new Diem(9, Service.sp.parse("1/1/2023"), new HocVien(), new Utils().napConversation());
//            Diem d4 = new Diem(5, Service.sp.parse("1/2/2023"), new HocVien(), new Utils().napConversation());            Diem d3 = new Diem(5, Service.sp.parse("1/3/2023"), new HocVien(), new Utils().napConversation());
//            Diem d5 = new Diem(8, Service.sp.parse("1/2/2023"), new HocVien(), new Utils().napConversation());
//            Diem d6 = new Diem(5, Service.sp.parse("1/3/2023"), new HocVien(), new Utils().napConversation());
//            Diem d7 = new Diem(9, Service.sp.parse("1/4/2023"), new HocVien(), new Utils().napConversation());
//
//            ds.add(d1);
//            ds.add(d2);
//            ds.add(d3);
//            ds.add(d4);
//            ds.add(d5);
//            ds.add(d6);
//            ds.add(d7);
//            
//            new Chart(ds).init();
//        } catch (ParseException ex) {
//            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Utils.napHocVien();
        new LoginPage().setVisible(true);

    }
}
