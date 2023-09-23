package work03;

public class MyUtil {
    public static void calculateBMI(double weight, double height) {
        double resultBMI = weight/(height*height);
        System.out.println(resultBMI);
    }

    public static void average(int v1, int v2, int v3) {
        double resultAverage = (double)(v1 + v2 + v3) / 3;
        System.out.println(resultAverage);
    }

}
