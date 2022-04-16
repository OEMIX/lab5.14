package com.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 , str2;
        System.out.print("Введіть перше слово: ");
        str1 = sc.nextLine();
        System.out.print("Введіть друге слово: ");
        str2 = sc.nextLine();
        if (true==str1.equalsIgnoreCase(str2)) {
            System.out.print("Слова ідентичні");
        }else {
            System.out.print("Слова не ідентичні");
        }



    }
}




