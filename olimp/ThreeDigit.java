package olimp;

/**
 * Created with IntelliJ IDEA.
 * User: ovcharenko
 * Date: 16.09.13
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
public class ThreeDigit
{
    public static void main(String[] args)
    {
        float max = 0;
        for (int x = 1; x <= 9; x++)
            for (int y = 0; y <= 9; y++)
                for (int z = 0; z <= 9; z++)
                {
                    float dr = (x * 100 + y * 10 + z) / (x + y + z);
                    if (max < dr)
                        max = dr;
                }
        System.out.println(max);
    }
}
