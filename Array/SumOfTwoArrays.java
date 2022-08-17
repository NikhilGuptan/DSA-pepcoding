import java.io.*;
import java.util.*;

public class SumOfTwoArrays{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for(int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }

        int[] sum = new int[n > n1? n:n1];
        int c = 0;

        int i = n-1;
        int j = n1-1;
        int k = sum.length-1;

        while(k>=0){
            int d = c;
            if(i>=0){
                d += arr[i];
            }
            if(j>=0){
                d += arr1[j];
            }
            c = d/10;
            d = d%10;
            sum[k] = d;
            i--;
            k--;
            j--;
        }
        if(c!=0){
            System.out.println(c);
        }
        for(int val:sum){
            System.out.println(val);
        }
        
 }

}