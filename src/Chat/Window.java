package Chat;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){

        setTitle("Мой чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,400,310);
        setResizable(false);

        //Добавляем элементы

        getContentPane().setLayout(null);


        JTextArea conversation = new JTextArea();
        conversation.setBounds(10,10,370,180);
        conversation.setEditable(false);
        JScrollPane scroll = new JScrollPane(conversation);
        add(scroll);
        add(conversation);

        JTextField msg = new JTextField();
        msg.setBounds(10,200,370,30);
        msg.setAutoscrolls(true);
        add(msg,null);

        JButton send = new JButton("Отправить");
        send.setBounds(280,240,100,20);
        add(send,null);


        //Добавление обработчиков событий

        ActionListener sendMsg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    conversation.setText(conversation.getText() + "\n" + " Вы: " + msg.getText());
                    msg.setText("");
            }
        };

        send.addActionListener(sendMsg);
        msg.addActionListener(sendMsg);


        setVisible(true);
    }

}
