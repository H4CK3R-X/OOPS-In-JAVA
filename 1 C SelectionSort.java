public class SelectionSort
{
    public static void selectionsort(int[]arr)
    {
        int n = arr.length;
        for(int i = 0; i < n-1; i++)
        {
            int min = i;
            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[min]);
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args)
    {
        int[]arr = {15, 21, 6, 3, 19, 20};
        System.out.println("\nElements In The Array Before Sorting");
        for(int i:arr)
            System.out.print(i+" ");
        selectionsort(arr);
        System.out.println("\nElements In The Array After Sorting");
        for(int i:arr)
            System.out.print(i+" ");
    }
}
