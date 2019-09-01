package unittesting;

import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int addResult = cal.addition(100, 200);
        Assert.assertEquals(addResult,300);

        int subResult = cal.subtraction(500, 400);
        Assert.assertEquals(subResult, 100);
    }
}
