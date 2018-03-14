package uk.co.mohc.solid.dip.violation;

import org.junit.jupiter.api.Test;

public class DriverTest {
    @Test
    public void DriverTest() {
        Driver driver = new Driver();
    }

    @Test
    void increaseSpeed() {
        Driver driver = new Driver();
        driver.increaseSpeed();
    }
}
