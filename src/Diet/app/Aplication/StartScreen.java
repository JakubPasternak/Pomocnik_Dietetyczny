package Diet.app.Aplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen {
    StartScreen(){
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Pomocnik Dietetyczny");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        String imagepath = "src/LOGO.jpg";
        ImageIcon imageIcon = new ImageIcon(imagepath);
        JLabel imageJLabel = new JLabel(imageIcon);
        imageJLabel.setBounds(0, 500, 1200, 250);
        frame.add(imageJLabel);
        frame.getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("Witaj w twoim Pomocniku Dietetycznym!");
        text.setFont(new Font("Osward", Font.BOLD, 55));
        text.setBounds(50, 10, 1200, 200);
        frame.add(text);

        JLabel text2 = new JLabel("Pomogę ci obliczyć twoje zapotrzebowanie");
        text2.setFont(new Font("Osward", Font.BOLD, 45));
        text2.setBounds(140, 120, 1200, 200);
        frame.add(text2);

        JLabel text3 = new JLabel("kaloryczne, oraz twoje BMI.");
        text3.setFont(new Font("Osward", Font.BOLD, 45));
        text3.setBounds(290, 180, 1200, 200);
        frame.add(text3);

        JButton button = new JButton("Zacznij");
        button.setFont(new Font("Osward", Font.BOLD, 28));
        button.setBounds(480, 350, 130, 70);
        button.setVisible(true);
        button.setFocusable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==button){
                    new DietFrame();
                    frame.dispose();;
                }
            }
        });
        frame.add(button);
    }
}
