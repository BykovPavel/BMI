public class BmiService {
    public double calculate(int mass, double lenght) {
        double squareLenght = lenght * lenght;
        double result = mass / squareLenght;
        return result;
    }

}