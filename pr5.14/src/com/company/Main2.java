package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        String a1,a2,a3,a4,a5;

        System.out.print("1 слово : " );
        a1 = a.nextLine();
        String b1 = a1.substring(0,1);

        System.out.print("2 слово : ");
        a2 = a.nextLine();
        String b2 = a2.substring(0,1);

        System.out.print("3 слово : ");
        a3 = a.nextLine();
        String b3 = a3.substring(0,1);

        System.out.print("4 слово : ");
        a4 = a.nextLine();
        String b4 = a4.substring(0,1);

        System.out.print("5 слово : ");
        a5 = a.nextLine();
        String b5 = a5.substring(0,1);

        System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5);









    }
}
