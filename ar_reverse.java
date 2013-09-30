/**
 * Created with IntelliJ IDEA.
 * User: ovcharenko
 * Date: 11.09.13
 * Time: 12:12
 * To change this template use File | Settings | File Templates.
 */
// разворот массива с 1 переменной

public class ar_reverse {

    static int[] arr = {1, 6, 9, 11, 12, 14, 25};

    public static void main(String [] args)
    {
        int tmp = 0;
        for (int i = 0; i < arr.length/2; i++)
        {
           tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
