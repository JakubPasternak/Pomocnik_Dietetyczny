package Diet.app.Aplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DietFrame extends JFrame {

    JTextField genderField, weightField, heightField, ageField;
    public static String stringGenderField;
    public static Double doubleWeightField, doubleHeightField, doubleAgeField;

    public static String getStringGenderField() {
        return stringGenderField;
    }

    public static Double getDoubleWeightField() {
        return doubleWeightField;
    }

    public static Double getDoubleHeightField() {
        return doubleHeightField;
    }

    public static Double getDoubleAgeField() {
        return doubleAgeField;
    }

    DietFrame(){
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Pomocnik Dietetyczny");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String imagepath = "src/LOGO.jpg";
        ImageIcon imageIcon = new ImageIcon(imagepath);
        JLabel imageJLabel = new JLabel(imageIcon);
        imageJLabel.setBounds(0, 500, 1200, 250);
        frame.add(imageJLabel);
        frame.getContentPane().setBackground(Color.white);



        JLabel text = new JLabel("Proszę wypełnić poniższe dane:");
        text.setFont(new Font("Osward", Font.BOLD, 48));
        text.setBounds(50, 10, 800, 100);
        frame.add(text);

        JLabel gender = new JLabel("Płeć:");
        gender.setFont(new Font("Osward", Font.BOLD, 38));
        gender.setBounds(50, 120, 800, 100);
        frame.add(gender);
        JLabel genderLOW = new JLabel("(kobieta/mężczyzna)");
        genderLOW.setFont(new Font("Osward", Font.ROMAN_BASELINE, 17));
        genderLOW.setBounds(60, 150, 800, 100);
        frame.add(genderLOW);
        genderField = new JTextField();
        genderField.setFont(new Font("Osward", Font.ROMAN_BASELINE, 30));
        genderField.setBounds(145, 132, 200, 60);

        genderField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stringGenderField = genderField.getText();
                System.out.println(stringGenderField);
            }
        });
        frame.add(genderField);

        JLabel weight = new JLabel("Waga (kg):");
        weight.setFont(new Font("Osward", Font.BOLD, 38));
        weight.setBounds(50, 190, 800, 100);
        frame.add(weight);
        weightField = new JTextField();
        weightField.setFont(new Font("Osward", Font.ROMAN_BASELINE, 30));
        weightField.setBounds(247, 208, 200, 60);
        weightField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doubleWeightField = Double.parseDouble(weightField.getText());
                System.out.println(doubleWeightField);
            }
        });
        frame.add(weightField);

        JLabel height = new JLabel("Wzrost (cm):");
        height.setFont(new Font("Osward", Font.BOLD, 38));
        height.setBounds(50, 280, 800, 100);
        frame.add(height);
        heightField = new JTextField();
        heightField.setFont(new Font("Osward", Font.ROMAN_BASELINE, 30));
        heightField.setBounds(282, 295, 200, 60);
        heightField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doubleHeightField = Double.parseDouble(heightField.getText());
                System.out.println(doubleHeightField);
            }
        });
        frame.add(heightField);

        JLabel age = new JLabel("Wiek:");
        age.setFont(new Font("Osward", Font.BOLD, 38));
        age.setBounds(50, 370, 800, 100);
        frame.add(age);
        ageField = new JTextField();
        ageField.setFont(new Font("Osward", Font.ROMAN_BASELINE, 30));
        ageField.setBounds(155, 387, 200, 60);
        ageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doubleAgeField = Double.parseDouble(ageField.getText());
                System.out.println(doubleAgeField);
            }
        });
        frame.add(ageField);


        JLabel reminder = new JLabel("(Pamiętaj kliknąć ENTER w każdej rubryce, inaczej będzie wyskakiwał błąd)");
        reminder.setFont(new Font("Osward", Font.ROMAN_BASELINE, 15));
        reminder.setBounds(500, 420, 800, 100);
        frame.add(reminder);

        JButton button = new JButton("Oblicz");
        button.setFont(new Font("Osward", Font.BOLD, 28));
        button.setBounds(550, 370, 150, 80);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button && stringGenderField != null &&  doubleWeightField != null
                        && doubleHeightField != null &&  doubleAgeField != null){

                    new BMIandKCALFrame();

                    frame.dispose();;
                }else if(e.getSource()==button && stringGenderField == null ||  doubleWeightField == null
                        || doubleHeightField == null ||  doubleAgeField == null) {
                    JOptionPane.showMessageDialog(null,
                            "Nie wypełniłeś wszystkich wymaganych pól!", "Uwaga!", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        frame.add(button);










        frame.setVisible(true);

    }


}
