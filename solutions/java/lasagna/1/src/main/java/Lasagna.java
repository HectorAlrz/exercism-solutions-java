public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return 40 - actualMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
        public int totalTimeInMinutes(int layers, int ovenTime) {
            int prepTime = preparationTimeInMinutes(layers);
        return prepTime + ovenTime;
    }
}
