package oops;

import java.util.Scanner;

public class firstaccurenceinsortedarray {
    public static int serchinarray(int array[], int n,int k)
    {
        int reuslt =-1;
        int low = 0;
        int high = n;
        while(low <= high)
        {
            int mid = low+high/2;
            if(array[mid] == k)
            {
                reuslt =mid;
                high = mid-1;
            }
            else if(array [mid] > k)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return reuslt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter the array elemet ");
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the key which you want to serch");
        int k =sc.nextInt();
        int reuslt = serchinarray(array ,n, k);
        System.out.println(reuslt);
    }
}
