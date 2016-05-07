package body;

import java.awt.image.BufferedImage;
import utils.IntColor;

/**
 *
 * @author Seikicegus
 */
public class Menu extends BufferedImage {
    public Menu() {
        super(500, 95, TYPE_INT_ARGB);
        for (int i=0 ; i<super.getWidth() ; ++i) {
            for (int j=0 ; j<super.getHeight() ; ++j) {
                super.setRGB(i, j, IntColor.Gray.getARGB());
            }
        }
        for (int x=0 ; x<5 ; ++x) {
            for (int y=0 ; y<2 ; ++y) {
                for (int i=0 ; i<40 ; ++i) {
                    for (int j=0 ; j<40 ; ++j) {
                        super.setRGB(x*45+i+5, y*45+j+5, IntColor.LightGray.getARGB());
                    }
                }
            }
        }
    }
}
