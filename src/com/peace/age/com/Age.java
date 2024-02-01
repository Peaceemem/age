package com.peace.age.com;

import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        //request age
        System.out.println("Enter the correct age: ");
        age = input.nextInt();
        // call the method
        String AgeGroup = myAgeGroup(age);
        System.out.println("the age is " + AgeGroup);
    }

    //create another method
    public static String myAgeGroup(int age) {
        //perform the following operation
        if (age >= 0 && age <= 3) {
            return "infant";
        } else if (age >= 3 && age <= 12) {
            return "child";
        } else if (age >= 13 && age <= 17) {
            return "Teen";
        } else if (age >= 18 && age <= 64) {
            return "Adult";
        } else {
            return "invalid number";
        }
    }
}
