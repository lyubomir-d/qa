package lab27;

import org.junit.Test;

import java.util.Arrays;

import static lab27.d2Array.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class d2ArrayTest {
    @Test
    public void testGen2DArray() {
        assertEquals(4, gen2DArray(4).length);
        assertNotEquals(gen2DArray(4), gen2DArray(4));
    }
    @Test
    public void testTransformTo1D() {
        int[][] arr2D = gen2DArray(4);
        int[] arr1D = transformTo1D(arr2D);
        String strFromArr2D = Arrays.deepToString(arr2D);
        String strFromArr1D = Arrays.toString(arr1D);

        assertEquals(strFromArr1D.replaceAll("[\\[,\\]]", ""), strFromArr2D.replaceAll("[\\[,\\]]", ""));
    }
    @Test
    public void testGetAvg() {
        assertEquals(5.0, getAvg(new int[]{1, 2, 3, 4, 5, 6, 14}), 0);
    }
}
