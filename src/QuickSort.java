import java.util.Random;

public class QuickSort
{
    public void quickSort(int[] arr, int l, int r)
    {
        if (l<r)
        {
            int pivot = partition(arr, l, r);

            quickSort(arr, l,pivot-1);
            quickSort(arr,pivot+1, r);
        }
    }

    public int partition(int[] arr, int l, int r)
    {
        int temp = 0;
        int pivot = arr[r];
        int i = l -1;
        for(int j=l;j<=r;j++)
        {
            if(j<=pivot)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i+1;
    }

    public int[] genInts(int n)
    {
        int[] list1 = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            list1[i] = random.nextInt(10000);
        }
        return list1;
    }
}
