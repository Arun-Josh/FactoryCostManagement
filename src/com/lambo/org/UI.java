package com.lambo.org;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

    JFrame frame = new JFrame("Factory Management");
    JLabel welcome = new JLabel("Welcome to Factory Management");
    JButton openbutton    = new JButton("Open a Factory");
    JButton closebutton   = new JButton("Close a Factory");
    JButton modifybutton   = new JButton("Modify Details");

    UI(){

//        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        openbutton.setBounds(200,200,200,50);
        closebutton.setBounds(400,200,200,50);
        modifybutton.setBounds(600,200,200,50);
        welcome.setBounds(400,100,200,50);

        frame.add(welcome);
        frame.add(openbutton);
        frame.add(closebutton);
        frame.add(modifybutton);

        frame.setSize(1000,500);
        frame.setLayout(null);
        frame.setVisible(true);

        openbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new OpenFactory();
            }
        });
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }

}
