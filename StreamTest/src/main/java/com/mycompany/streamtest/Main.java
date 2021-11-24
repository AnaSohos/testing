package com.mycompany.streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listyy = new ArrayList<Integer>();
        listyy.add(9);
        listyy.add(1);
        listyy.add(-3);
        listyy.add(-14);
        listyy.add(45);
        listyy.add(67);
        listyy.add(11);
        listyy.add(-40);
        listyy.add(55);
        listyy.add(10);
        listyy.add(-90);

        Predicate<Integer> positivNum = e -> e > 0;
        List<Integer> result = listyy.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
