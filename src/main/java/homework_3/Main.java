package homework_3;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        double b = 2.2f;
        Calculation calc = new Calculation();
        System.out.printf("%.2f\n",calc.sum(a, b));
        System.out.printf("%.2f\n", calc.multiply(a, b));
        System.out.printf("%.2f\n", calc.divide(a, b));
        System.out.printf("%.2f\n", calc.subtract(a, b));

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        //Double[] arr2 = {1.0, 2.0, 3.0};
        ArrCompare array = new ArrCompare();
        System.out.println(array.compareArrays(arr1, arr2));

        Pair <Integer, Double> pair = new Pair<>(1, 5.0);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);


    }
}
