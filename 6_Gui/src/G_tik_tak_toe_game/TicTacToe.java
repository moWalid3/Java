package G_tik_tak_toe_game;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel textPanel = new JPanel();
    JPanel btnPanels = new JPanel();
    JLabel textLabel = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1Turn;

    public TicTacToe() {
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tic Tac Toe Game.");
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textLabel.setForeground(new Color(0xe5dada));
        textLabel.setBackground(new Color(0x02040f));
        textLabel.setOpaque(true);
        textLabel.setFont(new Font("ROBOTO", Font.BOLD, 40));
        textLabel.setText("Tik tak toe");
        textLabel.setHorizontalAlignment(JLabel.CENTER);

        textPanel.setBounds(0, 0, 500, 100);
        textPanel.setLayout(new BorderLayout());

        btnPanels.setLayout(new GridLayout(3, 3));
        btnPanels.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            btnPanels.add(buttons[i]);
            buttons[i].setFont(new Font("Open Sans", Font.BOLD, 70));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(0xe5dada));
        }

        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);
        frame.add(btnPanels);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1Turn) {
                    if (buttons[i].getText().isEmpty()) {
                        buttons[i].setText("X");
                        buttons[i].setForeground(new Color(0xe59500));
                        player1Turn = false;
                        textLabel.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText().isEmpty()) {
                        buttons[i].setText("O");
                        buttons[i].setForeground(new Color(0x840032));
                        player1Turn = true;
                        textLabel.setText("X turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO auto-generated catch block
            e.printStackTrace();
        }
        if (random.nextInt(2) == 0) {
            player1Turn = true;
            textLabel.setText("X turn");
        } else {
            player1Turn = false;
            textLabel.setText("O turn");
        }
    }

    public void check() {
        if (buttons[0].getText().equals("X") && buttons[1].getText().equals("X") && buttons[2].getText().equals("X")) {
            xWins(0, 1, 2);
        } else if (buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X")) {
            xWins(3, 4, 5);
        } else if (buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWins(6, 7, 8);
        } else if (buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")) {
            xWins(0, 3, 6);
        } else if (buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")) {
            xWins(1, 4, 7);
        } else if (buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWins(2, 5, 8);
        } else if (buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWins(0, 4, 8);
        } else if (buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X")) {
            xWins(2, 5, 8);
        }
        // O - checker
        if (buttons[0].getText().equals("O") && buttons[1].getText().equals("O") && buttons[2].getText().equals("O")) {
            oWins(0, 1, 2);
        } else if (buttons[3].getText().equals("O") && buttons[4].getText().equals("O") && buttons[5].getText().equals("O")) {
            oWins(3, 4, 5);
        } else if (buttons[6].getText().equals("O") && buttons[7].getText().equals("O") && buttons[8].getText().equals("O")) {
            oWins(6, 7, 8);
        } else if (buttons[0].getText().equals("O") && buttons[3].getText().equals("O") && buttons[6].getText().equals("O")) {
            oWins(0, 3, 6);
        } else if (buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("O")) {
            oWins(1, 4, 7);
        } else if (buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("O")) {
            oWins(2, 5, 8);
        } else if (buttons[0].getText().equals("O") && buttons[4].getText().equals("O") && buttons[8].getText().equals("O")) {
            oWins(0, 4, 8);
        } else if (buttons[2].getText().equals("O") && buttons[4].getText().equals("O") && buttons[6].getText().equals("O")) {
            oWins(2, 5, 8);
        }
    }

    public void xWins(int x, int y, int z) {
        buttons[x].setBackground(Color.green.darker());
        buttons[y].setBackground(Color.green.darker());
        buttons[z].setBackground(Color.green.darker());
        textLabel.setText("X wins");
        buttonsNotEnabled();
    }

    public void oWins(int x, int y, int z) {
        buttons[x].setBackground(Color.green.darker());
        buttons[y].setBackground(Color.green.darker());
        buttons[z].setBackground(Color.green.darker());
        textLabel.setText("O wins");
        buttonsNotEnabled();
    }

    public void buttonsNotEnabled() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
    }
}