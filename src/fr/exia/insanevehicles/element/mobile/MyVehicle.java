package fr.exia.insanevehicles.element.mobile;

import fr.exia.insanevehicles.Road;
import fr.exia.insanevehicles.element.Permeability;
import fr.exia.insanevehicles.element.Sprite;

/**
 * <h1>The MyVehicle Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public class MyVehicle extends Mobile {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('H', "MyVehicle.png");

    /**
     * Instantiates a new my vehicle.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param road
     *            the road
     */
    public MyVehicle(final int x, final int y, final Road road) {
        super(x, y, SPRITE, road, Permeability.BLOCKING);
    }
}
