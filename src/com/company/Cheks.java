package com.company;

import java.util.Scanner;

/**
 * Created by Roman on 28.10.2018.
 */
public class Cheks {
    private Scanner in;
    private float first;
    private float second;
    private float third;

    public Cheks(float third, float second, float first) {
        this.in = new Scanner(System.in);
        this.third = third;
        this.second = second;
        this.first = first;
    }

    public float getFirst() {
        return first;
    }

    public float getSecond() {
        return second;
    }

    public float getThird() {
        return third;
    }

    public void chekRange(float x) {
        System.out.print("This number belong range [-5;5]: ");
        if ((-5 <= x) && (x <= 5)) {
            System.out.println( "true");
        } else {
            System.out.println( "false");
        }
    }


    public void minMax(float first, float second, float third) {
        if((first > second) && (first > third)) {
                System.out.println("Max: first= " + first);
                if (second > third) System.out.println("Min: third= " + third);
                else System.out.println("Min: second= " + second);
        }
        if((second > first) && (second > third)) {
            System.out.println("Max: second= " + second);
            if (first > third) System.out.println("Min: third= " + third);
            else System.out.println("Min: first= " + first);
        }
        if((third > first) && (third > second)) {
            System.out.println("Max: third= " + third);
            if (first > second) System.out.println("Min: second= " + second);
            else System.out.println("Min: first= " + first);
        }


    }
}
