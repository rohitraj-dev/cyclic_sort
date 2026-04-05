import java.util.*;
class MissingNumber
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,0,1};
        missingNumber(arr);
        sc.close();
    }
    public static int missingNumber(int arr[])
    {
        int n = arr.length;
        int i = 0;
        while(i<arr.length)
        {
            if(arr[i] == i || arr[i] == n)
                i++;
            else
            {
                int idx = arr[i];
                swap(arr, i, idx);
            }
        }
        for(i = 0; i<arr.length; i++)
        {
            if(arr[i] != i)
                return i;
        }
        return n;
    }
    private static void swap(int[] arr, int i, int idx)
    {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}