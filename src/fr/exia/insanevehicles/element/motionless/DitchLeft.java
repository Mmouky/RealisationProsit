package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Permeability;
import fr.exia.insanevehicles.element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchLeft extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('[', "DitchLeft.jpg");

    /**
     * Instantiates a new ditchLeft.
     */
    DitchLeft() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
