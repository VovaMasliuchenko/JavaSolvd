import java.util.Arrays;

public class HeapSort {
    public void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
        {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i)
    {
        int largestElement = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && arr[leftChild] > arr[largestElement])
        {
            largestElement = leftChild;
        }

        if (rightChild < n && arr[rightChild] > arr[largestElement])
        {
            largestElement = rightChild;
        }

        if (largestElement != i)
        {
            int swap = arr[i];
            arr[i] = arr[largestElement];
            arr[largestElement] = swap;

            heapify(arr, n, largestElement);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        {
            System.out.println(arr[i]+ " ");
        }

        System.out.println();
    }
    //---------------------------MAIN------------------------------------
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Unsorted array is: ");
        printArray(arr);

        HeapSort heap = new HeapSort();
        heap.sort(arr);

        System.out.println("\nSorted array is: ");
        printArray(arr);
    }
    //-------------------------------------------------------------------
}

