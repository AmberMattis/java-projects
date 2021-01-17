package TicTacToe2;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel =  new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;


    TicTacToe(){
        //Building tic tac toe board
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //sets the size of the tic tac toe board
        frame.setSize(800,800);

        //sets the color of the tic tac toe board
        frame.getContentPane().setBackground(Color.BLACK);

        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(Color.black);
        textfield.setForeground(Color.pink);
        textfield.setFont(new Font("Ink Free", Font.BOLD,75));
        textfield.setText((" X --  Tic-Tac-Toe -- O"));
        textfield.setOpaque(true);

        //Title//

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(Color.black);

        //Buttons 1-9

        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();











    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Auto generate maethod
    }

    public void firstTurn() {

        //Randomly generate the first X or O as the fist player
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if(random.nextInt(2) == 0){
            player1_turn = true;
            textfield.setText("X     -- Player X --      X");

        } else {
            player1_turn = false;
            textfield.setText("O     -- Player O --      O");
        }

    }

    public void check(){


    }

    public void winnnerX(int a, int b, int c){

    }

    public void winnnerO(int a, int b, int c){

    }
}

