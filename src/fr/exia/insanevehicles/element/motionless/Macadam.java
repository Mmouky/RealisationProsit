package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Permeability;
import fr.exia.insanevehicles.element.Sprite;

/**
 * <h1>The Macadam Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Macadam extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(' ', "Macadam.jpg");

    /**
     * Instantiates a new macadam.
     */
    Macadam() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
