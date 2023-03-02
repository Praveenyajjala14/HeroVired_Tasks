import java.util.Scanner;
import java.util.Arrays;
public class Unique_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int [] arr1 = new int[20];
        int index=0;
        for(int i=0;i<n;i++){
            while(i<n-1 && arr[i]==arr[i+1])
            i++;
            arr1[index]=arr[i];
            index++;
        }
        for(int e:arr1){
            if(e==0){
                break;
            }
            System.out.print(e+" ");
        }
        
        sc.close();
    }
}

