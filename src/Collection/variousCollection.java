package Collection;

import java.util.*;

public class variousCollection {
    public void variousCollection_demo(){
        List a1 = new ArrayList<>();
        a1.add("dam");

        List l1 = new LinkedList();
        l1.add("daya");

        Set s1 = new HashSet<>();
        s1.add("itha");

        Map m1 = new HashMap();
        m1.put("name","nand");
    }
    public void listDemo(){
        List<Integer> list = new ArrayList<>();

        System.out.println("************adding element**********");
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);

        System.out.println("get the element by index 1:"+list.get(1));

        System.out.println("************updating element********");

        list.set(2,53);

        System.out.println("update value:"+list.get(1));

        System.out.println("********iterating over list*********");
        for(Integer element:list){
            System.out.println("value is:"+element);
        }

        System.out.println("*********iterate using iterator*****");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("value is:"+iterator.next());

        }

        System.out.println("*******reversing list**************");
        List<Integer> reverselist=list;
        Collections.reverse(list);
        reverselist.forEach((x)->System.out.println(x));

        System.out.println("*******sorting list****************");
        List<Integer> sortedList =list;
        Collections.sort(sortedList);
        sortedList.forEach((x)->System.out.println(x));

        System.out.println("*******converting list to array****");
        Object[] obArray = list.toArray();
        Integer[] array = list.toArray(new Integer[list.size()]);


    }
}
