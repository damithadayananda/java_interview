package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class comparable_sorting_demo {
    public void sorting(){
        ArrayList<student> arrayList = new ArrayList();
        student s1 = new student();
        s1.age=10;
        arrayList.add(s1);
        student s2 = new student();
        s2.age =50;
        arrayList.add(s2);
        student s3 = new student();
        s3.age=20;
        arrayList.add(s3);

        Collections.sort(arrayList);

        for (student s:arrayList){
            System.out.println("array list item:"+s.toString());
        }
    }
}
