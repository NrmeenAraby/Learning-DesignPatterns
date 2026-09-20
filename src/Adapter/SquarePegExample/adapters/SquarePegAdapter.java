package Adapter.SquarePegExample.adapters;

import Adapter.SquarePegExample.round.RoundPeg;
import Adapter.SquarePegExample.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */

//Adapter extends/implements the thing that is used in client code.
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg){
        this.squarePeg=squarePeg;
    }

    public double getRadius(){ // the function the client code use
        // Calculate a minimum circle radius, which can fit this peg.
       double result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
       return result;
    }
}
