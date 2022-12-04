/**
 * @author Samina Arshad
 * This class represents a colour with red, green and blue components.
 */
public class Colour {

    /** The red component of the colour. */
    private float red;
    /** The green component of the colour. */
    private float green;
    /** The blue component of the colour. */
    private float blue;

    /**
     * Constructs a new Colour object with the given red, green and blue components.
     * @param red The red component of the colour. Must be between 0.0f and 1.0f.
     * @param green The green component of the colour. Must be between 0.0f and 1.0f.
     * @param blue The blue component of the colour. Must be between 0.0f and 1.0f.
     */
    public Colour(float red, float green, float blue) {
        if ( ( red < 0.0f || red > 1.0f ) || ( green < 0.0f || green > 1.0f ) || ( blue < 0.0f || blue > 1.0f ) ) {
            throw new IllegalArgumentException("VALUE OUT OF RANGE");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Constructs a new Colour object with the given RGB value.
     * @param rgb The RGB value of the colour.
     */
    public Colour(int rgb) {
        this.red = (float)((rgb >> 16) & 0xFF) / 255f;
        this.green = (float)((rgb >> 8) & 0xFF) / 255f;
        this.blue = (float)(rgb & 0xFF) / 255f;
    }

    public float getRed() {
        return red;
    }
    public float getGreen() {
        return green;
    }
    public float getBlue() {
        return blue;
    }

    /**
     * Checks if this colour is equal to another colour.
     * @param other The other colour to compare with.
     * @return true if the colours are equal, false otherwise.
     */
    public boolean equals(Colour other) {
        return this.red == other.red && this.green == other.green && this.blue == other.blue;
    }
}
