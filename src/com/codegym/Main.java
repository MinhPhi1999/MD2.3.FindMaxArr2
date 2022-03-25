package com.codegym;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 99, 10}, {11, 19, 22, 3}};
        System.out.println("max là: "+ findMax(arr));
    }

    static int findMax(int arr[][]) {
        int max= arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}