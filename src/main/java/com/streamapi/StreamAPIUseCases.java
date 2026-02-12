package com.streamapi;
import java.util.*;
import java.util.stream.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {

        List<Integer> result =
            Arrays.asList(2,4,6,8)
                  .stream()
                  .collect(Collectors.toList());

        System.out.println(result);
    }
}
