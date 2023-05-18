package mainapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import managesection.KiemTra;
import managesection.HocVien;
import questionssection.CauHoi;
import questionssection.Conversation;
import questionssection.DanhMuc;
import questionssection.DoKho;
import questionssection.Incomplete;
import questionssection.MultipleChoise;
import questionssection.PhuongAn;

public class Utils {
    public static final SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");

    public static List<HocVien> danhSachHocVien = new ArrayList<>();
    public static List<CauHoi> danhSachCauHoi = new ArrayList<>();

    public Utils() {
    }

    ;
    public static List<CauHoi> napMultipeChoise() {
        List<CauHoi> ds = new ArrayList<>();
        MultipleChoise mtp1 = new MultipleChoise("I ... a developer", DanhMuc.DONG_TU);
        mtp1.themPhuongAn(
                new PhuongAn("is", false, "no", mtp1.getId()),
                new PhuongAn("was", false, "no", mtp1.getId()),
                new PhuongAn("were", false, "no", mtp1.getId()),
                new PhuongAn("am", true, "no", mtp1.getId())
        );
        CauHoi ch1 = new CauHoi(DoKho.DE);
        ch1.themCauHoi(mtp1);

        MultipleChoise mtp2 = new MultipleChoise("It’s important to brush your ………. at least twice a day.", DanhMuc.DANH_TU);
        mtp2.themPhuongAn(
                new PhuongAn("tooth", false, "Dạng số nhiều của “tooth” là “teeth”.", mtp2.getId()),
                new PhuongAn("teeth", true, "Dạng số nhiều của “tooth” là “teeth”.", mtp2.getId()),
                new PhuongAn("tooths", false, "Dạng số nhiều của “tooth” là “teeth”.", mtp2.getId()),
                new PhuongAn("toothes", false, "Dạng số nhiều của “tooth” là “teeth”.", mtp2.getId())
        );
        CauHoi ch2 = new CauHoi(DoKho.DE);
        ch2.themCauHoi(mtp2);

        MultipleChoise mtp3 = new MultipleChoise("She sings __________.",
                DanhMuc.TRANG_TU);
        mtp3.themPhuongAn(new PhuongAn("good", false, "Sai từ.", mtp3.getId()),
                new PhuongAn("well", true, "Đúng từ.", mtp3.getId()),
                new PhuongAn("bad", false, "Sai từ.", mtp3.getId()),
                new PhuongAn("fast", false, "Sai từ.", mtp3.getId()));
        CauHoi ch3 = new CauHoi(DoKho.DE);
        ch3.themCauHoi(mtp3);

        MultipleChoise mtp5 = new MultipleChoise("I'm going to the store. Do you want to come __________?",
                DanhMuc.GIOI_TU);
        mtp5.themPhuongAn(new PhuongAn("with", true, "Đúng từ.", mtp5.getId()),
                new PhuongAn("to", false, "Sai từ.", mtp5.getId()),
                new PhuongAn("for", false, "Sai từ.", mtp5.getId()),
                new PhuongAn("on", false, "Sai từ.", mtp5.getId()));
        CauHoi ch5 = new CauHoi(DoKho.KHO);
        ch5.themCauHoi(mtp5);

        MultipleChoise mtp6 = new MultipleChoise("I have been studying English for 2 years. How long _________?",
                DanhMuc.CAU_HOI_DUOI);
        mtp6.themPhuongAn(new PhuongAn("have you been studying English?", true, "Đúng câu hỏi.", mtp6.getId()),
                new PhuongAn("did you study English?", false, "Sai câu hỏi.", mtp6.getId()),
                new PhuongAn("are you studying English?", false, "Sai câu hỏi.", mtp6.getId()),
                new PhuongAn("do you study English?", false, "Sai câu hỏi.", mtp6.getId()));
        CauHoi ch6 = new CauHoi(DoKho.KHO);
        ch6.themCauHoi(mtp6);

        MultipleChoise mtp7 = new MultipleChoise("The coffee is __________.",
                DanhMuc.TINH_TU);
        mtp7.themPhuongAn(new PhuongAn("hot", true, "Đúng từ.", mtp7.getId()),
                new PhuongAn("cold", false, "Sai từ.", mtp7.getId()),
                new PhuongAn("sweet", false, "Sai từ.", mtp7.getId()),
                new PhuongAn("bitter", false, "Sai từ.", mtp7.getId()));
        CauHoi ch7 = new CauHoi(DoKho.TRUNG_BINH);
        ch7.themCauHoi(mtp7);

        MultipleChoise mtp8 = new MultipleChoise("I need to buy some __________ for the recipe.",
                DanhMuc.DANH_TU);
        mtp8.themPhuongAn(new PhuongAn("tomatoes", true, "Đúng từ.", mtp8.getId()),
                new PhuongAn("potatoes", false, "Sai từ.", mtp8.getId()),
                new PhuongAn("carrots", false, "Sai từ.", mtp8.getId()),
                new PhuongAn("broccolis", false, "Sai từ.", mtp8.getId()));
        CauHoi ch8 = new CauHoi(DoKho.TRUNG_BINH);
        ch8.themCauHoi(mtp8);

        MultipleChoise mtp9 = new MultipleChoise("I don't want to __________ my favorite TV show.",
                DanhMuc.DONG_TU);
        mtp9.themPhuongAn(new PhuongAn("miss", true, "Đúng từ.", mtp9.getId()),
                new PhuongAn("hit", false, "Sai từ.", mtp9.getId()),
                new PhuongAn("catch", false, "Sai từ.", mtp9.getId()),
                new PhuongAn("watch", false, "Sai từ.", mtp9.getId()));
        CauHoi ch9 = new CauHoi(DoKho.TRUNG_BINH);
        ch9.themCauHoi(mtp9);

        MultipleChoise mtp10 = new MultipleChoise("He ran __________ to catch the bus.",
                DanhMuc.TRANG_TU);
        mtp10.themPhuongAn(new PhuongAn("slowly", false, "Sai từ.", mtp10.getId()),
                new PhuongAn("quickly", true, "Đúng từ.", mtp10.getId()),
                new PhuongAn("carefully", false, "Sai từ.", mtp10.getId()),
                new PhuongAn("happily", false, "Sai từ.", mtp10.getId()));
        CauHoi ch10 = new CauHoi(DoKho.TRUNG_BINH);
        ch10.themCauHoi(mtp10);

        MultipleChoise mtp11 = new MultipleChoise("I am interested __________ learning a new language.",
                DanhMuc.GIOI_TU);
        mtp11.themPhuongAn(new PhuongAn("in", true, "Đúng từ.", mtp11.getId()),
                new PhuongAn("on", false, "Sai từ.", mtp11.getId()),
                new PhuongAn("at", false, "Sai từ.", mtp11.getId()),
                new PhuongAn("by", false, "Sai từ.", mtp11.getId()));
        CauHoi ch11 = new CauHoi(DoKho.KHO);
        ch11.themCauHoi(mtp11);

        MultipleChoise mtp12 = new MultipleChoise("You're coming to the party, __________?", DanhMuc.CAU_HOI_DUOI);
        mtp12.themPhuongAn(
                new PhuongAn("aren't you?", true, "Đúng", mtp12.getId()),
                new PhuongAn("don't you?", false, "Sai", mtp12.getId()),
                new PhuongAn("do you?", false, "Sai", mtp12.getId()),
                new PhuongAn("will you?", false, "Sai", mtp12.getId()));
        CauHoi ch12 = new CauHoi(DoKho.KHO);
        ch12.themCauHoi(mtp12);

        ds.add(ch1);
        ds.add(ch2);
        ds.add(ch3);
        ds.add(ch5);
        ds.add(ch6);
        ds.add(ch7);
        ds.add(ch8);
        ds.add(ch9);
        ds.add(ch10);
        ds.add(ch11);
        ds.add(ch12);
        return ds;
    }

    public static List<CauHoi> napConversation() {
        List<CauHoi> ds = new ArrayList<>();

        Conversation ch2 = new Conversation("""
                                            Dear all employees, 
                                            Please be advised that starting from the next payroll period, we will be (1).... all employee paychecks to direct deposit. This will apply to all employees, regardless of their position or pay grade. To ensure timely and accurate payment, we ask that you (2).... your direct deposit information by logging into the employee portal at www.ourcompany.com and navigating to the payroll section. 
                                            Please note that we will no longer be (3).... paper paychecks, (4).... it is imperative that you update your information as soon as possible. If you have any questions or concerns, please do not hesitate to reach out to HR. 
                                            Thank you, 
                                            Our Company""", DoKho.DE);
        MultipleChoise mtp15 = new MultipleChoise("Cau1", DanhMuc.DONG_TU);
        mtp15.themPhuongAn(new PhuongAn("switching", true, "No explanation", mtp15.getId()),
                new PhuongAn("delaying", false, "No explanation", mtp15.getId()),
                new PhuongAn("receiving", false, "No explanation", mtp15.getId()),
                new PhuongAn("denying", false, "No explanation", mtp15.getId()));
        MultipleChoise mtp16 = new MultipleChoise("Cau2", DanhMuc.CAU_HOI_DUOI);
        mtp16.themPhuongAn(new PhuongAn("confirm that your paycheck is accurate", false, "No explanation", mtp16.getId()),
                new PhuongAn("submit your time off request", false, "No explanation", mtp16.getId()),
                new PhuongAn("update your direct deposit information", true, "No explanation", mtp16.getId()),
                new PhuongAn("schedule a meeting with your supervisor", false, "No explanation", mtp16.getId()));

        MultipleChoise mtp17 = new MultipleChoise("Cau3", DanhMuc.DONG_TU);
        mtp17.themPhuongAn(new PhuongAn("distributing", false, "No explanation", mtp17.getId()),
                new PhuongAn("storing", false, "No explanation", mtp17.getId()),
                new PhuongAn("processing", false, "No explanation", mtp17.getId()),
                new PhuongAn("issuing", true, "No explanation", mtp17.getId()));

        MultipleChoise mtp18 = new MultipleChoise("Cau4", DanhMuc.GIOI_TU);
        mtp18.themPhuongAn(new PhuongAn("In spite of", false, "No explanation", mtp18.getId()),
                new PhuongAn("Because of", false, "No explanation", mtp18.getId()),
                new PhuongAn("Due to", false, "No explanation", mtp18.getId()),
                new PhuongAn("As of", true, "No explanation", mtp18.getId()));

        ch2.themCauHoi(mtp15, mtp16, mtp17, mtp18);

        CauHoi ch3 = new Conversation("""
                                        Dear valued customers,
                                        We would like to inform you that starting next month, we will be (1).... new store hours.
                                        Our store will now be (2).... at 9:00am and will close (3).... 6:00pm from Monday to Friday, and (4).... 4:00pm on Saturdays.
                                        We hope that these new hours will better serve our customers' needs.
                                        Thank you for your understanding and continued support.
                                        Sincerely,
                                        The Management Team""", DoKho.TRUNG_BINH);
        MultipleChoise mtp19 = new MultipleChoise("Cau5", DanhMuc.DONG_TU);
        mtp19.themPhuongAn(new PhuongAn("implementing", true, "No explaintion", mtp19.getId()),
                new PhuongAn("eliminating", false, "No explaintion", mtp19.getId()),
                new PhuongAn("reducing", false, "No explaintion", mtp19.getId()),
                new PhuongAn("increasing", false, "No explaintion", mtp19.getId()));
        MultipleChoise mtp20 = new MultipleChoise("Cau6", DanhMuc.DANH_TU);
        mtp20.themPhuongAn(new PhuongAn("opening", false, "No explaintion", mtp20.getId()),
                new PhuongAn("closing", false, "No explaintion", mtp20.getId()),
                new PhuongAn("changing", true, "No explaintion", mtp20.getId()),
                new PhuongAn("renovating", false, "No explaintion", mtp20.getId()));

        MultipleChoise mtp21 = new MultipleChoise("Cau7", DanhMuc.TRANG_TU);
        mtp21.themPhuongAn(new PhuongAn("at", false, "No explaintion", mtp21.getId()),
                new PhuongAn("for", false, "No explaintion", mtp21.getId()),
                new PhuongAn("from", false, "No explaintion", mtp21.getId()),
                new PhuongAn("until", true, "No explaintion", mtp21.getId()));

        MultipleChoise mtp22 = new MultipleChoise("Cau8", DanhMuc.GIOI_TU);
        mtp22.themPhuongAn(new PhuongAn("at", false, "No explaintion", mtp22.getId()),
                new PhuongAn("by", false, "No explaintion", mtp22.getId()),
                new PhuongAn("until", false, "No explaintion", mtp22.getId()),
                new PhuongAn("at", true, "No explaintion", mtp22.getId()));
        ch3.themCauHoi(mtp19, mtp20, mtp21, mtp22);
        ds.add(ch2);
        ds.add(ch3);
        return ds;
    }

    public static List<CauHoi> napIncomplete() {
        List<CauHoi> ds = new ArrayList<>();
        CauHoi ch1 = new Incomplete("""
                                    ATTENTION ALL TENANTS
                                    Wimberley Group will (1).... its rent collection system to electronic one. This change will apply to all apartments effective February 1. (2)..... Cash and personal checks will no longer be accepted.
                                    Every tenant needs to create a user profile an www.wimberlygroup.com. After logging in, tenants will be able to (3)... a payment. You can do this by selecting the unpaid bill and then clicking on the button at the bottom of the screen. (4).... you hit 'Pay', the amount you designate will be deducted from your registered credit card or bank account. If you wish to arrange automatic payments, please click the button labeled 'Pay this amount every month.' Thank you for you cooperation. If you have any questions, e-mail us at help@wimberlygroup.com.""", DoKho.KHO);

        MultipleChoise mtp11 = new MultipleChoise("Cau1", DanhMuc.DONG_TU);
        mtp11.themPhuongAn(new PhuongAn("induce", false, "No explaintion", mtp11.getId()),
                new PhuongAn("fluctuate", false, "No explaintion", mtp11.getId()),
                new PhuongAn("convert", true, "No explaintion", mtp11.getId()),
                new PhuongAn("recover", false, "No explaintion", mtp11.getId()));

        MultipleChoise mtp12 = new MultipleChoise("Cau2", DanhMuc.CAU_HOI_DUOI);
        mtp12.themPhuongAn(new PhuongAn("Tenants had found the new system easy to", false, "No explaintion", mtp12.getId()),
                new PhuongAn("From that day on, tenants must pay their rental fees online.", true, "No explaintion", mtp12.getId()),
                new PhuongAn("Arperment optionem allowed for a greater variety", false, "No explaintion", mtp12.getId()),
                new PhuongAn("Only certain Wimberley Group occupants will be affected", false, "No explaintion", mtp12.getId()));

        MultipleChoise mtp13 = new MultipleChoise("Cau3", DanhMuc.DONG_TU);
        mtp13.themPhuongAn(new PhuongAn("postpone", false, "No explaintion", mtp13.getId()),
                new PhuongAn("cancel", false, "No explaintion", mtp13.getId()),
                new PhuongAn("oppose", false, "No explaintion", mtp13.getId()),
                new PhuongAn("make", true, "No explaintion", mtp13.getId()));

        MultipleChoise mtp14 = new MultipleChoise("Cau4", DanhMuc.GIOI_TU);
        mtp14.themPhuongAn(new PhuongAn("Even though", false, "No explaintion", mtp14.getId()),
                new PhuongAn("During", false, "No explaintion", mtp14.getId()),
                new PhuongAn("since", false, "No explaintion", mtp14.getId()),
                new PhuongAn("As soon as", true, "No explaintion", mtp14.getId()));

        ch1.themCauHoi(mtp11, mtp12, mtp13, mtp14);
        ///////////////////////// Converstation 2 /////////////////////////////
        CauHoi ch2 = new Incomplete("""
                                    Notice for All Staff
                                    The shopping mall our store is located in will be closed from December 24 to 26. (9)...., some of you will be coming in on December 24 to set up for our post-holiday sale. The guard who usually opens the mall doors in the morning is off duty during this time.
                                    (10) .... Daniel Monahan is the most senior staff member, so I will give it to him, and he will let everyone inside.
                                    It is vital that you (11).... Daniel at the entrance at exactly 10 A.M. We don't want to waste time making him go back and forth to open the doors, so please be considerate and arrive as (12).... as you can.
                                    Thank you for your understanding.
                                    Alison Culpeper
                                    Store manager""", DoKho.TRUNG_BINH);

        MultipleChoise mtp21 = new MultipleChoise("Cau9", DanhMuc.GIOI_TU);
        mtp21.themPhuongAn(new PhuongAn("Besides", false, "No explaintion", mtp21.getId()),
                new PhuongAn("Otherwise", false, "No explaintion", mtp21.getId()),
                new PhuongAn("Accordingly", false, "No explaintion", mtp21.getId()),
                new PhuongAn("However", true, "No explaintion", mtp21.getId()));

        MultipleChoise mtp22 = new MultipleChoise("Cau10", DanhMuc.TRANG_TU);
        mtp22.themPhuongAn(new PhuongAn("Making sure we answer customer inquiries in a timely manner is our priority.", false, "No explaintion", mtp22.getId()),
                new PhuongAn("You should be able to use your employee pass to access the mall.", false, "No explaintion", mtp22.getId()),
                new PhuongAn(" A security code will therefore be required to enter the building.", true, "No explaintion", mtp22.getId()),
                new PhuongAn("You will need to handle backorders caused by his absence", false, "No explaintion", mtp22.getId()));

        MultipleChoise mtp23 = new MultipleChoise("Cau11", DanhMuc.DONG_TU);
        mtp23.themPhuongAn(new PhuongAn("are meeting", false, "No explaintion", mtp23.getId()),
                new PhuongAn("meet ", true, "No explaintion", mtp23.getId()),
                new PhuongAn("had met", false, "No explaintion", mtp23.getId()),
                new PhuongAn("met", false, "No explaintion", mtp23.getId()));

        MultipleChoise mtp24 = new MultipleChoise("Cau12", DanhMuc.TINH_TU);
        mtp24.themPhuongAn(new PhuongAn("punctually", true, "No explaintion", mtp24.getId()),
                new PhuongAn("regulary", false, "No explaintion", mtp24.getId()),
                new PhuongAn("politely", false, "No explaintion", mtp24.getId()),
                new PhuongAn("impressively", false, "No explaintion", mtp24.getId()));

        ch2.themCauHoi(mtp21, mtp22, mtp23, mtp24);

        CauHoi ch3 = new Incomplete("""
                                    Announcement
                                    The company will be closed from January 1 to January 3 for the New Year holiday. (1)...., a few employees will need to come in on January 1 to perform inventory checks. The security guard who typically opens the building will not be working during this time.
                                    (2).... Alice Johnson is the most experienced employee, so she will be responsible for letting everyone inside.
                                    Please make sure to (3).... Alice at the entrance exactly at 9 A.M. to avoid any delays in starting the inventory check. It would be greatly appreciated if you could arrive (4).... to help get everything set up as soon as possible.
                                    Thank you for your cooperation.
                                    John Smith
                                    Operations Manager""", DoKho.DE);

        MultipleChoise mtp31 = new MultipleChoise("Cau 1", DanhMuc.GIOI_TU);
        mtp31.themPhuongAn(new PhuongAn("Therefore", false, "No explanation", mtp31.getId()),
                new PhuongAn("Moreover", false, "No explanation", mtp31.getId()),
                new PhuongAn("Nonetheless", false, "No explanation", mtp31.getId()),
                new PhuongAn("However", true, "No explanation", mtp31.getId()));

        MultipleChoise mtp32 = new MultipleChoise("Cau 2", DanhMuc.TRANG_TU);
        mtp32.themPhuongAn(new PhuongAn("Employees should use their access cards to enter the building.", false, "No explanation", mtp32.getId()),
                new PhuongAn("All employees must report to the security guard before entering the building.", false, "No explanation", mtp32.getId()),
                new PhuongAn("An access code will be required to enter the building.", true, "No explanation", mtp32.getId()),
                new PhuongAn("Employees should arrive early to avoid delays in entering the building.", false, "No explanation", mtp32.getId()));

        MultipleChoise mtp33 = new MultipleChoise("Cau 3", DanhMuc.DONG_TU);
        mtp33.themPhuongAn(new PhuongAn("are contacting", false, "No explanation", mtp33.getId()),
                new PhuongAn("contact", true, "No explanation", mtp33.getId()),
                new PhuongAn("had contacted", false, "No explanation", mtp33.getId()),
                new PhuongAn("contacted", false, "No explanation", mtp33.getId()));

        MultipleChoise mtp34 = new MultipleChoise("Cau 4", DanhMuc.TINH_TU);
        mtp34.themPhuongAn(new PhuongAn("promptly", true, "No explanation", mtp34.getId()),
                new PhuongAn("reliably", false, "No explanation", mtp34.getId()),
                new PhuongAn("cheerfully", false, "No explanation", mtp34.getId()),
                new PhuongAn("enthusiastically", false, "No explanation", mtp34.getId()));

        ch3.themCauHoi(mtp31, mtp32, mtp33, mtp34);

        ds.add(ch1);
        ds.add(ch2);
        ds.add(ch3);
        return ds;
    }

    public static void napTatCaCacDangCauHoi() {
        Utils.napMultipeChoise().forEach(ch -> danhSachCauHoi.add(ch));
        Utils.napConversation().forEach(ch -> danhSachCauHoi.add(ch));
        Utils.napIncomplete().forEach(ch -> danhSachCauHoi.add(ch));
    }

    public static void napHocVien() throws ParseException {
        List<HocVien> ds = new ArrayList<>();
        HocVien hv = new HocVien("Nguyen The Anh", "Me Linh-Ha Noi", "20/4/2003", "Nam", "theanh1", "12345");
        KiemTra kt1 = new KiemTra();
        KiemTra kt2 = new KiemTra();
        KiemTra kt3 = new KiemTra();
        KiemTra kt4 = new KiemTra();
        KiemTra kt5 = new KiemTra();
        KiemTra kt6 = new KiemTra();
        KiemTra kt7 = new KiemTra();

        kt1.ghiDiem(9, Utils.sp.parse("1/1/2023"), hv, Utils.napConversation());
        kt2.ghiDiem(4, Utils.sp.parse("1/2/2023"), hv, Utils.napConversation());
        kt3.ghiDiem(8, Utils.sp.parse("1/2/2023"), hv, Utils.napConversation());
        kt4.ghiDiem(5, Utils.sp.parse("1/3/2023"), hv, Utils.napConversation());
        kt5.ghiDiem(7, Utils.sp.parse("1/4/2023"), hv, Utils.napConversation());
        kt6.ghiDiem(2, Utils.sp.parse("1/4/2023"), hv, Utils.napConversation());
        kt7.ghiDiem(10, Utils.sp.parse("1/4/2023"), hv, Utils.napConversation());

        ds.add(hv);
        ds.add(new HocVien("Dang Minh Phuc", "Ho Chi Minh", "29/4/2003", "Nam", "minhphuc1", "12345"));
        ds.add(new HocVien("Tran Ngoc Huyen", "Go Vap-TP HCM", "2/3/2000", "Nu", "theanh2", "12345"));
        ds.add(new HocVien("Duong Van Kiet", "Hoc Mon-Tp HCM", "9/12/2003", "Nam", "theanh3", "12345"));
        ds.add(new HocVien("Do Van Minh", "Dong Anh-Ha Noi", "9/9/2003", "Nam", "theanh4", "12345"));
        ds.add(new HocVien("Nguyen Thi Kim Thuy", "Ba Vi-Ha Noi", "5/6/2003", "Nu", "theanh5", "12345"));
        ds.forEach(ele -> danhSachHocVien.add(ele));
    }

    public static List<DanhMuc> napDanhMuc() {
        List<DanhMuc> ds = new ArrayList<>();
        ds.add(DanhMuc.DANH_TU);
        ds.add(DanhMuc.DONG_TU);
        ds.add(DanhMuc.TINH_TU);
        ds.add(DanhMuc.TRANG_TU);
        ds.add(DanhMuc.GIOI_TU);
        ds.add(DanhMuc.CAU_HOI_DUOI);
        return ds;
    }
}
