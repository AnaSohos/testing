
package com.mycompany.listtransformmap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ToMap {
    
    
 
     public static Map <String, Student> collect(List<Student> student){
    
        Map <String, Student> newMap = student.stream()
          .collect(Collectors.toMap(Student::getSurname, Function.identity()));
           
     return newMap;
    }
}

    

