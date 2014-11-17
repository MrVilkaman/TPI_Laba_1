package tests;

import donnu.zolotarev.tpi.lab1.ArrayProcessor;
import org.junit.Assert;
import org.junit.Test;

public class ArrayProcessorTest {



    @Test
    public void testNullParamNullResault() {
        int[] res = ArrayProcessor.SortAndFilter(null);
        Assert.assertArrayEquals(res,null);
    }

    @Test
    public void testEmptyParam() {
        int[] res = ArrayProcessor.SortAndFilter(new int[]{});
        Assert.assertArrayEquals(res,new int[]{});
    }

    @Test
    public void testGoodParamWithAllGoodArgument() {
        int[] res = ArrayProcessor.SortAndFilter(new int[]{1,2,3,4,5,6});
        Assert.assertArrayEquals(res,new int[]{1,2,3,4,5,6});
    }

    @Test
    public void test2NegativeParam() {
        int[] res = ArrayProcessor.SortAndFilter(new int[]{-1,-2,3,4,5,6});
        Assert.assertArrayEquals(res,new int[]{-1,-2,3,4,5,6});
    }

    @Test
    public void test2recurringParam() {
        int[] res = ArrayProcessor.SortAndFilter(new int[]{1,1,3,3,6,6});
        Assert.assertArrayEquals(res,new int[]{1,1,3,3,6,6});
    }

    @Test
    public void test2NegativerecurringParam() {
        int[] res = ArrayProcessor.SortAndFilter(new int[]{-1,-1,-3,-3,6,6});
        Assert.assertArrayEquals(res,new int[]{-1,-3,6,6});
    }
}