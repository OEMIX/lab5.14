package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String a1,a2,a3,a4,a5;

        System.out.print("1 слово : " );
        a1 = a.nextLine();

        System.out.print("2 слово : ");
        a2 = a.nextLine();

        System.out.print("3 слово : ");
        a3 = a.nextLine();

        System.out.print("4 слово : ");
        a4 = a.nextLine();

        System.out.print("5 слово : ");
        a5 = a.nextLine();

        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);




    }
}
