
package com.mycompany.stackown;

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
           
<<<<<<< HEAD
//              SimpleStack<Integer> st = new SimpleStack<>();
//        ForwardLinked fff = new  ForwardLinked();
//        fff.addFerst(1);
//          fff.addFerst(2); 
//          fff.addFerst(3);
//           fff.addFerst(4); 
//          fff.addFerst(5);
//           System.out.println("-----------");
//           
//           Iterator iter = fff.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//          System.out.println("-----------");
//         
//         System.out.println("удалено " + fff.deleteFirst()); 
//                    Iterator iterr = fff.iterator();
//     while (iterr.hasNext()) {
//          System.out.println(iterr.next());
//      }

      SimpleQueue<Integer> queue = new SimpleQueue<>();
        queue.push(1);
        int sss = queue.poll();
        System.out.println(sss);
        queue.push(2);
        int rsl = queue.poll();
        System.out.println(rsl);
=======
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
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
    }
    
    
}
