package com.streamapi;
import java.util.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,4,6,8,9);

        boolean allEven = nums.stream().allMatch(n -> n % 2 == 0);
        boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0);

        System.out.println("All even = " + allEven);
        System.out.println("Any even = " + anyEven);
    }
}
