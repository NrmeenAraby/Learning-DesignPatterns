package Builder.builders;

import Builder.cars.Car;
import Builder.cars.CarType;

public class CarBuilder implements Builder {
    private  CarType carType;
    private  int seats;
    private  String engine;
    private  String transmission;
    private  String tripComputer;
    private  String gpsNavigator;

    public void setCarType(CarType carType){
        this.carType=carType;
    }
    public void setSeats(int seats){
        this.seats=seats;
    }
    public void setEngine(String engine){
        this.engine=engine;
    }
    public void setTransmission(String transmission){
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

    /** Unlike other creational patterns, Builder can construct unrelated products,
     * which don't have the common interface
     */
    public Car getResult(){
        return new Car(carType,seats,engine,transmission,tripComputer,gpsNavigator);
    }


    public void reset(){
        this.carType = null;
        this.seats = 0;
        this.engine = null;
        this.transmission = null;
        this.tripComputer = null;
        this.gpsNavigator = null;
    }
}
