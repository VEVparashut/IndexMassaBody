public class BmiService {

    public int calculate(int m, int h) {
        int result;
        result = m / ((h * h) / 10000);
        return result;
    }
}
