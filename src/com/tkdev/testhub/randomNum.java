package com.tkdev.testhub;

import java.util.Random;

class randomNum {
    static int upperbound = 31;
    public static void main( String args[] ) {
        Random rand = new Random(); //instance of random class
        int upperbound = 31;
        //generate random values from 0-31
        int int_random = rand.nextInt(upperbound);
        double double_random=rand.nextDouble();
        float float_random=rand.nextFloat();

        System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
        System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
        System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
    }
    public static int getNum(){
        Random rand = new Random(); //instance of random class
        //generate random values from 0-31
        int int_random = rand.nextInt(upperbound);
        double double_random=rand.nextDouble();
        float float_random=rand.nextFloat();

        return int_random;

    }


}