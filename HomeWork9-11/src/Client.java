import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client{
    private JFrame clientFrame;
    private JLabel IPLabel;
    private JLabel PortLabel;
    private JLabel sayLabel;
    private JLabel nicknameLabel;
    private JTextField IPText;
    private JTextField PortText;
    private JTextField nicknameText;
    private JTextField sayText;
    private JButton connectButton;
    private JButton nicknameButton;
    private JButton sayButton;
    private JPanel jPanelNorth;
    private JPanel jPanelSouth0;
    private JPanel jPanelSouth1;
    private JPanel jPanelSouth2;
    private JTextArea clientTextArea;
    private JScrollPane scroller;
    private BufferedReader reader;
    private PrintWriter writer;
    private String nickname;

    public Client()
    {
        nickname = "Gemini-Lin";

        clientFrame = new JFrame();
        jPanelNorth = new JPanel();
        IPLabel = new JLabel("ServerIP",JLabel.LEFT);
        IPText = new JTextField(10);
        PortLabel = new JLabel("ServerPort",JLabel.LEFT);
        PortText = new JTextField(10);
        connectButton = new JButton("Connect");
        clientTextArea = new JTextArea();
        scroller = new JScrollPane(clientTextArea);
        jPanelSouth0 = new JPanel();
        jPanelSouth1 = new JPanel();
        jPanelSouth2 = new JPanel();
        nicknameLabel = new JLabel("Nickname",JLabel.LEFT);
        nicknameText = new JTextField(nickname,30);
        nicknameButton = new JButton("Confirm");
        sayLabel = new JLabel("Message",JLabel.LEFT);
        sayText = new JTextField(30);
        sayButton = new JButton("Confirm");
    }

    private void buildGUI()
    {
        clientFrame.setTitle("Client");
        clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientFrame.setSize(600,600);

        jPanelNorth.add(IPLabel);
        jPanelNorth.add(IPText);
        jPanelNorth.add(PortLabel);
        jPanelNorth.add(PortText);
        jPanelNorth.add(connectButton);
        clientFrame.getContentPane().add(BorderLayout.NORTH,jPanelNorth);

        clientTextArea.setFocusable(false);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        clientFrame.getContentPane().add(BorderLayout.CENTER,scroller);

        jPanelSouth1.add(nicknameLabel);
        jPanelSouth1.add(nicknameText);
        jPanelSouth1.add(nicknameButton);
        jPanelSouth2.add(sayLabel);
        jPanelSouth2.add(sayText);
        jPanelSouth2.add(sayButton);
        jPanelSouth0.setLayout(new BoxLayout(jPanelSouth0, BoxLayout.Y_AXIS));
        jPanelSouth0.add(jPanelSouth1);
        jPanelSouth0.add(jPanelSouth2);
        clientFrame.getContentPane().add(BorderLayout.SOUTH, jPanelSouth0);

        clientFrame.setVisible(true);
    }

    public void startUP() {
        buildGUI();

        Runnable incomingReader = new Runnable() {
            @Override
            public void run() {
                String message;
                try {
                    while ((message = reader.readLine()) != null) {
                        clientTextArea.append(message + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String aServerIP = IPText.getText();
                String aServerPort = PortText.getText();

                if (aServerIP.equals("") || aServerPort.equals("")) {
                    JOptionPane.showMessageDialog(clientFrame, "Please enter complete IP and Port!");
                } else {
                    try {
                        @SuppressWarnings("resource")
                        Socket clientSocket = new Socket(aServerIP, Integer.parseInt(aServerPort));
                        InputStreamReader streamReader = new InputStreamReader(clientSocket.getInputStream());
                        reader = new BufferedReader(streamReader);
                        writer = new PrintWriter(clientSocket.getOutputStream());

                        clientTextArea.append("The server is connected...\n");

                        Thread readThread = new Thread(incomingReader);
                        readThread.start();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(clientFrame, "Can't connect to the server!\nPlease make sure the IP and Port are entered correctly.");
                    }
                }
            }
        });

        ActionListener nicknameListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String aText = nicknameText.getText();
                if (!aText.equals("")) {
                    nickname = aText;
                }
            }
        };
        nicknameButton.addActionListener(nicknameListener);
        nicknameText.addActionListener(nicknameListener);
        nicknameText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                String aText = nicknameText.getText();
                if (!aText.equals("")) {
                    nickname = aText;
                }
            }
        });

        ActionListener SayListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String aText = sayText.getText();
                if (aText.equals("")) {
                    JOptionPane.showMessageDialog(clientFrame, "the content can not be blank!");
                } else {
                    try {
                        writer.println(nickname + ":" + aText);
                        writer.flush();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    sayText.setText("");
                }
            }
        };
        sayButton.addActionListener(SayListener);
        sayText.addActionListener(SayListener);
    }

    public static void main(String args[])
    {
        Client C = new Client();
        C.startUP();
    }

}