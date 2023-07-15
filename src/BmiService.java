public class BmiService {
    public int calculate(double Weightkg, double Heightm) {
        double result = Weightkg / (Heightm * Heightm);
        return (int) result;
    }
}
