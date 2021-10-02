package com.powerhouse;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Primitive data type

        byte number = 20;
        short number2 = 150;
        int number3 = 1999;
        long number4 = 123456789789L;
        float number5 = 11.5F;
        double number6 = 1111.999999999999;
        char alphabet = 'a';
        boolean bool = true;
        //Reference data type
        //Array
        int num[]= {10,11,12,13,14,15};
        char name[]={'d','c','a'};
        //length array
        int leng = name.length;
        //clone array
        char name1[]=name.clone();
        //String
        String channelname = "Millions" + "peruse";
        int ID;
        Scanner input = new Scanner(System.in);
        System.out.println("enter ID:");
        ID = input.nextInt();
        System.out.println("Entered ID is " + ID);

        String Username;
        System.out.println("Enter your name:");
        Username = input.next();
        System.out.println("Hello,"+ Username);

        //conditions
        int tesla = 150000;
        int Lamborghini = 350000;
        int cost;

        cost = input.nextInt();
        if (cost >= Lamborghini){
            System.out.println("you can afford Lamborghini or tesla");
        }
        if (cost >= tesla){
            System.out.println("you can afford tesla");
        }
        else{
            System.out.println("You cannat afford tesla and lamborghini");
        }



        System.out.println(bool);
        System.out.println(number);
        System.out.println(number3);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(name));
        System.out.println(leng);
        System.out.println(Arrays.toString(name1));
        System.out.println(channelname);

    }
}
