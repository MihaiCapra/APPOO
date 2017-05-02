import java.util.Comparator;

public class AscendingComparator implements Comparator<SmartPhone>{
    public int compare(SmartPhone o1, SmartPhone o2)
    {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}
