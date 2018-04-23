package fr.exia.insanevehicles.element.mobile;

import java.awt.Point;

import fr.exia.insanevehicles.Road;
import fr.exia.insanevehicles.element.Element;
import fr.exia.insanevehicles.element.Permeability;
import fr.exia.insanevehicles.element.Sprite;
import fr.exia.showboard.IBoard;
import fr.exia.showboard.IPawn;

/**
 * <h1>The Mobile Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
abstract class Mobile extends Element implements IPawn {

    /**
     * The x.
     */
    private Point   position;

    /** The alive. */
    private Boolean alive = true;

    /** The road. */
    private Road    road;

    /** The board. */
    private IBoard  board;

    /**
     * Instantiates a new mobile.
     *
     * @param sprite
     *            the sprite
     * @param road
     *            the road
     * @param permeability
     *            the permeability
     */
    Mobile(final Sprite sprite, final Road road, final Permeability permeability) {
        super(sprite, permeability);
        this.setRoad(road);
        this.position = new Point();
    }

    /**
     * Instantiates a new mobile.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param sprite
     *            the sprite
     * @param road
     *            the road
     * @param permeability
     *            the permeability
     */
    Mobile(final int x, final int y, final Sprite sprite, final Road road, final Permeability permeability) {
        this(sprite, road, permeability);
        this.setX(x);
        this.setY(y);
    }

    /**
     * Move up.
     */
    public void moveUp() {
        this.setY(this.getY() - 1);
    }

    /**
     * Move left.
     */
    public void moveLeft() {
        this.setX(this.getX() - 1);
    }

    /**
     * Move down.
     */
    public void moveDown() {
        this.setY(this.getY() + 1);
    }

    /**
     * Move right.
     */
    public void moveRight() {
        this.setX(this.getX() + 1);
    }

    /**
     * Gets the x.
     *
     * @return the x
     */
    @Override
    public final int getX() {
        return this.getPosition().x;
    }

    /**
     * Sets the x.
     *
     * @param x
     *            the new x
     */
    public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isCrashed()) {
            this.die();
        }
    }

    /**
     * Gets the y.
     *
     * @return the y
     */
    @Override
    public final int getY() {
        return this.getPosition().y;
    }

    /**
     * Sets the y.
     *
     * @param y
     *            the new y, as the road is an infinite loop, there's a modulo
     *            based on the road height.
     */
    public final void setY(final int y) {
        this.getPosition().y = (y + this.getRoad().getHeight()) % this.getRoad().getHeight();
        if (this.isCrashed()) {
            this.die();
        }
    }

    /**
     * Gets the road.
     *
     * @return the road
     */
    public Road getRoad() {
        return this.road;
    }

    /**
     * Sets the road.
     *
     * @param road
     *            the new road
     */
    private void setRoad(final Road road) {
        this.road = road;
    }

    /**
     * Checks if is alive.
     *
     * @return the alive
     */
    public Boolean isAlive() {
        return this.alive;
    }

    /**
     * Dies.
     */
    private void die() {
        this.alive = false;
    }

    /**
     * Checks if the car crashed.
     *
     * @return the boolean
     */
    public Boolean isCrashed() {
        return this.getRoad().getOnTheRoadXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    @Override
    public Point getPosition() {
        return this.position;
    }

    /**
     * Sets the position.
     *
     * @param position
     *            the position to set
     */
    public void setPosition(final Point position) {
        this.position = position;
    }

    /**
     * Gets the board.
     *
     * @return the board
     */
    protected IBoard getBoard() {
        return this.board;
    }
}
