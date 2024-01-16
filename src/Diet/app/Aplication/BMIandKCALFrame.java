package Diet.app.Aplication;

import javax.swing.*;
import java.awt.*;

public class BMIandKCALFrame extends JFrame {
    JFrame frame = new JFrame();
     BMIandKCALFrame(){
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

         JLabel text = new JLabel("Oto twoje wyniki:");
         text.setFont(new Font("Osward", Font.BOLD, 48));
         text.setBounds(50, 10, 800, 100);
         frame.add(text);

         JLabel BMI = new JLabel("BMI: " + Calculations.BMIResult(DietFrame.getDoubleWeightField(), DietFrame.getDoubleHeightField()));
         BMI.setFont(new Font("Osward", Font.BOLD, 38));
         BMI.setBounds(50, 120, 800, 100);
         frame.add(BMI);

         JLabel KCAL = new JLabel("Zapotrzebowanie energetyczne: " + Calculations.KCALResult(DietFrame.getStringGenderField(),
                                 DietFrame.getDoubleAgeField(),DietFrame.getDoubleWeightField(), DietFrame.getDoubleHeightField()) + " kcal.");
         KCAL.setFont(new Font("Osward", Font.BOLD, 38));
         KCAL.setBounds(50, 280, 800, 100);
         frame.add(KCAL);

         JLabel NormsOfBMI = new JLabel("Twoje BMI jest "+ Calculations.BMINormsResultsVoid());
         NormsOfBMI.setFont(new Font("Osward", Font.BOLD, 30));
         NormsOfBMI.setBounds(50, 160, 1200, 100);
         frame.add(NormsOfBMI);

    }
}
