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
            buttons[i].setOpaque(true);
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

        for( int i = 0; i < 9; i++){
            if(e.getSource()==buttons[i]) {
                if (player1_turn){
                    if(buttons[i].getText() ==""){
                        buttons[i].setForeground(Color.blue);
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("Player O");
                        check();
                    }
            }else{
                    if(buttons[i].getText() =="") {
                        buttons[i].setForeground(Color.MAGENTA);
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("Player X");
                        check();

                    }
                }
            }
        }
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
        if(
                (buttons[0].getText()=="X")&&
                (buttons[1].getText()=="X")&&
                (buttons[2].getText()=="X")
                ) {
            winnerX(0,1,2);
        }

        if(
                (buttons[0].getText()=="X")&&
                (buttons[3].getText()=="X")&&
                (buttons[6].getText()=="X")
                ) {
            winnerX(0,3,6);
        }

        if(
                (buttons[1].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[7].getText()=="X")
        ) {
            winnerX(1,4,7);
        }

        if(
                (buttons[2].getText()=="X")&&
                (buttons[5].getText()=="X")&&
                (buttons[8].getText()=="X")
        ) {
            winnerX(2,5,8);
        }

        if(
                (buttons[3].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[5].getText()=="X")
        ) {
            winnerX(3,4,5);
        }

        if(
                (buttons[6].getText()=="X")&&
                (buttons[7].getText()=="X")&&
                (buttons[8].getText()=="X")
        ) {
            winnerX(6,7,8);
        }

        if(
                (buttons[0].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[8].getText()=="X")
        ) {
            winnerX(0,4,8);
        }

        if(
                (buttons[2].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[6].getText()=="X")
        ) {
            winnerX(2,4,6);
        }


        //checking for o condition


        if(
                (buttons[0].getText()=="O")&&
                (buttons[1].getText()=="O")&&
                (buttons[2].getText()=="O")
        ) {
            winnerO(0,1,2);
        }

        if(
                (buttons[0].getText()=="O")&&
                (buttons[3].getText()=="O")&&
                (buttons[6].getText()=="O")
        ) {
            winnerO(0,3,6);
        }

        if(
                (buttons[1].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[7].getText()=="O")
        ) {
            winnerO(1,4,7);
        }

        if(
                (buttons[2].getText()=="O")&&
                (buttons[5].getText()=="O")&&
                (buttons[8].getText()=="O")
        ) {
            winnerO(2,5,8);
        }

        if(
                (buttons[3].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[5].getText()=="O")
        ) {
            winnerO(3,4,5);
        }

        if(
                (buttons[6].getText()=="O")&&
                (buttons[7].getText()=="O")&&
                (buttons[8].getText()=="O")
        ) {
            winnerO(6,7,8);
        }

        if(
                (buttons[0].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[8].getText()=="O")
        ) {
            winnerO(0,4,8);
        }

        if(
                (buttons[2].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[6].getText()=="O")
        ) {
            winnerO(2,4,6);
        }

    }

    public void winnerX(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[a].setOpaque(true);
        buttons[b].setBackground(Color.GREEN);
        buttons[b].setOpaque(true);
        buttons[c].setBackground(Color.GREEN);
        buttons[c].setOpaque(true);

        //disable buttons

        for(int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }

        textfield.setText("X...You're a Winner!!!");

    }



    public void winnerO(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[a].setOpaque(true);
        buttons[b].setBackground(Color.GREEN);
        buttons[b].setOpaque(true);
        buttons[c].setBackground(Color.GREEN);
        buttons[c].setOpaque(true);


        //disable buttons

        for(int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }

        textfield.setText("O...You're a Winner!!!");

    }
}

