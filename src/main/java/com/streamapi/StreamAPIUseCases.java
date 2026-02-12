package com.streamapi;
import java.util.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5)
              .stream()
              .forEach(System.out::println);
    }
}
