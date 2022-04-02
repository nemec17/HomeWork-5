package eight.Lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    int count = 0;

    public App() {
        setBounds(300, 300, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter");
        setResizable(false);

        JLabel counter = new JLabel("0");
        JButton leftbutton = new JButton(">");
        JButton rightbutton = new JButton("<");

        Font font = new Font("Arial", Font.BOLD, 32);

        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);

        leftbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        rightbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));
            }
        });

        add(leftbutton, BorderLayout.WEST);
        add(rightbutton, BorderLayout.EAST);
        add(counter, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }

}
