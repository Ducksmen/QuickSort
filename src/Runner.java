import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        int[] intArr = {1,5,2,7,4,6,9,3};
        System.out.println(Arrays.toString(intArr));
        QuickSort.quicksort(intArr,0,intArr.length-1);
        System.out.println(Arrays.toString(intArr));
    }
}
