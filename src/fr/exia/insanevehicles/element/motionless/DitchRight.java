package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Permeability;
import fr.exia.insanevehicles.element.Sprite;

/**
 * <h1>The DitchRight Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchRight extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(']', "DitchRight.jpg");

    /**
     * Instantiates a new ditchRight.
     */
    DitchRight() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
