public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        double Bmi = service.calculate(weight);
        System.out.println(Bmi);
    }
}