package com.tkdev.testhub;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changelog extends JFrame{
    static JFrame frame;
    private JButton closeButton;
    private JPanel changelogPanel;

    public changelog(String title) {
        super(title);
        this.setContentPane(changelogPanel);
        this.setAlwaysOnTop(true);
        this.setUndecorated(true);
        this.pack();

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
    public static void main() {

        frame = new changelog("changelog");
        frame.setSize(200,250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setMinimumSize(frame.getSize());
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
