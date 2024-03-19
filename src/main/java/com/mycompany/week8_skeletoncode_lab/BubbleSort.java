/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]){
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    public  static void main (String[] args){
        int[] arr = {33, 22, 90, 11, 55, 66};
        int n = arr.length;
        bubbleSort(arr, n);

        System.out.println("The Sorted Array is: ");

        for (int i=0;i<n;i++){
            System.out.println(arr[i] + "");
        }
    }
}
// Time Complexity = O(n^2)
// Space Complexity = O(1)