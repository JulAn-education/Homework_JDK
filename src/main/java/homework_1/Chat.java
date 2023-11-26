package homework_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Создать окно клиента чата. Окно должно содержать JtextField для ввода логина,
пароля, IP-адреса сервера, порта подключения к серверу, область ввода сообщений,
JTextArea область просмотра сообщений чата и JButton подключения к серверу и отправки
сообщения в чат. Желательно сразу сгруппировать компоненты, относящиеся к серверу
сгруппировать на JPanel сверху экрана, а компоненты, относящиеся к отправке сообщения
 – на JPanel снизу
 */

public class Chat extends JFrame {
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDHT = 750;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    private static final File file = new File("Chat.txt");


    private static final Logger LOG = Log.log(Chat.class.getName());
    JButton btnSend = new JButton("Отправить");
    JLabel lblLogin = new JLabel("Login: ");
    JLabel lblPassword = new JLabel("Password: ");
    JLabel lblIP = new JLabel("IP: ");
    JLabel lblMessage = new JLabel("Message: ");
    JTextField txtFieldLogin = new JTextField();
    JTextField txtFieldPassword = new JTextField();
    JTextField txtFieldIP = new JTextField();
    JTextField txtFieldMessage = new JTextField();
    JTextArea areaMessage = new JTextArea();

    JPanel panServer = new JPanel(new GridLayout(6, 2));
    JPanel panClient = new JPanel(new GridLayout(4, 1));
    String login;
    String password;
    String ip;
    String message;


    Chat() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDHT, WINDOW_HEIGHT);
        setTitle("ChatWindow");
        setResizable(false);
        panServer.add(lblLogin);
        panServer.add(txtFieldLogin);
        panServer.add(lblPassword);
        panServer.add(txtFieldPassword);
        panServer.add(lblIP);
        panServer.add(txtFieldIP);
        panClient.add(lblMessage);
        panClient.add(areaMessage);
        createHistory();
        panClient.add(txtFieldMessage);
        panClient.add(btnSend);


        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                message = txtFieldLogin.getText() + ": " + txtFieldMessage.getText() + "\n";
                LOG.log(Level.INFO, message);
                writeFile(message);
                areaMessage.append(message);
                System.out.println("Отправлено сообщение: " + message);
            }
        });
        setLayout(new GridLayout(2, 1));
        add(panServer);
        add(panClient);
        setVisible(true);


    }

    public void createHistory() {
        if (file.exists()) {


        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(new File("Chat.txt")));
            String s;
            while ((s = bf.readLine()) != null) {
                areaMessage.append(s + "\n");
            }
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}


    public static void writeFile(String arg) {

        File file = new File("Chat.txt");


        try (FileWriter in = new FileWriter(file, true)) {
            in.append(arg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main (String[]args){
        new Chat();
    }

}
