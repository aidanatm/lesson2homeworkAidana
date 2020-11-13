package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(par(50,30));
        System.out.println(par(40, 20));
        System.out.println(par(15, 1));
        System.out.println(par(6, 0));
        System.out.println(par(3, -10));
        System.out.println("_________________А тут рандомно______________________");
        System.out.println(par(generateRandomAge(),16));
        System.out.println(par(generateRandomAge(),29));

    }public static boolean par(int age , int temperature) {
            String a = "Можно идти гулять";
            String b = "Оставайтесь дома";

            if ((age >= 20 && age <= 45) && temperature >= -20 && temperature <= 30) {
                System.out.println(a);
            } else if ((age < 20) && temperature >= 0 && temperature <= 20) {
                System.out.println(a);
            } else if ((age >= 45 ) && temperature >= -10 && temperature <= 25 ){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
            return true;
    }
    public static int generateRandomAge(){
        int min = 10;
        int max = 100;
        int pt = max-min;
        Random random = new Random();
         return random.nextInt(pt + 1) + min;



    }









    }




