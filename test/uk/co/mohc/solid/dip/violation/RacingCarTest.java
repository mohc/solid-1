package uk.co.mohc.solid.dip.violation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RacingCarTest {

    RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar(100);
    }

    @Test
    void accelerate() {
        racingCar.accelerate();
    }
}