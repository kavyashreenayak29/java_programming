//Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
//pressed by implementing the event handling mechanism with addActionListener( ).
package Swings;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ImageButtonExample {

    JLabel messageLabel;

    ImageButtonExample() {
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel();
        messageLabel.setBounds(50, 30, 500, 100);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(messageLabel);

        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

        JButton digitalClockBtn = new JButton(digitalClockIcon);
        JButton hourGlassBtn = new JButton(hourGlassIcon);

        digitalClockBtn.setBounds(100, 150, 150, 150);
        hourGlassBtn.setBounds(350, 150, 150, 150);

        digitalClockBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("You have pressed Digital Clock!");
            }
        });

        hourGlassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("You have pressed Hour Glass!");
            }
        });

        frame.add(digitalClockBtn);
        frame.add(hourGlassBtn);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}
