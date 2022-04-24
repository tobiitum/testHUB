package com.tkdev.testhub;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class

public class passGen {
    static List<String> alphabetArray = new ArrayList<String>();
        public static void main(String[] args){

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter password length");
            int length = myObj.nextInt();  // Read user input
            System.out.println("Length is: " + length);  // Output user input
            String pass = "";
            int counter = 0;
            while (counter < length) {
                counter = counter + 1;
                int pos = randomNum.getNum();
                //String currentChar = alphabetArray(pos);
                //pass = pass + currentChar;
            }
            counter = 0;
            System.out.println(pass);
        }

        public static String getPass(int length){

            String pass = "";
            int counter = 0;
            while (counter < length) {
                counter = counter + 1;
                int pos = randomNum.getNum();
                String currentChar = alphabetArray.get(randomNum.getNum());
                pass = pass + currentChar;
            }
            return pass;
        }
    }


