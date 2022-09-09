package Lesson_3;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] intArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        int[] intArray2 = {2333, 442, 5252, 333, 222, 555, 332, 334, 777, 666};

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
        System.out.println("a) Довжина масивів: 1: " + a + " 2: " + b + " 3: " + c + " 4: " + d);
        ////////////////////////////////////////А//////////////////////////////////////////////
        int[] a1 = intArray1.clone();
        System.out.println("б) " + Arrays.toString(a1));
        ////////////////////////////////////////Б/////////////////////////////////////////////////////////////
        Arrays.sort(intArray2);
        int s = Arrays.binarySearch(intArray2, 2333);
        System.out.println("в) " + s);
        ////////////////////////////////////////В/////////////////////////////////////////////////////////////////
        int[] dd = {3, 3};
        int[] ss = {3, 3};
        int[] cc = {4, 3};
        System.out.print("г) 1. " + Arrays.compare(dd, ss));
        System.out.println(" 2. " + Arrays.compare(ss, cc));
        ////////////////////////////////////////Г/////////////////////////////////////////////////////////////////
        System.out.println("д) " + Arrays.toString(Arrays.copyOf(intArray2, 4)));
        System.out.println(Arrays.toString(Arrays.copyOf(stringArray1, 3)));
        Arrays.sort(stringArray2);
        System.out.println(Arrays.toString(Arrays.copyOf(stringArray2, 5)));
        /////////////////////////////////////Д////////////////////////////////////////////////////////////////////////////
        Arrays.fill(intArray1, 2);
        System.out.println("e) " + Arrays.toString(intArray1));
        Arrays.fill(stringArray1, "UP");
        System.out.println(Arrays.toString(stringArray1));
        /////////////////////////////////////////E/////////////////////////////////////////////////////////////////////////
        int[] intArray3 = {33, 44, 11, 22};
        String[] stringArray3 = {"Iphone", "Samsung", "Huawei", "Xiaomi"};
        Arrays.sort(stringArray3);
        Arrays.sort(intArray3);
        System.out.println("є) " + Arrays.toString(intArray3));
        System.out.println(Arrays.toString(stringArray3));

    }
}

