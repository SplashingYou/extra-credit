/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra_credit;

/**
 *
 * @author Richard Williams IV
 */
public class Extra_Credit {
    public static double findRatio(int[] arr) {
    int largest1 = Integer.MIN_VALUE; 
    int largest2 = Integer.MIN_VALUE; 
    int smallest1 = Integer.MAX_VALUE; 
    int smallest2 = Integer.MAX_VALUE; 
    
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest1) {
            largest2 = largest1;
            largest1 = arr[i];
        } else if (arr[i] > largest2) {
            largest2 = arr[i];
        }
        
        if (arr[i] < smallest1) {
            smallest2 = smallest1;
            smallest1 = arr[i];
        } else if (arr[i] < smallest2) {
            smallest2 = arr[i];
        }
    }
    double result = (double)(largest1 + largest2) / (double)(smallest1 + smallest2);
   
    return result;
}

    public static void main(String[] args) {
        int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        System.out.println(findRatio(a));
    }
}
