package algorithm;

public class fibonachi {
    public static void main(String[] args){
        int i=0;
        int j=1;
        int k;
        while(i<100){
            k=i+j;
            System.out.println(k);
            i=j;
            j=k;
        }
    }
}
