package com.lambo.org;

import com.sun.net.httpserver.Authenticator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenFactory {

    OpenFactory(){
        JFrame f=new JFrame("Open a Factory");
        JLabel l1,l2,l3,l4,l5;
        JTextField t1,t2,t3,t4,t5;

        l1=new JLabel("Factory Name");
        l1.setBounds(50,100,200,30);
        t1=new JTextField("Enter the factory name");
        t1.setBounds(180,100,200,30);

        l2=new JLabel("City Name");
        l2.setBounds(50,150,200,30);
        t2=new JTextField("Enter the location");
        t2.setBounds(180,150, 200,30);

        l3=new JLabel("Average wage");
        l3.setBounds(50,200,200,30);
        t3=new JTextField("Enter the wage per worker");
        t3.setBounds(180,200, 200,30);

        l4=new JLabel("No.of.workers");
        l4.setBounds(50,250,200,30);
        t4=new JTextField("Enter the total");
        t4.setBounds(180,250, 200,30);

        l5=new JLabel("No.of.stores supplied");
        l5.setBounds(50,300,200,30);
        t5=new JTextField("Enter the total");
        t5.setBounds(180,300, 200,30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);

        JButton bback=new JButton("Back");
        bback.setBounds(185,400,100, 40);
        f.add(bback);
        JButton bdone=new JButton("Done");
        bdone.setBounds(50,400,100, 40);
        f.add(bdone);


        //JLabel background;
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //ImageIcon img=new ImageIcon("C:\\Users\\BALAG\\Desktop\\1.jfif");
        //background=new JLabel("",img,JLabel.CENTER);
        //background.setBounds(-100,-100,1200,700);
        //f.add(background);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(bback);
        f.getContentPane().add(bdone);
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);

        bback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new UI();
            }
        });
        bdone.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                String factoryname = t1.getText();
                String cityname    = t2.getText();
                Double avgwage     = Double.parseDouble(t3.getText());
                int workers        = Integer.parseInt(t4.getText());
                int stores         = Integer.parseInt(t5.getText());

                new Repository().writedata(factoryname,cityname,avgwage,workers,stores);
                new SucessPrompt();
            }
        });

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
    }
}
