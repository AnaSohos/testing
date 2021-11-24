package com.mycompany.lambda_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class RefMethod {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr",
                "Aleftina",
                "Konstantin"
        );
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
   

    }

    public static void cutOut(String value) {
        if (value.length() > 7) {
            System.out.println(value.substring(0, 7) + "..");
        } else {
            System.out.println(value);
        }
    }

    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> collecionNum = new ArrayList<>();
       

        for (;start < end; start++) {
            collecionNum.add(func.apply((double)start));
        }
        return collecionNum;
    }

}
