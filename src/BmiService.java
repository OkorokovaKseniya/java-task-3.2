public class BmiService {
    public int calculate(int height, int weight) {
        int heightInMeters = height / 100;
        int weightInKilograms = weight / 100;
        return weight / heightInMeters / heightInMeters;
    }

    {

    }
}
