package tk.hadeslee.TimeOutTestCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2016-07-07.
 */
public class TimeOutTestCaseTest {
    @Test(timeout = 2000)
    public void timeoutMethodOTest() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("timeout limit test NO.1");
    }

    @Test(timeout = 5000)
    public void timeinMethodTwoTest() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("timeout limit test NO.2");
    }

    @Test(timeout = 2000)
    public void timeoutMethodRunForEverTest() {
        while (true) {
            //Do noting.
        }
    }
}