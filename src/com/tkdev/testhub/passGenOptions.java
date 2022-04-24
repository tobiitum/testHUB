package com.tkdev.testhub;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class passGenOptions extends JFrame{
    static JFrame frame;
    private JPanel optionsPanel;
    private JButton doneButton;
    private JCheckBox aCheckBox;
    private JCheckBox bCheckBox;
    private JCheckBox cCheckBox;
    private JCheckBox ausrufeCheckBox;
    private JButton selectAllButton;
    private JButton unselectAllButton;
    private JCheckBox dCheckBox;
    private JCheckBox questionCheckBox;
    private JCheckBox zCheckBox;
    private JCheckBox yCheckBox;
    private JCheckBox xCheckBox;
    private JCheckBox wCheckBox;
    private JCheckBox vCheckBox;
    private JCheckBox uCheckBox;
    private JCheckBox tCheckBox;
    private JCheckBox sCheckBox;
    private JCheckBox rCheckBox;
    private JCheckBox qCheckBox;
    private JCheckBox pCheckBox;
    private JCheckBox oCheckBox;
    private JCheckBox nCheckBox;
    private JCheckBox mCheckBox;
    private JCheckBox lCheckBox;
    private JCheckBox kCheckBox;
    private JCheckBox jCheckBox;
    private JCheckBox iCheckBox;
    private JCheckBox hCheckBox;
    private JCheckBox gCheckBox;
    private JCheckBox fCheckBox;
    private JCheckBox eCheckBox;
    private JCheckBox kommaCheckBox;
    private JCheckBox dotCheckBox;
    private JCheckBox minusCheckBox;


    public passGenOptions(String title){
        super(title);
        this.setContentPane(optionsPanel);
        this.setAlwaysOnTop(true);
        this.setUndecorated(true);
        this.pack();
        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    if (aCheckBox.isSelected() && !passGen.alphabetArray.contains("a")) {
                        passGen.alphabetArray.add("a");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!aCheckBox.isSelected() && passGen.alphabetArray.contains("a")) {
                        passGen.alphabetArray.remove("a");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (bCheckBox.isSelected() && !passGen.alphabetArray.contains("b")) {
                        passGen.alphabetArray.add("b");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!bCheckBox.isSelected() && passGen.alphabetArray.contains("b")) {
                        passGen.alphabetArray.remove("b");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (cCheckBox.isSelected() && !passGen.alphabetArray.contains("c")) {
                        passGen.alphabetArray.add("c");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!cCheckBox.isSelected() && passGen.alphabetArray.contains("c")) {
                        passGen.alphabetArray.remove("c");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (dCheckBox.isSelected() && !passGen.alphabetArray.contains("d")) {
                        passGen.alphabetArray.add("d");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!dCheckBox.isSelected() && passGen.alphabetArray.contains("d")) {
                        passGen.alphabetArray.remove("d");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (eCheckBox.isSelected() && !passGen.alphabetArray.contains("e")) {
                        passGen.alphabetArray.add("e");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!eCheckBox.isSelected() && passGen.alphabetArray.contains("e")) {
                        passGen.alphabetArray.remove("e");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (fCheckBox.isSelected() && !passGen.alphabetArray.contains("f")) {
                        passGen.alphabetArray.add("f");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!fCheckBox.isSelected() && passGen.alphabetArray.contains("f")) {
                        passGen.alphabetArray.remove("f");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (gCheckBox.isSelected() && !passGen.alphabetArray.contains("g")) {
                        passGen.alphabetArray.add("g");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!gCheckBox.isSelected() && passGen.alphabetArray.contains("g")) {
                        passGen.alphabetArray.remove("g");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (hCheckBox.isSelected() && !passGen.alphabetArray.contains("h")) {
                        passGen.alphabetArray.add("h");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!hCheckBox.isSelected() && passGen.alphabetArray.contains("h")) {
                        passGen.alphabetArray.remove("h");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (iCheckBox.isSelected() && !passGen.alphabetArray.contains("i")) {
                        passGen.alphabetArray.add("i");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!iCheckBox.isSelected() && passGen.alphabetArray.contains("i")) {
                        passGen.alphabetArray.remove("i");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (jCheckBox.isSelected() && !passGen.alphabetArray.contains("j")) {
                        passGen.alphabetArray.add("j");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!jCheckBox.isSelected() && passGen.alphabetArray.contains("j")) {
                        passGen.alphabetArray.remove("j");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (kCheckBox.isSelected() && !passGen.alphabetArray.contains("k")) {
                        passGen.alphabetArray.add("k");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!kCheckBox.isSelected() && passGen.alphabetArray.contains("k")) {
                        passGen.alphabetArray.remove("k");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (lCheckBox.isSelected() && !passGen.alphabetArray.contains("l")) {
                        passGen.alphabetArray.add("l");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!lCheckBox.isSelected() && passGen.alphabetArray.contains("l")) {
                        passGen.alphabetArray.remove("l");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (mCheckBox.isSelected() && !passGen.alphabetArray.contains("m")) {
                        passGen.alphabetArray.add("m");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!mCheckBox.isSelected() && passGen.alphabetArray.contains("m")) {
                        passGen.alphabetArray.remove("m");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (nCheckBox.isSelected() && !passGen.alphabetArray.contains("n")) {
                        passGen.alphabetArray.add("n");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!nCheckBox.isSelected() && passGen.alphabetArray.contains("n")) {
                        passGen.alphabetArray.remove("n");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (oCheckBox.isSelected() && !passGen.alphabetArray.contains("o")) {
                        passGen.alphabetArray.add("o");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!oCheckBox.isSelected() && passGen.alphabetArray.contains("o")) {
                        passGen.alphabetArray.remove("o");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (pCheckBox.isSelected() && !passGen.alphabetArray.contains("p")) {
                        passGen.alphabetArray.add("p");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!pCheckBox.isSelected() && passGen.alphabetArray.contains("p")) {
                        passGen.alphabetArray.remove("p");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (qCheckBox.isSelected() && !passGen.alphabetArray.contains("q")) {
                        passGen.alphabetArray.add("q");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!qCheckBox.isSelected() && passGen.alphabetArray.contains("q")) {
                        passGen.alphabetArray.remove("q");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (rCheckBox.isSelected() && !passGen.alphabetArray.contains("r")) {
                        passGen.alphabetArray.add("r");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!rCheckBox.isSelected() && passGen.alphabetArray.contains("r")) {
                        passGen.alphabetArray.remove("r");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (sCheckBox.isSelected() && !passGen.alphabetArray.contains("s")) {
                        passGen.alphabetArray.add("s");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!sCheckBox.isSelected() && passGen.alphabetArray.contains("s")) {
                        passGen.alphabetArray.remove("s");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (tCheckBox.isSelected() && !passGen.alphabetArray.contains("t")) {
                        passGen.alphabetArray.add("t");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!tCheckBox.isSelected() && passGen.alphabetArray.contains("t")) {
                        passGen.alphabetArray.remove("t");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (uCheckBox.isSelected() && !passGen.alphabetArray.contains("u")) {
                        passGen.alphabetArray.add("u");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!uCheckBox.isSelected() && passGen.alphabetArray.contains("u")) {
                        passGen.alphabetArray.remove("u");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (vCheckBox.isSelected() && !passGen.alphabetArray.contains("v")) {
                        passGen.alphabetArray.add("v");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!vCheckBox.isSelected() && passGen.alphabetArray.contains("v")) {
                        passGen.alphabetArray.remove("v");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (wCheckBox.isSelected() && !passGen.alphabetArray.contains("w")) {
                        passGen.alphabetArray.add("w");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!wCheckBox.isSelected() && passGen.alphabetArray.contains("w")) {
                        passGen.alphabetArray.remove("w");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (xCheckBox.isSelected() && !passGen.alphabetArray.contains("x")) {
                        passGen.alphabetArray.add("x");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!xCheckBox.isSelected() && passGen.alphabetArray.contains("x")) {
                        passGen.alphabetArray.remove("x");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (yCheckBox.isSelected() && !passGen.alphabetArray.contains("y")) {
                        passGen.alphabetArray.add("y");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!yCheckBox.isSelected() && passGen.alphabetArray.contains("y")) {
                        passGen.alphabetArray.remove("y");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (zCheckBox.isSelected() && !passGen.alphabetArray.contains("z")) {
                        passGen.alphabetArray.add("z");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!zCheckBox.isSelected() && passGen.alphabetArray.contains("z")) {
                        passGen.alphabetArray.remove("z");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (kommaCheckBox.isSelected() && !passGen.alphabetArray.contains(",")) {
                        passGen.alphabetArray.add(",");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!kommaCheckBox.isSelected() && passGen.alphabetArray.contains(",")) {
                        passGen.alphabetArray.remove(",");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (dotCheckBox.isSelected() && !passGen.alphabetArray.contains(".")) {
                        passGen.alphabetArray.add(".");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!dotCheckBox.isSelected() && passGen.alphabetArray.contains(".")) {
                        passGen.alphabetArray.remove(".");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (minusCheckBox.isSelected() && !passGen.alphabetArray.contains("-")) {
                        passGen.alphabetArray.add("-");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!minusCheckBox.isSelected() && passGen.alphabetArray.contains("-")) {
                        passGen.alphabetArray.remove("-");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (questionCheckBox.isSelected() && !passGen.alphabetArray.contains("?")) {
                        passGen.alphabetArray.add("?");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!questionCheckBox.isSelected() && passGen.alphabetArray.contains("?")) {
                        passGen.alphabetArray.remove("?");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                    if (ausrufeCheckBox.isSelected() && !passGen.alphabetArray.contains("!")) {
                        passGen.alphabetArray.add("!");
                        randomNum.upperbound = randomNum.upperbound + 1;
                    }
                    if (!ausrufeCheckBox.isSelected() && passGen.alphabetArray.contains("!")) {
                        passGen.alphabetArray.remove("!");
                        randomNum.upperbound = randomNum.upperbound - 1;
                    }
                if (passGen.alphabetArray.isEmpty()){
                    JOptionPane.showMessageDialog(frame,
                            "At least one character must be selected!",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);

                }
                else{
                    frame.setVisible(false);
                    MainFrame.frame.setFocusable(true);
                }

            }
        });
        selectAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aCheckBox.setSelected(true);
                bCheckBox.setSelected(true);
                cCheckBox.setSelected(true);
                dCheckBox.setSelected(true);
                eCheckBox.setSelected(true);
                fCheckBox.setSelected(true);
                gCheckBox.setSelected(true);
                hCheckBox.setSelected(true);
                iCheckBox.setSelected(true);
                jCheckBox.setSelected(true);
                kCheckBox.setSelected(true);
                lCheckBox.setSelected(true);
                mCheckBox.setSelected(true);
                nCheckBox.setSelected(true);
                oCheckBox.setSelected(true);
                pCheckBox.setSelected(true);
                qCheckBox.setSelected(true);
                rCheckBox.setSelected(true);
                sCheckBox.setSelected(true);
                tCheckBox.setSelected(true);
                uCheckBox.setSelected(true);
                vCheckBox.setSelected(true);
                wCheckBox.setSelected(true);
                xCheckBox.setSelected(true);
                yCheckBox.setSelected(true);
                zCheckBox.setSelected(true);
                questionCheckBox.setSelected(true);
                ausrufeCheckBox.setSelected(true);
                minusCheckBox.setSelected(true);
                kommaCheckBox.setSelected(true);
                dotCheckBox.setSelected(true);
            }
        });
        unselectAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aCheckBox.setSelected(false);
                bCheckBox.setSelected(false);
                cCheckBox.setSelected(false);
                dCheckBox.setSelected(false);
                eCheckBox.setSelected(false);
                fCheckBox.setSelected(false);
                gCheckBox.setSelected(false);
                hCheckBox.setSelected(false);
                iCheckBox.setSelected(false);
                jCheckBox.setSelected(false);
                kCheckBox.setSelected(false);
                lCheckBox.setSelected(false);
                mCheckBox.setSelected(false);
                nCheckBox.setSelected(false);
                oCheckBox.setSelected(false);
                pCheckBox.setSelected(false);
                qCheckBox.setSelected(false);
                rCheckBox.setSelected(false);
                sCheckBox.setSelected(false);
                tCheckBox.setSelected(false);
                uCheckBox.setSelected(false);
                vCheckBox.setSelected(false);
                wCheckBox.setSelected(false);
                xCheckBox.setSelected(false);
                yCheckBox.setSelected(false);
                zCheckBox.setSelected(false);
                questionCheckBox.setSelected(false);
                ausrufeCheckBox.setSelected(false);
                minusCheckBox.setSelected(false);
                kommaCheckBox.setSelected(false);
                dotCheckBox.setSelected(false);
            }
        });
    }

    public static void main() {

        frame = new passGenOptions("Options");
        frame.setSize(350,250);
        frame.setResizable(false);
        frame.setMinimumSize(frame.getSize());
        frame.setLocationRelativeTo(null);
        //frame.setVisible(true);

    }


}
