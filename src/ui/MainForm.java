package ui;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame  {
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable table1;

    public  MainForm(){

        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2 ); // para começar no meio da tela

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
