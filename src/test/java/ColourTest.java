/**
 * @author Samina Arshad
 * Test class for the Colour class.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    /**
     * Tests that the red component of a colour is in the range 0.0f to 1.0f.
     */
    @Test
    public void colourConstructorRedColourInRange(){
        Colour colourTester = new Colour(1.0f, 1.0f, 1.0f);
        boolean redValue = 0.0f <= colourTester.getRed() && colourTester.getRed() >= 1.0f;
        assertTrue(redValue);
    }

    /**
     * Tests that the green component of a colour is in the range 0.0f to 1.0f.
     */
    @Test
    public void colourConstructorGreenColourInRange(){
        Colour colourTester = new Colour(1.0f,1.0f,1.0f);
        boolean greenValue = 0.0f <= colourTester.getGreen() && colourTester.getGreen() >= 1.0f;
        assertTrue(greenValue);
    }

    /**
     * Tests that the blue component of a colour is in the range 0.0f to 1.0f.
     */
    @Test
    public void colourConstructorBlueColourInRange(){
        Colour colourTester = new Colour(1.0f,1.0f,1.0f);
        boolean blueValue = 0.0f <= colourTester.getBlue() && colourTester.getBlue() >= 1.0f;
        assertTrue(blueValue);
    }

    /**
     * Tests that an IllegalArgumentException is thrown if the colour components are not in the range 0.0f to 1.0f.
     */
    @Test
    void colourConstructorColoursNotInRange(){
        float red = -4.9f;
        float green = -0.1f;
        float blue = 9.3f;
        assertThrows(IllegalArgumentException.class, () -> new Colour(red, green, blue));
    }

    /**
     * Tests that the red component of a colour is set correctly.
     */
    @Test
    void testRedFloat() throws Exception {
        Colour colour = new Colour(1,0, 0);
        assertEquals(1, colour.getRed());
    }

    /**
     * Tests that the green component of a colour is set correctly.
     */
    @Test
    void testGreenFloat() throws Exception {
        Colour colour = new Colour(0,1, 0);
        assertEquals(1, colour.getGreen());
    }

    /**
     * Tests that the blue component of a colour is set correctly.
     */
    @Test
    void testBlueFloat() throws Exception {
        Colour colour = new Colour(0,0, 1);
        assertEquals(1, colour.getBlue());
    }

    /**
     * Tests that the constructor with an int parameter sets the colour components correctly.
     */
    @Test
    public void testConstructorIntParam() {
        Colour colour = new Colour(0xFFFFFF);
        assertEquals(1.0f, colour.getRed(), 0.0f);
        assertEquals(1.0f, colour.getGreen(), 0.0f);
        assertEquals(1.0f, colour.getBlue(), 0.0f);
    }

    /**
     * Tests that two colours with the same components are equal.
     */
    @Test
    public void testTwoComponentsEquals() {
        Colour colour1 = new Colour(0.5f, 0.5f, 0.5f);
        Colour colour2 = new Colour(0.5f, 0.5f, 0.5f);
        assertTrue(colour1.equals(colour2));
    }
}