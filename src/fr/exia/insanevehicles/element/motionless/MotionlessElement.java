package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Element;
import fr.exia.insanevehicles.element.Permeability;
import fr.exia.insanevehicles.element.Sprite;

/**
 * <h1>The MotionlessElement Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
abstract class MotionlessElement extends Element {

    /**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
