package ui;

import javax.swing.*;

public class MainForm extends JFrame  {
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable table1;

    public  MainForm(){

        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);
    }
}
