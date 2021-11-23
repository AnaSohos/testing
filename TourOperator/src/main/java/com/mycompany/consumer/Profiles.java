
package com.mycompany.consumer;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Profiles {
    
    
    public List<Address> collect(List<Profile> profiles){
     List<Address> newList = profiles.stream() 
       .map(profile -> profile.getAddress()) 
            .distinct()
            .sorted(Comparator.comparing(Address::getCity))
			.collect(Collectors.toList());
           
     return newList;
    }
}
