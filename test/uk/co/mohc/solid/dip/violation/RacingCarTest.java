package uk.co.mohc.solid.dip.violation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RacingCarTest {

    RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar(100);
        racingCar.printStatus();
    }

    @Test
    void accelerate() {
        racingCar.accelerate();
        racingCar.printStatus();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}