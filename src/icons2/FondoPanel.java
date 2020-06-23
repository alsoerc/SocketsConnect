/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icons2;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author skylar
 */
public class FondoPanel extends JPanel{
    private Image image;
    @Override
    public void paint (Graphics g){
        image = new ImageIcon(getClass().getResource("/icons2/fondoSonido.jpg")).getImage();
        g.drawImage(image, 0, 0,getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
