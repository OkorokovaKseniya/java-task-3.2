public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int heightInMeters = 180;
        int weightInKilograms = 70;
        int BmiService = service.calculate(heightInMeters,weightInKilograms);
        System.out.println(BmiService);
    }
}