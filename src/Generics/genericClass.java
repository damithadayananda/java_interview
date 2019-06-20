package Generics;

public class genericClass<T> {
    private T t;

    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}
