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
public class MainRush extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLUE);
    }
    private static class Key implements KeyListener{
        public void keyPressed(KeyEvent e){
            int coe = e.getKeyCode();
            if(coe==KeyEvent.VK_ESCAPE){
                
            System.exit(0);
        }
        }
        public void keyReleased(KeyEvent e){ }
        public void keyTyped(KeyEvent e){ }

       
            
    }
    public static void main(String args[]){
        MainRush content = new MainRush();
        
        JFrame window = new JFrame();
        window.addKeyListener(new Key());
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(100, 100);
        window.setSize(250, 200);
        window.setVisible(true);
    }
     
    
}
