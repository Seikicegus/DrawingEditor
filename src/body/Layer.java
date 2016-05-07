package body;

import java.awt.image.BufferedImage;
import utils.IntColor;

/**
 *
 * @author Seikicegus
 */
public class Layer extends BufferedImage {
    
    public int x;
    public int y;
    
    public Layer (int x, int y) {
        super(500, 100, TYPE_INT_ARGB);
        this.x = x;
        this.y = y;
        for (int i=0 ; i<super.getWidth() ; ++i) {
            for (int j=0 ; j<super.getHeight() ; ++j) {
                super.setRGB(i, j, IntColor.values()
                        [(i/20)%IntColor.values().length].getARGB());
            }
        }
    }
    
    public Layer () {
        this(0,0);
    }
}
