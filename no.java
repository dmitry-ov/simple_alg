/**
 * Created with IntelliJ IDEA.
 * User: ovcharenko
 * Date: 09.09.13
 * Time: 10:48
 * To change this template use File | Settings | File Templates.
 */
public class no {
    public static int method1(int a, int n) {
        if (n > 0)
            return a * method1(a, n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        int result = method1(2, 3);
        System.out.println(result);
    }
}
