package ui;

import javax.swing.*;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonSave;
    private JButton ButtonCancel;

    public  ContactForm(){

        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);
    }


}
