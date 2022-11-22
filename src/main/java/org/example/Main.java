package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static  int smallestNonOccuringInteger(int[] arr){
        int length = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        for (int k = 1; k <= length + 1; k++) {
            if (!set.contains(k)) {
                return k;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,6,4,1,2};
        int[] arr2 = {5,-1,-3};

        System.out.println(smallestNonOccuringInteger(arr1));
        System.out.println(smallestNonOccuringInteger(arr2));
    }
}