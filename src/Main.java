public class Main {
    public static void main(String[] args) {

        BmiService service= new BmiService ();
        int myBmi = service.bmi(98, 1.87);
        System.out.println("Ваш индекс массы составляет: " + myBmi);
    }
}