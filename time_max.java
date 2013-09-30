import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ovcharenko
 * Date: 11.09.13
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
public class time_max {


    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(10, 13);
        map.put(11, 14);
        map.put(12, 13);
        map.put(12, 14);
        map.put(10, 15);
        map.put(13, 14);

        int[] array = new int[24];
        for (int i = 0; i < array.length; i++)
            array[i] = 0;

        for (Map.Entry<Integer, Integer> pair : map.entrySet())
            for (int i = pair.getKey(); i < pair.getValue(); i++)
                array[i] += 1;

        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i])
                max = array[i];

        int index = -1;
        for (int i = 0; i < array.length; i++)
            if (max == array[i])
            {
                index = i;
                break;
            }

        System.out.print(max + " посетителей было в " + (index + 1) +" часу");
    }
}
