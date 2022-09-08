package lesson3;

import java.util.Scanner;

public class exercises1 {
    public static void main(String[] args) {
/////////////////////////FIRST//////////////////////////////////////////////////////////

        int num1 = 6;
        if (num1 > 0) {
            System.out.println("Number VALUE is positive");
        }
        if (num1 < 0) {
            System.out.println("Number VALUE is negative");
        }
        if (num1 == 0) {
            System.out.println("Number VALUE is equals zero");
        }
///////////////////////////////SECOND/////////////////////////////////////////////////////////

        int num2 = -3;
        if (num2 > 0) {
            System.out.println("Number VALUE is positive");
        }
        if (num2 < 0) {
            System.out.println("Number VALUE is negative");
        }
        if (num2 == 0) {
            System.out.println("Number VALUE is equals zero");
        }
////////////////////////////////////THIRD////////////////////////////////////////////////////

        int num3 = 0;
        if (num3 > 0) {
            System.out.println("Number VALUE is positive");
        }
        if (num3 < 0) {
            System.out.println("Number VALUE is negative");
        }
        if (num3 == 0) {
            System.out.println("Number VALUE is equals zero");
        }
///////////////////////////////////4//////////////////////////////////////////////////////////////////

        int year = 2005;
        int i = year;
        if (i % 4 == 0) {
            System.out.println("Цей рік є високосним!!");
        }
        while ((i % 4) != 0) {
            i++;

            if ((i % 4) == 0) {
                System.out.println("До Високосного року лишилось(вся) " + (i - year) + " рік/роки");
            }
        }
/////////////////////////////////////5//////////////////////////////////////////////////////////////////////
        int max;
        int a1 = 3;
        int b1 = 7;
        int c1 = 2;
        if (b1 <= a1 && c1 <= a1) {
            max = a1;
            System.out.println("Max: " + a1);
        } else if (a1 <= b1 && c1 <= b1) {
            max = b1;
            System.out.println("Max: " + b1);
        } else if (a1 <= c1 && b1 <= c1) {
            max = c1;
            System.out.println("Max: " + c1);
        }
///////////////////////////////////////6/////////////////////////////////////////////////////////////////////////////
        int min;
        int n1 = 5;
        int n2 = 2;
        int n3 = 8;
        if (n1 <= n2 && n1 <= n3) {
            min = n1;
        } else if (n2 <= n3 && n2 <= n1) {
            min = n2;
        } else {
            min = n3;
        }
        System.out.println("Min: " + min);


    }

}

