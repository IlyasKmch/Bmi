public class BmiService {

    public int bmi(int weightInKg, double heightInM){
        return (int) (weightInKg / (heightInM * heightInM));
    }
}
