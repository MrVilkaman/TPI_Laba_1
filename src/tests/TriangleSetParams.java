package tests;

import donnu.zolotarev.tpi.lab1.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleSetParams {

    private Triangle traingle;

    @Before
    public void setUp() throws Exception {
         traingle = new Triangle();
    }

    @Test
    public void testSetGoodSides1() {
        traingle.setSides(1,1,1);
    }

    @Test
    public void testSetGoodSides2() {
        traingle.setSides(3,4,5);
    }

    @Test(expected = NumberFormatException.class)
    public void testSetWrongParam1() {
        traingle.setSides(-1,1,1);
    }

    @Test(expected = NumberFormatException.class)
    public void testSetWrongParam2() {
        traingle.setSides(11,-1,1);
    }

    @Test(expected = NumberFormatException.class)
    public void testSetWrongParam3() {
        traingle.setSides(1,1,-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalArgument1() {
        traingle.setSides(0,1,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalArgument2() {
        traingle.setSides(1,0,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalArgument3() {
        traingle.setSides(1,1,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalArgument5() {
        traingle.setSides(1,1,54);
    }

    @Test
    public void testArea1() {
        traingle.setSides(3,4,5);

        double res = traingle.area();

        Assert.assertEquals(res,6,0.001);
    }

    @Test
    public void testArea2() {
        traingle.setSides(3,3,3);

        double res = traingle.area();

        Assert.assertEquals(res,3.9,0.01);
    }

    @Test
    public void testArea3() {
        traingle.setSides(15,20,7);

        double res = traingle.area();

        Assert.assertEquals(res,42,0.001);
    }
}