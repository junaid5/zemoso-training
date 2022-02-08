package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WorkWithStreams {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        int result = (int) names.stream().count();
               /* collect(Collectors.toList());*/
        System.out.println(result);
    }

}
