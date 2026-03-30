import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,1,2,3,4,6,7,0};
        
        System.out.println(cyclicSort(arr));
        sc.close();
    }
    public static int[] cyclicSort(int arr[])
    {
        int i=0;
        int n = arr.length;
        while(i<n)
        {
            if(arr[i] == i)
                i++;
            else
            {
                int idx = arr[i];
                swap(arr, i, idx);
            }
        }
        return arr;
    }
    private static void swap(int[] arr, int i, int idx)
    {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}