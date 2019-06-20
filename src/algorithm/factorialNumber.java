package algorithm;

public class factorialNumber {
    public static void main(){
        System.out.println("factorial of 5:"+factorial(5));
    }

    private static int factorial(int n){
        if(n==0){
            return 1;
        }
       return n*factorial(n-1);
    }
}
