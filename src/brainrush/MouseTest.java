/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainrush;

/**
 *
 * @author Obikoya Emmanuel
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseTest extends BrainRush implements MouseListener{
    public void mousePressed(MouseEvent e){
            requestFocus();
        }
        public void mouseReleased(MouseEvent e){ }
        public void mouseClicked(MouseEvent e){ }
        public void mouseEntered(MouseEvent e){ }
        public void mouseExited(MouseEvent e){ }
    
}
