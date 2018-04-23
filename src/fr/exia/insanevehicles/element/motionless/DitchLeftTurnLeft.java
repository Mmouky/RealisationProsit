package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Permeability;
import fr.exia.insanevehicles.element.Sprite;

/**
 * <h1>The Ditch Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchLeftTurnLeft extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('(', "DitchLeftTurnLeft.jpg");

    /**
     * Instantiates a new ditch.
     */
    DitchLeftTurnLeft() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
