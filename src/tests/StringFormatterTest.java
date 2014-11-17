package tests;

import donnu.zolotarev.tpi.lab1.StringFormatter;
import org.junit.Assert;
import org.junit.Test;

public class StringFormatterTest {

    private StringFormatter formattet;



    @Test(expected = NullPointerException.class)
    public void testNullString() {
        formattet = new StringFormatter();
        formattet.webString(null);
    }

    @Test()
      public void testGoodStringWithoutProtocol() {
        formattet = new StringFormatter();
        String s = formattet.webString("www.test.com");
        Assert.assertEquals(s,"http://www.test.com");
    }

    @Test()
    public void testGoodStringWithProtocol() {
        formattet = new StringFormatter();
        String s = formattet.webString("http://www.test.com");
        Assert.assertEquals(s,"http://www.test.com");
    }

    @Test()
    public void testGoodStringWithSecure() {
        formattet = new StringFormatter();
        String s = formattet.webString("www.testsecure.com");
        Assert.assertEquals(s,"https://www.testsecure.com");
    }

    @Test()
    public void testGoodStringWithSecureAndProtocol() {
        formattet = new StringFormatter();
        String s = formattet.webString("http://testsecure.com");
        Assert.assertEquals(s,"http://testsecure.com");
    }
}