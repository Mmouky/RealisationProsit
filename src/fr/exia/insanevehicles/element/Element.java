package fr.exia.insanevehicles.element;

import java.awt.Image;

import fr.exia.showboard.ISquare;

/**
 * <h1>The Element Class.</h1>
 *
 * @author Jade
 * @version 0.3
 * @see ISquare
 */
public abstract class Element implements ISquare {

    /** The sprite. */
    private Sprite       sprite;

    /** The permeability. */
    private Permeability permeability;

    /**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    /**
     * Gets the sprite.
     *
     * @return the sprite
     */
    public final Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
    private void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    /**
     * Gets the permeability.
     *
     * @return the permeability
     */
    public final Permeability getPermeability() {
        return this.permeability;
    }

    /**
     * Sets the permeability.
     *
     * @param permeability
     *            the new permeability
     */
    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.ISquare#getImage()
     */
    @Override
    public final Image getImage() {
        return this.getSprite().getImage();
    }
}
