package body;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Seikicegus
 */
public class Body extends JPanel {
    
    public List<Layer> v_layers;
    public Menu v_menu;
    
    public Body () {
        super();
        this.v_menu = new Menu();
        this.v_layers = new ArrayList();
        this.v_layers.add(new Layer(50,50));
        this.v_layers.add(new Layer(0,0));
    }
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        for (int i=0 ; i<this.getWidth() ; i+=5) {
            for (int j=0 ; j<this.getHeight() ; j+=5) {
                if ((i+j)%2==0) {
                    g.setColor(Color.LIGHT_GRAY);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(i, j, 5, 5);
            }
        }
        for(Layer it : this.v_layers) {
            g.drawImage(it, it.x, v_menu.getHeight()+it.y, this);
        }
        g.drawImage(v_menu, 0, 0, this);
    }
}
