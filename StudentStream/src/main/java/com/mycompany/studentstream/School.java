package com.mycompany.studentstream;

import static java.util.Collections.list;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {

        List<Student> newList = students.stream()
                .filter(predict).collect(Collectors.toList());
        return newList;
    }

}
