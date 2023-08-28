import java.util.Scanner;

class SerchInINfiniteArray{
    public static int serchinin(int arr[], int key)
    {
        int low =0;int high=1;
        while(key > arr[high])
        {
            low = high;
            high *=2;
        }
        while(low <= high)
        {
            int mid = low+high/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            if(arr[mid] > key)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array data in sorted order");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the key which you want to serch");
        int key =sc.nextInt();
        int result = serchinin(arr , key);
        System.out.println(result);

        sc.close();
        
    }
}