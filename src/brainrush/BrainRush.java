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
public class BrainRush extends JPanel implements ActionListener{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setColor(Color.cyan);
        g.setFont(new Font("Serif",Font.BOLD,30));
        g.drawString("M.S. GAMES", 200, 200);
        g.setColor(Color.RED);
        g.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,20));
        g.drawString("Presents", 250, 250);
        g.setColor(Color.cyan);
        g.fillRect(200, 300, 220, 50);
        g.setColor(Color.RED);
        g.setFont(new Font("Dialog",Font.BOLD,33));
        g.drawString("Brain Rush", 225, 335);
        g.setColor(Color.white);
        g.setFont(new Font("Dialog",Font.BOLD,25));
        g.drawString("Press Enter to continue", 180, 600);
    }
    public void actionPerformed(ActionEvent e){
        
         Graphics g = getGraphics(); 
         while (true){
        g.setColor(Color.yellow);
        g.setFont(new Font("Dialog",Font.BOLD,25));
        g.drawString("Press Enter to continue", 180, 600);
        g.setColor(Color.white);
        g.setFont(new Font("Dialog",Font.BOLD,25));
        g.drawString("Press Enter to continue", 180, 600);
        
       }
       
        }
    
    private static Timer t;
    private static  boolean p=false;
    public static void main(String[] args) {
        BrainRush content = new BrainRush();
        // TODO code application logic here
       // content.addKeyListener(new KeyTest());
        
         t = new Timer(2000,content);
        t.start();
        
        if(p){
            t.stop();
        }
        JFrame window = new JFrame("Brain Rush");
        window.addKeyListener(new Key());
        window.setFocusTraversalKeysEnabled(true);
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(400, 0);
        window.setSize(600,700);
        window.setResizable(false);
        window.setVisible(true);
    }
    public static class Key implements KeyListener{

        
        public void keyTyped(KeyEvent e) {
            
        }

        
        public void keyPressed(KeyEvent e) {
           int coe = e.getKeyCode();
           
           
            if(coe==KeyEvent.VK_ENTER){
                p=true;
                System.exit(0);
        }
        }

       
        public void keyReleased(KeyEvent e) {
           
        }
        
    }
    
        
}
   

   
    
    

    
