package com.streamapi;
import java.util.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5,2,9,1,7);

        int min = nums.stream().min(Integer::compare).get();
        int max = nums.stream().max(Integer::compare).get();

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
