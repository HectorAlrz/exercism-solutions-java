import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LasagnaTest {
    
    private Lasagna lasagna;
    
    @BeforeEach
    void setUp() {
        lasagna = new Lasagna();
    }
    
    @Test
    void expectedMinutesInOven() {
        assertEquals(40, lasagna.expectedMinutesInOven());
    }
    
    @Test
    void remainingMinutesInOvenAfterFifteenMinutes() {
        assertEquals(25, lasagna.remainingMinutesInOven(15));
    }
    
    @Test
    void remainingMinutesInOvenAfterZeroMinutes() {
        assertEquals(40, lasagna.remainingMinutesInOven(0));
    }
    
    @Test
    void remainingMinutesInOvenAfterFortyMinutes() {
        assertEquals(0, lasagna.remainingMinutesInOven(40));
    }
    
    @Test
    void preparationTimeInMinutesForOneLayer() {
        assertEquals(2, lasagna.preparationTimeInMinutes(1));
    }
    
    @Test
    void preparationTimeInMinutesForTwoLayers() {
        assertEquals(4, lasagna.preparationTimeInMinutes(2));
    }
    
    @Test
    void preparationTimeInMinutesForSixLayers() {
        assertEquals(12, lasagna.preparationTimeInMinutes(6));
    }
    
    @Test
    void totalTimeInMinutesForOneLagaerAndTwentyFiveMinutesInOven() {
        assertEquals(27, lasagna.totalTimeInMinutes(1, 25));
    }
    
    @Test
    void totalTimeInMinutesForThreeLayersAndTenMinutesInOven() {
        assertEquals(16, lasagna.totalTimeInMinutes(3, 10));
    }
    
    @Test
    void totalTimeInMinutesForFiveLayersAndFortyMinutesInOven() {
        assertEquals(50, lasagna.totalTimeInMinutes(5, 40));
    }
}