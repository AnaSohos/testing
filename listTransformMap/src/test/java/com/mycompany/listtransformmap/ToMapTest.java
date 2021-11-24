package com.mycompany.listtransformmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ToMapTest {

    @Test
    public void testCollect() {

        List<Student> studentsList = List.of(
                new Student(10, "Vasa"),
                new Student(40, "Vitya"),
                new Student(50, "Stepan"),
                new Student(70, "Gena"),
                new Student(90, "Stas")
        );

        Map<String, Student> map = ToMapTest.ValueMap(studentsList);

        assertThat(map.keySet(), is(ToMap.collect(studentsList).keySet()));

    }

    @Test
    public void testDuplicate() {

        List<Student> studentsList = List.of(
                new Student(10, "Vasa"),
                new Student(20, "Stepa"),
                new Student(10, "Vasa")
        );

        int size = ToMapTest.ValueMap(studentsList).size();

        assertNotEquals("Duplicate key in collection ", 3, size);

    }

    public static Map<String, Student> ValueMap(List<Student> students) {

        Map<String, Student> map = new HashMap<>();
        for (Student cheack : students) {
            map.put(cheack.getSurname(), cheack);
        }
        return map;

    }

}
