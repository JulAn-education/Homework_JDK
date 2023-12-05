package homework_2.serwerRun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Server_Run extends JFrame implements Listener{
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDHT = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;


    JButton btnStart = new JButton("Start Server");
    JButton btnStop = new JButton("Stop Server");
    //boolean isServerWorking;

    ServerListener server = new Server(this);

    Server_Run(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDHT, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                server.serverListener(true);

            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.serverListener(false);
            }
        });

        setLayout(new GridLayout(1, 2));

        add(btnStart);
        add(btnStop);
        setVisible(true);
    }

    public static void main(String[] args) {

        new homework_2.serwerRun.Server_Run();
    }

    @Override
    public void messageRes(String text) {
        System.out.println(text);
    }
}
