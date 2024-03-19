/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
        for (int i=0;i<n;i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1, 7, 9 , 12, 2, 7, 9, 2, 5};
        int num = 2;
        int index = search(arr, num);

        if (index != -1){
            System.out.println("Element at index " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
// Time Complexity = O(n) - linear complexity
// Space Complexity = O(1) constant complexity