public class BinarySearch {
    /**
     * @param arr
     * @param first
     * @param last
     * @param key
     * @return
     */
    public static int binarysearch(int arr[], int first, int last, int key)
    {
        if(last >= first)
        {
            int mid = (first + last) / 2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] > key)
                return binarysearch(arr, first, mid - 1, key);
            else
                return binarysearch(arr, mid + 1, last, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int last = arr.length - 1;
        int result = binarysearch(arr, 0, last, key);
        if(result == -1)
            System.out.println("Element Is Not Found!");
        else
            System.out.println("Element Is Found At Index : " + result);
    }
}
