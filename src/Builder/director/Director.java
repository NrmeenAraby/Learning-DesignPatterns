package Builder.director;

import Builder.builders.Builder;
import Builder.cars.CarType;

/* Having a director class in your program isn’t strictly necessary.
You can always call the building steps in a specific order directly from the client code */
public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine("3.0, 0");
        builder.setTransmission("Semi Automatic");
        builder.setTripComputer("new");
        builder.setGpsNavigator("221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London");
    }

    public void  constructsCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine("1.2, 0");
        builder.setTransmission("AUTOMATIC");
        builder.setTripComputer("new");
        builder.setGpsNavigator("221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London");
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine("2.5, 0");
        builder.setTransmission("MANUAL");
        builder.setGpsNavigator("221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London");
    }
}
