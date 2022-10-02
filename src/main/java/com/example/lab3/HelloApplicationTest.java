package com.example.lab3;

import org.junit.Assert;
import org.junit.Test;

public class HelloApplicationTest {

    @Test
    public void checkIfPointOwns() {
        boolean flag;
        int radius = 0, pointX = 0, pointY = 0;
        pointX = 3; pointY = 3; radius = 4;
        int res = (int) (Math.pow((pointX - 1),2) + (int) (Math.pow((pointY - 0),2)));
        int squaredRadius = (int) Math.pow(radius,2);
        if (res <= squaredRadius) {
            // owns
            flag = true;
        } else {
            // don't own
          flag = false;
        }
        Assert.assertTrue(flag);
    }
    @Test
    public void checkIfPointDoesntOwn() {
        boolean flag;
        int radius = 0, pointX = 0, pointY = 0;
        pointX = 4; pointY = 4; radius = 4;
        int res = (int) (Math.pow((pointX - 1),2) + (int) (Math.pow((pointY - 0),2)));
        int squaredRadius = (int) Math.pow(radius,2);
        if (res <= squaredRadius) {
            // owns
            flag = true;
        } else {
            // don't own
            flag = false;
        }
        Assert.assertFalse(flag);
    }
}