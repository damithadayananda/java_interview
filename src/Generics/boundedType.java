package Generics;

public class boundedType {
    public <T extends Comparable<T>> T maximum(T x,T y){
        if (x.compareTo(y)>0){
            return x;
        }
        return y;
    }
}
