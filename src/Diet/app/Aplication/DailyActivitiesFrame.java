package Diet.app.Aplication;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DailyActivitiesFrame extends JFrame {

    public static double CMP;

    public static double getCMP() {
        return CMP;
    }

    DailyActivitiesFrame(){
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Pomocnik Dietetyczny");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        String imagepath = "src/CMP.jpg";
        ImageIcon imageIcon = new ImageIcon(imagepath);
        JLabel imageJLabel = new JLabel(imageIcon);
        imageJLabel.setBounds(5, 10, 1200, 800);
        frame.add(imageJLabel);
        frame.getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("Wskaż swój współczynnik aktywności fizycznej");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(50, 10, 1800, 100);
        frame.add(text);



        JCheckBox checkBox1 = new JCheckBox();
        checkBox1.setBounds(65, 225, 150, 80);
        checkBox1.setFocusable(false);
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CMP = 1.2;
                System.out.println(getCMP());
            }
        });
        frame.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox();
        checkBox2.setBounds(65, 287, 150, 80);
        checkBox2.setFocusable(false);
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CMP = 1.4;
                System.out.println(getCMP());
            }
        });
        frame.add(checkBox2);

        JCheckBox checkBox3 = new JCheckBox();
        checkBox3.setBounds(65, 348, 150, 80);
        checkBox3.setFocusable(false);
        checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CMP = 1.6;
                System.out.println(getCMP());
            }
        });
        frame.add(checkBox3);

        JCheckBox checkBox4 = new JCheckBox();
        checkBox4.setBounds(65, 410, 150, 80);
        checkBox4.setFocusable(false);
        checkBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CMP = 1.75;
                System.out.println(getCMP());
            }
        });
        frame.add(checkBox4);

        JCheckBox checkBox5 = new JCheckBox();
        checkBox5.setBounds(65, 507, 150, 80);
        checkBox5.setFocusable(false);
        checkBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CMP = 2.0;
                System.out.println(getCMP());
            }
        });
        frame.add(checkBox5);

        JCheckBox checkBox6 = new JCheckBox();
        checkBox6.setBounds(65, 604, 150, 80);
        checkBox6.setFocusable(false);
        checkBox6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CMP = 2.4;
                System.out.println(getCMP());
            }
        });
        frame.add(checkBox6);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(checkBox1);
        buttonGroup.add(checkBox2);
        buttonGroup.add(checkBox3);
        buttonGroup.add(checkBox4);
        buttonGroup.add(checkBox5);
        buttonGroup.add(checkBox6);

        JButton button = new JButton("Oblicz");
        button.setFont(new Font("Osward", Font.BOLD, 28));
        button.setBounds(950, 680, 150, 80);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== button){
                    new BMIandKCALFrame();
                    frame.dispose();
                }
            }
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
