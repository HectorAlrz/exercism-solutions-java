public class Lasagna {
    
    /**
     * Returns the expected oven time in minutes.
     */
    public int expectedMinutesInOven() {
        return 40;
    }
    
    /**
     * Returns the remaining minutes based on the actual minutes already in the oven.
     */
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    
    /**
     * Returns the preparation time in minutes based on the number of layers.
     */
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }
    
    /**
     * Returns the total working time in minutes (preparation time + oven time).
     */
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
}