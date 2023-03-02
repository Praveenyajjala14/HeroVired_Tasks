/*
 Description: Consider an array with N number of consecutive integers, in which few numbers are missing.
 Find and list down these missing numbers using Java.

 Sample input : arrNum = {1, 2, 4, 5, 6}

 Output : 3
 */

import java.util.Scanner;
import java.util.Arrays;
public class Missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]>1){
                for (int j = arr[i] + 1; j < arr[i + 1]; j++)
                System.out.print(j+" ");
            }
        }
        sc.close();
    }
}
