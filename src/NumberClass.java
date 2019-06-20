/**
 * Integer,Long,Byte,Double,Float,Short are subclasses of Number class
 */
public class NumberClass {
    public void  Integer_Demo(){
        Integer i = 5;
        System.out.println(i.byteValue());

        int j =6;
        Integer ji = (Integer)j;
        System.out.println(ji.compareTo(8));

        int k = Integer.parseInt("5");
        System.out.println(k);
    }
}
