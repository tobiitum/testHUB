package com.tkdev.testhub;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.net.URI;


public class MainFrame extends JFrame {
    static JFrame frame;
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JButton aboutButton;
    private JTextField lengthText;
    private JTextField passText;
    private JButton generate;
    private JButton optionsButton;
    private JButton copyButton;
    private JLabel statusLabel;
    private JButton v01Button;
    private JButton reportBugsButton;
    static ImageIcon icon;


    public static void main(){

        frame = new MainFrame("testHUB Application");
        frame.setSize(550, 400);
        icon = new ImageIcon("resources/netzwerk.png");
        frame.setResizable(false);
        frame.setMinimumSize(frame.getSize());
        frame.setLocationRelativeTo(null);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        passGenOptions.main();
    }

    public MainFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        //open the about page
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About.main();
            }
        });
        //end

        //passGen Code
        lengthText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (lengthText.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!"".equals(lengthText.getText())) {
                    int length = Integer.parseInt(lengthText.getText());
                    if (length < 21 && length > 0) {
                        passText.setText(passGen.getPass(length));
                        statusLabel.setText("Successfully generated!");
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Maximum length is 20!",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                        lengthText.setText("20");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame,
                            "No input provided (only integers)!",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    lengthText.setText("1");

                }


            }
        });
        optionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passGenOptions.frame.setVisible(true);
                frame.setFocusable(false);
            }
        });
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!"Password".equals(passText.getText())) {
                    String myString = passText.getText();
                    StringSelection stringSelection = new StringSelection(myString);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(stringSelection, null);
                    statusLabel.setText("Copied to keyboard!");
                }
                else{
                    JOptionPane.showMessageDialog(frame,
                            "Generate Password first!",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        v01Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changelog.main();
            }
        });
        reportBugsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://twkn.notion.site/Bug-2f454474a3ea45e09a43c097b4219e2c");
                    desktop.browse(oURL);
                } catch (Exception f) {
                    f.printStackTrace();
                }
            }
        });
    }


    private void createUIComponents() {

    }
}

