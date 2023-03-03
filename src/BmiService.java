public class BmiService {
    public double calculate(int mass) {
        double height = 1.77;
        double squareHeight = height * height;
        double result = mass / squareHeight;
        return result;
    }

}