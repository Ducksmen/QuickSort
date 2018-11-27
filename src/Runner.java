import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        QuickSort list1 = new QuickSort();
        int[] intArr = list1.genInts(10);
        System.out.println(Arrays.toString(intArr));
        list1.quickSort(intArr,0,9);
        System.out.println(Arrays.toString(intArr));
    }
}
