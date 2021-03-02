package com.company;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> {
          int number = (int) (Math.random() * 10);
          return number;
        };
        
        List<Integer> numbers = Stream.generate(randomNumber).limit(100).map(x -> x * x * x).collect(Collectors.toList());
        numbers.stream().filter(x -> x > 100).forEach(x -> System.out.println(x));
    }
}
