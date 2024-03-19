/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
        long sum = 0;
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                sum = sum + i;
            }
        }
        returm sum;
    }

    private static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i=2;i*i<=num;i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
// Time Complexity = O(n*sqrt(n))
// Space Complexity = O(1)