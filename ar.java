/**
 * Created with IntelliJ IDEA.
 * User: ovcharenko
 * Date: 05.09.13
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
public class ar {

    static int[] x = {2, 5, 7, 8, 9, 10};
    static int[] y = {3, 4, 9, 13, 14, 15};
    static int[] z = {1, 6, 9, 11, 12, 14, 25};


    public static void main(String[] args) {

        System.out.println(equal3(0, 0, 0));
    }

    static int equal3(int p, int q, int r) {

        int result = 0;
        if ((x[p] == y[q]) && (y[q] == z[r]))
            return x[p];
        else {

            if ((x[p] < y[q]) && (x[p] < z[r]))
                result = equal3(p + 1, q, r);

            if ((y[q] < x[p]) && (y[q] < z[r]))
                result = equal3(p, q + 1, r);

            if ((z[r] < x[p]) && (z[r] < y[q]))
                result = equal3(p, q, r + 1);
        }
        return result;
    }
}
