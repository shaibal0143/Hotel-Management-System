package Hotel.Management.System;

import javax.swing.*;
 
public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/splash31.png"));
        JLabel label=new JLabel(imageIcon);
        label.setBounds(0,0,840,650);
        add(label);

       
        setLayout(null);
        setLocation(300,65);
        setSize(840,650);
        setVisible(true);
        try { Thread.sleep(5000);
            new Login();
            setVisible(false);
            
        } catch (Exception e) {
           
            // TODO: handle exception
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Splash();

        
    }
}
