package ihm;

import body.Body;
import javax.swing.JFrame;

/**
 *
 * @author Seikicegus
 */
public class Frame extends JFrame {
    public Frame() {
        super("DrawingEditor");
        super.setSize(500, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setContentPane(new Body());
    }
    
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
    }
}
