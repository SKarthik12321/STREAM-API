package com.streamapi;
import java.util.*;
import java.util.stream.*;

public class StreamAPIUseCases {
    public static void main(String[] args) {

        IntSummaryStatistics stats =
            Arrays.asList(2,4,6,8,10)
                  .stream()
                  .mapToInt(Integer::intValue)
                  .summaryStatistics();

        System.out.println("Sum = " + stats.getSum());
        System.out.println("Average = " + stats.getAverage());
    }
}
