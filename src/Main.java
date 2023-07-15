public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Weightkg = 120;
        double Heightm = 1.96;
        int bmi = service.calculate(Weightkg, Heightm);

        System.out.println(bmi);
    }
}