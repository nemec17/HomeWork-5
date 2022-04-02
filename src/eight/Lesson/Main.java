package eight.Lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {



    public Main() {
        //4 характеиристики

        setTitle("Мое первое приложение");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 600);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        setLayout(null);
        JTextField jTextField = new JTextField();
        JButton jButton = new JButton();
        JLabel jLabel = new JLabel();

        jTextField.setBounds(50, 50, 200, 50);
        jButton.setBounds(50, 110, 200, 50);
        jLabel.setBounds(50, 170, 200, 50);

        String text = "";
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               jLabel.setText(jTextField.getText() + " Hi");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("close this window");
            }
        });

                add(jTextField);
        add(jButton);
        add(jLabel);

        // setResizable(false);
        // JButton jButton1 = new JButton("button 1 B");
        // JButton jButton2 = new JButton("button 2 :P");
        // add(jButton1, BorderLayout.NORTH);
        // add(jButton2, BorderLayout.SOUTH);

        // setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        // setLayout(new FlowLayout());
        /*
        setLayout(new GridLayout(10,10));
        for (int i = 0; i < 100; i++) {
            JButton jButton =new JButton();
            jButton.setBounds(10*i, 10, 10, 10);
            add(new JButton(String.valueOf(i)));
        }

         */

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
