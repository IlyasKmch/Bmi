public class BmiService {

    public int calculate(int weightInKg, double heightInM) {
        return (int) (weightInKg / (heightInM * heightInM));
    }

}
