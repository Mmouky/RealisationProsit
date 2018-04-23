package fr.exia.insanevehicles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

import fr.exia.insanevehicles.element.Element;
import fr.exia.insanevehicles.element.motionless.MotionlessElementsFactory;

/**
 * <h1>The Road Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public class Road extends Observable {

    /** The width. */
    private int         width;

    /** The height. */
    private int         height;

    /** The quota. */
    private int         quota;

    /** The on the road. */
    private Element[][] onTheRoad;

    /**
     * Instantiates a new road with the content of the file fileName.
     *
     * @param fileName
     *            the file name where the map of the road is
     * @param quota
     *            the quota
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public Road(final String fileName, final int quota) throws IOException {
        super();
        this.setQuota(quota);
        this.loadFile(fileName);
    }

    /**
     * Loads file.
     *
     * @param fileName
     *            the file name
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private void loadFile(final String fileName) throws IOException {
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;
        int y = 0;
        line = buffer.readLine();
        this.setWidth(Integer.parseInt(line));
        line = buffer.readLine();
        this.setHeight(Integer.parseInt(line));
        this.onTheRoad = new Element[this.getWidth()][this.getHeight()];
        line = buffer.readLine();
        while (line != null) {
            for (int x = 0; x < line.toCharArray().length; x++) {
                this.setOnTheRoadXY(MotionlessElementsFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
            }
            line = buffer.readLine();
            y++;
        }
        buffer.close();
    }

    /**
     * Gets the width.
     *
     * @return the width
     */
    public final int getWidth() {
        return this.width;
    }

    /**
     * Sets the width.
     *
     * @param width
     *            the new width
     */
    private void setWidth(final int width) {
        this.width = width;
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    public final int getHeight() {
        return this.height;
    }

    /**
     * Sets the height.
     *
     * @param height
     *            the new height
     */
    private void setHeight(final int height) {
        this.height = height;
    }

    /**
     * Gets the quota.
     *
     * @return the quota
     */
    public final int getQuota() {
        return this.quota;
    }

    /**
     * Sets the quota.
     *
     * @param quota
     *            the new quota
     */
    private void setQuota(final int quota) {
        this.quota = quota;
    }

    /**
     * Gets the on the road XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the on the road XY
     */
    public final Element getOnTheRoadXY(final int x, final int y) {
        return this.onTheRoad[x][y];
    }

    /**
     * Sets the on the road XY.
     *
     * @param element
     *            the element
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public final void setOnTheRoadXY(final Element element, final int x, final int y) {
        this.onTheRoad[x][y] = element;
    }

    /**
     * Sets the mobile has changed.
     */
    public final void setMobileHasChanged() {
        this.setChanged();
        this.notifyObservers();
    }
}
