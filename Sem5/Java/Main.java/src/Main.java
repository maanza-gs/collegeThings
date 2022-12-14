public class Main {

    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {23, 45, 86, 77, 9, 54, 13, 36, 61, 98};
        int x = 10;
        int result = search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in the array");
        else
            System.out.print("Element is present at index " + result);
    }
}
