package algorithm;

public class integerPalindrome {
    public static  void main(String[] args){
        int x=12321;
        String y = Integer.toString(x);
        String reverse = "";
        for(int i =y.length()-1;i>=0;i--){
            reverse=reverse+y.charAt(i);
        }
        if(reverse.equals(y)){
            System.out.println("integer palindrome");
        }
    }
}
