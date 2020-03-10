package Generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class simple {
    /**
     *generic method declaration have angle bracket section
     * type parameter can be use to declare return type and
     * act as placeholder for type of parameter pass to argument
     */
    public <E> void print(E[] array){
        for(E element: array){
            System.out.println(element);
        }
    }

    /**
     * generic with return type
     */
    public <E> List<E> fromArrayToList(E[] array){
        return Arrays.asList(array);
    }

    /**
     * more generic types
     * arguments are any type array and function
     * return list of type G
     */
    public <T,G> List<G> fromArrayToListSecond(T[] a, Function<T,G>mapperFunction){
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }
}
