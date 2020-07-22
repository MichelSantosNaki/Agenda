package ui;

import Business.ContactBusiness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonSave;
    private JButton ButtonCancel;
    private ContactBusiness mcontactBusiness;

    public  ContactForm(){

        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2 ); // para começar no meio da tela

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mcontactBusiness =new ContactBusiness();

        setListeners();
    }
    //escuta para os botoês save e cancel
    private  void setListeners(){
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                   //pegar o que o usuario digitou na caixa de texto nome e telefone
                   String name = textName.getText();
                   String phone = textPhone.getText();

                   mcontactBusiness.save(name,phone);

                   new MainForm();
                   dispose();
               }catch (Exception excp){
                   JOptionPane.showMessageDialog(new JFrame(),excp.getMessage());
               }


            }
        });

        //ação ao clicar no botão cancelar
        ButtonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });
    }


}
