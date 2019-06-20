package algorithm;

public class bubbleSort {
    public static void main(String[] args){
        int[] myArray=new int[]{1,5,8,3,10};

        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray.length-i-1;j++){
                if(myArray[j]>myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j]=myArray[j+1];
                    myArray[j+1]=temp;
                }
            }
        }
    }
}
