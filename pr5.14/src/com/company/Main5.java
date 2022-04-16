package com.company;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.print("Введіть перше слово: ");
        str1 = sc.nextLine();
        System.out.print("Введіть друге слово: ");
        str2 = sc.nextLine();
        int starLength = str1.length();
        int star2Length = str2.length();
        if (starLength==star2Length){
            System.out.print("В першрму і другому однакова кількисть символів");
        }  else if (starLength > star2Length){
            System.out.print("В першому слові більше символів  ");
        }else {
            System.out.print("В друому слові більше символів  ");
        }





    }
}
