import java.util.Arrays;

public class ArraysDemo {
    public void arraysDemo(){
        int[] sorting = {1,5,2,7};

        System.out.println("***********sorting********************");

        Arrays.sort(sorting);
        for(int i : sorting){
            System.out.println(i);
        }

        System.out.println("**********toString********************");

        String sortingString = Arrays.toString(sorting);
        System.out.println(sortingString);
    }
}
