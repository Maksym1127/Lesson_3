package lesson3;

public class Exercise2 {
    public static void main(String[] args) {
        int[] intArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        int[] intArray2 = {
                2333, 442, 5252, 333, 222, 555, 33,
                334, 777, 666
        };

        String[] stringArray1 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C",
                "C++"
        };
        String[] stringArray2 = {"abc",
                "bc", "ac", "aac",
                "agc", "asc", "adc",};
        int a = intArray1.length;
        int b = intArray2.length;
        int c = stringArray1.length;
        int d = stringArray2.length;
        System.out.println("Довжина масивів: 1: " + a + " 2: " + b + " 3: " + c + " 4: " + d);

    }
}

