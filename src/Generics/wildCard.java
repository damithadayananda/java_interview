package Generics;

import java.util.List;

public class wildCard {
    /**
     *upper bound example
     * accept all child classes of number
     * any class extend Number
     */
    public void upperBound(List<? extends Number> number){

    }
    /**
     * accept all supper class of Number
     * Any super class of Number
     */
    public void lowerBound(List<? super Number> number){

    }
}
