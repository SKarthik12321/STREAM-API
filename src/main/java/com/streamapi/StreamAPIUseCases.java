package com.streamapi;
import java.util.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {

        Optional<Integer> firstEven =
            Arrays.asList(1,3,5,6,7,8)
                  .stream()
                  .filter(n -> n % 2 == 0)
                  .findFirst();

        System.out.println(firstEven.orElse(-1));
    }
}
