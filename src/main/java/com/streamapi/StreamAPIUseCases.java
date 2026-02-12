package com.streamapi;
import java.util.*;
import java.util.stream.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {

        System.out.println(
            Arrays.asList(1,2,3,4,5)
                  .stream()
                  .map(n -> n * 2)
                  .collect(Collectors.toList())
        );
    }
}
