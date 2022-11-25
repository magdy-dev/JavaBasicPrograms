package org.magdy;

public class Factorial {

    int fa = 1;

    public void fact(int number) {
        for (int i = 1; i <= number; i++) {
            fa = fa * number;

        }
        System.out.println("factorial of: " + number + " is : " + fa);
    }

}


