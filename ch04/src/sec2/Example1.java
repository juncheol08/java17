package sec2;

import java.util.Arrays;

//230712  java.util.Arrays / toString()
public class Example1 {
    public static void main(String[] args) {

        int[] intArr = new int[3];
        double[] doubleArr = new double[3] ;
        boolean[] boolArr = new boolean[3];
        String[] strArr = new String[3];


        System.out.println("intArr="+intArr);
        for(int b:intArr) {
            System.out.println(b);
        }

        System.out.println("---------------------------------");
        System.out.println("intArr : "+Arrays.toString(intArr));
        System.out.println("doubleArr : "+Arrays.toString(doubleArr));
        System.out.println("boolArr : "+Arrays.toString(boolArr));
        System.out.println("strArr : "+Arrays.toString(strArr));


    }
}
