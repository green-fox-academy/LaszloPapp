import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void getSumList() throws Exception {

        Sum sum = new Sum();
        ArrayList<Integer> sumList = new ArrayList(Arrays.asList(1, 2, 3));


            assertEquals(6, sum.sum(sumList));


    }

}