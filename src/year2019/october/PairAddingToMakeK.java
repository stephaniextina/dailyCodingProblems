package year2019.october;
//
//You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.
//
//        Example:
//        Given [4, 7, 1 , -3, 2] and k = 5,
//        return true since 4 + 1 = 5.
//
//        def two_sum(list, k):
//        # Fill this in.
//
//        print two_sum([4,7,1,-3,2], 5)
//        # True
//
//        Try to do it in a single pass of the list.

import java.util.HashSet;

public class PairAddingToMakeK {

    public static void answer(int[] array, int k){
        boolean flag=false;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i< array.length;i++){
            if(hashSet.contains(k-array[i]))flag=true;
            hashSet.add(array[i]);
        }
        if(flag) System.out.println("YES PRESENT");
        else System.out.println("NOT PRESENT");
    }

    public static boolean twoSum(int[] array, int k){
        if (array.length < 2){
            return false;
        }
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j ++){
                    int number1 = array[i];
                    int number2 = array[j];
                    if (number1 + number2 == k){
                        return true;
                    }
                }
                
            }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {4, 7, 1 , -3, 2};
        int k = 5;

        int[] array2 = {1, 2, 3 , 4, 5};
        int k2 = 10;

        int[] array3 = {-5, 9, 3 , 15, 25};
        int k3 = 10;

        System.out.println(twoSum(array, k));
        System.out.println(twoSum(array2, k2));
        System.out.println(twoSum(array3, k2));

    }

}
