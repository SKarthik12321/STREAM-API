package com.streamapi;
import java.util.*;
import java.util.stream.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {

        System.out.println(
            Arrays.asList(9,3,7,1,5)
                  .stream()
                  .sorted()
                  .collect(Collectors.toList())
        );
    }
}
