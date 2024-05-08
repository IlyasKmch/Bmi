
public class Main {

    public static void main(String[] args) {
        bmiService service = new bmiService();
        double weight = 98;
        double height = 1.87;
        double bmi = service.calculate(weight, height);


        System.out.println("Ваш индекс массы составлият: " + (int) bmi);

    }
}