package algorithm;

public class reverseString {
    public static void main(String[] args){
        String myString="helloWorld";
        String reverse1 = new StringBuilder(myString).reverse().toString();

        String reverse2 = new StringBuffer(myString).reverse().toString();
        System.out.println(subString(myString));
    }
    private static String subString(String s){
        if(s.isEmpty()){
            return s;
        }
        System.out.println(s);
        return subString(s.substring(1))+s.charAt(0);
    }
}
