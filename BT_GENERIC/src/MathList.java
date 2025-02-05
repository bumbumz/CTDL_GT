import java.util.List;

public class MathList<T extends Number> implements AVG {

    private List<T> list;

    public MathList(List<T> list) {
        this.list = list;
    }

    @Override
    public double avg() {
        double sum = 0;
        for (T t : list) {
            sum += t.doubleValue();
        }
        return sum / list.size();
    }
}
