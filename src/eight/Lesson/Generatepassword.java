package eight.Lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Generatepassword extends JFrame {

    public Generatepassword() {

        setBounds(300, 300, 450, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generation");
        setResizable(false);

        JButton jButton = new JButton("Генерировать пароль");
        JTextField jTextField = new JTextField();

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                String[] popularPassword = {"Nemec", "Lex", "password", "314159265"};
                String result = "";

                result = popularPassword[random.nextInt(4)];
                result += random.nextInt(89) + 10; // 0 -> 90; 0+10 -> 90+10

                jTextField.setText(result);
            }
        });

        add(jButton, BorderLayout.NORTH);
        add(jTextField, BorderLayout.CENTER);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Generatepassword();

    }

}
