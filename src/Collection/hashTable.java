package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashTable {
    public void hashTable_demo(){
        System.out.println("hash table demo");
        Hashtable balance = new Hashtable();

        balance.put("dam",new Double(53.25));
        balance.put("day",new Double(23.65));

        Enumeration names =balance.keys();
        while (names.hasMoreElements()){
            String s = (String)names.nextElement();
            System.out.println(s+":"+balance.get(s));
        }
    }
}
