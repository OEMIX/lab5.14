package com.company;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){

        double a,b,c,max;
        Scanner dou = new Scanner(System.in);
        System.out.print("Введіть 1 дробове число: ");
        a = dou.nextDouble();
        while (a%1 == 0){
            System.out.println("Ви вели не дробове число");
            a = dou.nextDouble();
        }

        System.out.print("Введіть 2 дробове число: ");
        b = dou.nextDouble();
        while (b%1 == 0){
            System.out.println("Ви вели не дробове число");
            b = dou.nextDouble();
        }

        System.out.print("Введіть 3 дробове число: ");
        c = dou.nextDouble();
        while (c%1 == 0){
            System.out.println("Ви вели не дробове число");
            c = dou.nextDouble();
        }

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Максимальне дробового числа :"+max);
    }
}
