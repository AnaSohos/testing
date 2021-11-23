package com.mycompany.consumer;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void testCollect() {

        Address adr1 = new Address("Moscow", "Kuznechkaya", 6, 5);
        Address adr2 = new Address("Saratov", "Slobodskaya", 24, 89);
        Profile prof = new Profile(adr1);
        Profile prof2 = new Profile(adr2);
        List<Profile> listProf = new ArrayList<>();
        List<Address> listAdress = new ArrayList<Address>();
        listProf.add(prof);
        listProf.add(prof2);
        Profiles list = new Profiles();
        listAdress = list.collect(listProf);

        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Kuznechkaya", 6, 5));
        expected.add(new Address("Saratov", "Slobodskaya", 24, 89));
        assertThat(listAdress, is(expected));

    }

    public void nonElem() {
        List<Profile> listProf = new ArrayList<>();
        List<Address> listAdress = new ArrayList<Address>();
        Profiles list = new Profiles();
        listAdress = list.collect(listProf);
        List<Address> expected = new ArrayList<>();
        assertThat(listAdress, is(expected));

    }

    public void nonDuplicate() {
        Address adr1 = new Address("Moscow", "Kuznechkaya", 6, 5);
        Address adr2 = new Address("Saratov", "Slobodskaya", 24, 89);
        Address adr3 = new Address("Tombov", "Pushkina", 16, 5);
        Address adr4 = new Address("Saratov", "Slobodskaya", 24, 89);
        Profile prof = new Profile(adr1);
        Profile prof2 = new Profile(adr2);
        Profile prof3 = new Profile(adr3);
        Profile prof4 = new Profile(adr4);
        List<Profile> listProf = new ArrayList<>();
        List<Address> listAdress = new ArrayList<Address>();
        listProf.add(prof);
        listProf.add(prof2);
         listProf.add(prof3);
        listProf.add(prof4);
        Profiles list = new Profiles();
        listAdress = list.collect(listProf);

        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Kuznechkaya", 6, 5));
        expected.add(new Address("Saratov", "Slobodskaya", 24, 89));
        expected.add(new Address("Tombov", "Pushkina", 16, 5));
       assertThat(listAdress, is(expected));

    }
}
