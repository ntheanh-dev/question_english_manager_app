package managesection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLy<T> {
    protected List<T> ds = new ArrayList<>();
    public void them(T ele) {
        this.getDs().add(ele);
    }
    
    public void them(T...eles) {
        this.getDs().addAll(Arrays.asList(eles));
    }
    
    public void xoa(T ele) {
        this.getDs().remove(ele);
    }
    /**
     * @return the ds
     */
    public List<T> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<T> ds) {
        this.ds = ds;
    }
    
    
}
