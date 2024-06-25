package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxProductTest() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.maxProduct(new int[]{2,3,-2,4}));
        Assert.assertEquals(0, solution.maxProduct(new int[]{-2, 0, -1}));
    }
}