package questionssection;

import java.util.ArrayList;
import java.util.List;

public class Incomplete extends CauHoi {

    private final String noiDung;

    public Incomplete(String noiDung, DoKho doKho) {
        super(doKho);
        this.noiDung = noiDung;
    }

    public String getNoidung() {
        return this.noiDung;
    }
    
    @Override
    public Object[] getFields() {
       Object[] result = super.getFields();
        List<String> answers = new ArrayList<>();
        super.getDs().forEach(ch -> {
            answers.add(ch.layPhuongAnDung().getNoiDung());
        });
        result[1] = noiDung;
        result[2] = String.join(",",answers.toArray(String[]::new) );
        result[5] = "Incomplete";
        return result;
    }
}
