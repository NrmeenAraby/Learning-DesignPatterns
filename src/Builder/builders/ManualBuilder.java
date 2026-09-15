package Builder.builders;

import Builder.cars.CarType;
import Builder.cars.Manual;

public class ManualBuilder implements Builder{
    private CarType carType;
    private  int seats;
    private  String engine;
    private  String transmission;
    private  String tripComputer;
    private  String gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType=carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats=seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine=engine;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission=transmission;
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.tripComputer=tripComputer;
    }

    @Override
    public void setGpsNavigator(String gpsNavigator) {
        this.gpsNavigator=gpsNavigator;
    }

    public Manual getResult(){
        return new Manual(carType,seats,engine,transmission,tripComputer,gpsNavigator);
    }
}
