package lab24;

import org.junit.Test;

import static lab24.Speed.calcSpeed;
import static org.junit.Assert.assertEquals;

public class SpeedTest {
    @Test
    public void testCalcSpeed() {
        assertEquals(0, calcSpeed(0,0), 0);
        assertEquals(0.06, calcSpeed(60,60), 0);
        assertEquals(0, calcSpeed(-60,60), 0);
        assertEquals(0, calcSpeed(60,-60), 0);
    }
}