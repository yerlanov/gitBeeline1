/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaveon;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Райымбек
 */
public class JavaVeon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        for (int i = 0; i < size; i++) {
            int j = i;
            System.out.print("Enter the " + ++j + " element of the first array: ");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int j = i;
            System.out.print("Enter the " + ++j + " element of the second array: ");
            arr2[i] = input.nextInt();
        }
        int[] sumOfArray = JavaVeon.sumOfArray(arr1, arr2);
        if (sumOfArray == null) {
            System.out.println("Both array are not same");
        } else {
            System.out.print("Sum is: ");
            Arrays.sort(sumOfArray);
            for (int i = 0; i < sumOfArray.length; i++) {
                System.out.print(sumOfArray[i] + "");
            }
        }
    }

    public static int[] sumOfArray(int[] number1, int[] number2) {
        int[] sum = new int[number1.length];
        for (int i = 0; i < number1.length; i++) {
            sum[i] = number1[i] + number2[i];
        }
        return sum;
    }

}
