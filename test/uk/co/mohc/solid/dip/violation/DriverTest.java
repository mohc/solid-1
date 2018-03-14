package uk.co.mohc.solid.dip.violation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class DriverTest {

    private Driver driver;

    @BeforeEach
    void setUp() {
        driver = new Driver();
    }

    @Test
    void increaseSpeed() {
        driver.increaseSpeed();
    }
}
