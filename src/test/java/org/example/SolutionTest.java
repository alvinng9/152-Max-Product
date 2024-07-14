package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxProductTest() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.maxProduct(new int[]{2,3,-2,4}));
        Assert.assertEquals(0, solution.maxProduct(new int[]{-2,0,-1}));
        Assert.assertEquals(288, solution.maxProduct(new int[]{6,-3,-4,4,-5}));
        Assert.assertEquals(21504, solution.maxProduct(new int[]{-4,-6,-4,-7,-8,-4}));
        Assert.assertEquals(4, solution.maxProduct(new int[]{0,0,0,4,-5}));
        Assert.assertEquals(1254400, solution.maxProduct(new int[]
                {-10,10,2,-2,1,0,-1,4,-5,-5,4,7,8,-7,-8}));
    }
}