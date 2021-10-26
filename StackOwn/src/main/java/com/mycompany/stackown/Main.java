
package com.mycompany.stackown;

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
           
              SimpleStack<Integer> st = new SimpleStack<>();
        ForwardLinked fff = new  ForwardLinked();
        fff.addFerst(1);
          fff.addFerst(2); 
          fff.addFerst(3);
           fff.addFerst(4); 
          fff.addFerst(5);
           System.out.println("-----------");
           
           Iterator iter = fff.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
          System.out.println("-----------");
         
         System.out.println("удалено " + fff.deleteFirst()); 
                    Iterator iterr = fff.iterator();
     while (iterr.hasNext()) {
          System.out.println(iterr.next());
      }
    }
    
    
}
