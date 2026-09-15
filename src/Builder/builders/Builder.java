package Builder.builders;

import Builder.cars.CarType;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(String engine);
    void setTransmission(String transmission);
    void setTripComputer(String tripComputer);
    void setGpsNavigator(String gpsNavigator);
    void reset();
}
