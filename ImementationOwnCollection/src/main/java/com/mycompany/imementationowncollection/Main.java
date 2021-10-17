package com.mycompany.imementationowncollection;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        SimpleArrayList sss = new SimpleArrayList(6);
//        sss.add(1);
//        sss.add(2);
//        sss.add(3);
//        sss.add(23);
//        sss.add(67);
//        sss.add(21);
//        sss.add(23);
//        sss.add(67);
//        sss.add(21);
//
//Iterator iter = sss.iterator();
//
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }


//   System.out.println("проверка методов");
//        System.out.println(sss.set(1, 8));
//        System.out.println("РАЗМЕР:  " + sss.size());
//        System.out.println(sss.remove(4));
//        System.out.println("НОВЫЙ РАЗМЕР:  " + sss.size());
//        System.out.println(sss.get(4));
        
        
        SimpleSet set = new SimpleSet(8);
        set.add(21);
        set.add(23);
        set.add(67);
        set.add(67);
        set.add(22);
        set.add(63);
        set.add(21);
          System.out.println("итератор");
           
        System.out.println("---------------------------------");
   
    
        System.out.println("---------------------------------");
        System.out.println("размер сэт " + set.getSet().size());
        
              System.out.println(set.add(1));
         System.out.println(set.contains(1));
         System.out.println( "lдобавить повторно " + set.add(1));

        Iterator iterSet2 = set.iterator();
        while (iterSet2.hasNext()) {
            System.out.println(iterSet2.next());
        }
        System.out.println("---------------------------------");
        
 System.out.println(set.add(null));
         System.out.println(set.contains(null));
        System.out.println(set.add(null));
    
     

    }

}
