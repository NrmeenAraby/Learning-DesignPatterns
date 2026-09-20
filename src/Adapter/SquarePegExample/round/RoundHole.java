package Adapter.SquarePegExample.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public boolean fit(RoundPeg roundPeg){
        return (this.radius>=roundPeg.getRadius());
    }
}
