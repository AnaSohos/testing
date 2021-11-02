package com.mycompany.ownmap;

import java.util.Iterator;
import static org.hamcrest.CoreMatchers.nullValue;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleMapTest {

    public SimpleMapTest() {

    }

    @Before
    public void initData() {
        SimpleMap<Integer, String> map = new SimpleMap<>();

    }

    @Test
    public void testPut() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        map.put(2, "два");
        Iterator<Integer> it = map.iterator();
        assertThat(it.hasNext(), Is.is(true));
        assertThat(it.hasNext(), Is.is(true));
    }

    @Test
    public void whenAddIterNextOneNextTwo() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        map.put(2, "два");
        Iterator<Integer> it = map.iterator();
        assertThat(it.next(), Is.is(1));
        assertThat(it.next(), Is.is(2));

    }

    @Test
    public void testGet() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        assertThat(map.get(1), Is.is("один"));
        assertThat(map.get(3), Is.is("три"));

    }

    public void whenGetFromOutOfBoundThenExceptionThrown() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        map.put(2, "два");
        assertThat(map.get(11), nullValue());
    }

    @Test
    public void testRemove() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.remove(2);
        map.remove(3);
        Iterator<Integer> it = map.iterator();
        assertThat(it.next(), Is.is(1));
        assertThat(it.next(), Is.is(4));
    }

    @Test
    public void testRemove2() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.remove(1);
        map.remove(3);
        Iterator<Integer> it = map.iterator();
        assertThat(it.next(), Is.is(2));
        assertThat(it.next(), Is.is(4));
        map.put(3, "три");
        Iterator<Integer> it2 = map.iterator();
        assertThat(it2.hasNext(), Is.is(true));
        assertThat(it2.next(), Is.is(2));
        assertThat(it2.hasNext(), Is.is(true));
        assertThat(it2.next(), Is.is(3));
        assertThat(it2.hasNext(), Is.is(true));
        assertThat(it2.next(), Is.is(4));
        assertThat(it2.hasNext(), Is.is(false));

    }

    @Test
    public void testIterator() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        map.put(2, "два");
        Iterator<Integer> first = map.iterator();
        assertThat(first.hasNext(), Is.is(true));
        assertThat(first.next(), Is.is(1));
        assertThat(first.hasNext(), Is.is(true));
        assertThat(first.next(), Is.is(2));
        assertThat(first.hasNext(), Is.is(false));

        Iterator<Integer> second = map.iterator();
        assertThat(second.hasNext(), Is.is(true));
        assertThat(second.next(), Is.is(1));
        assertThat(second.hasNext(), Is.is(true));
        assertThat(second.next(), Is.is(2));
        assertThat(second.hasNext(), Is.is(false));
    }

    @Test
    public void whenAddIterMultiHasNextTrue() {
        SimpleMap<Integer, String> map = new SimpleMap<>();
        map.put(1, "один");
        Iterator<Integer> it = map.iterator();
        assertThat(it.hasNext(), Is.is(true));
        assertThat(it.hasNext(), Is.is(true));
    }

}
