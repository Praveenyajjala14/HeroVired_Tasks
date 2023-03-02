import java.util.Scanner;
public class CumulativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int arr1[]=new int[20];
        int sum=0;
        for(int i:arr){
            sum=sum+i;
            System.out.print(sum+" ");
        }
        sc.close();
    }
}