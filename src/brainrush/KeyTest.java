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
public  class KeyTest extends JPanel implements KeyListener{
    public KeyTest(){
        setBackground(Color.BLACK);
        
    }
    public void paintComponent(Graphics e){
        super.paintComponent(e);
        e.setColor(Color.red);
        e.drawString("Hello World", 20, 30);
        e.fillRect(40, 40, 30, 30);
    }
    public void keyPressed(KeyEvent evt){
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ESCAPE){
            System.exit(0);
            
        }
        else{
            repaint();
        }
    }
    public void keyReleased(KeyEvent e){ }
    public void keyTyped(KeyEvent e){ }
    public static void main(String args[]){
        KeyTest content = new KeyTest();
        JFrame window = new JFrame();
        window.addKeyListener(content);
        window.setContentPane(content);
        window.setLocation(100, 75);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 400);
        window.setVisible(true);
    }
}
