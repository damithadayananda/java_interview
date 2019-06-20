package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector {
    public void vector_demo(){
        Vector vector = new Vector(3,4);
        vector.add(4);
        vector.add(5);
        vector.add(6);

        System.out.println("vector capacity:"+vector.capacity());

        vector.add(7);
        vector.add(8);

        System.out.println("vector capacity:"+vector.capacity());

        System.out.println("*******iterate through vector*****");
        Enumeration venum = vector.elements();
        while (venum.hasMoreElements()){
            System.out.println("next element:"+venum.nextElement());
        }
    }
}
