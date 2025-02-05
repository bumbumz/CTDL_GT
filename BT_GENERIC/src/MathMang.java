public class MathMang<T extends Number> implements AVG {
    private T[] mang;

    public MathMang(T[] mang) {
        this.mang = mang;
    }

    @Override
    public double avg() {
        double sum = 0;
        for (T t : mang) {
            sum += t.doubleValue();
        }
        return sum / mang.length;

    }

}
