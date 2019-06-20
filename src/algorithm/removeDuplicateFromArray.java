package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateFromArray {
    public static void main(String[] args){
        String[] arrayForRemoveDuplicate =new String[]{"sd","ss"};
        removeDuplicate(arrayForRemoveDuplicate);
//        String[] withDuplicate = {"AA","AB","BA","AA"};
//
//
//        Set<String> myset =new HashSet<>();
//
//        Collections.addAll(myset,withDuplicate);
//
//        String[]  withOutDuplicate=myset.toArray(new String[0]);
//
//        for(String s : withOutDuplicate){
//            System.out.println(s instanceof String);
//            System.out.println(s);
//        }
    }
    public static  <E> E[]removeDuplicate(E[] array){
        E[] withoutDuplicate = (E[])new Object[array.length];
        int indexWithoutDuplicate=0;
        for(E element:array){
            boolean dupicateFound = false;
            for(E e:withoutDuplicate){
                if(e.equals(element)){
                    dupicateFound=true;
                    break;
                }
            }
            if(!dupicateFound){
               withoutDuplicate[indexWithoutDuplicate]=element;
               indexWithoutDuplicate++;
            }
        }
        return withoutDuplicate;
    }
}
