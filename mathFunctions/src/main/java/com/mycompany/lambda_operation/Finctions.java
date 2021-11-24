
package com.mycompany.lambda_operation;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface Finctions {
   
    List<Double> diapason(int start, int end, Function<Double, Double> func);
         

    
}
