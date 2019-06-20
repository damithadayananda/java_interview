package algorithm;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args){
        System.out.println("Enter number:");
        Scanner scr = new Scanner(System.in);
        String number = scr.nextLine();
        int cube =0;
        for(int i=0; i<number.length();i++){
           int x = Character.getNumericValue(number.charAt(i));
           cube = cube+x*x*x;
        }
        if(Integer.parseInt(number)==cube){
            System.out.println(number+" is armstrong number");
        }else {
            System.out.println(number+" is not armstrong number");
        }
    }
}
