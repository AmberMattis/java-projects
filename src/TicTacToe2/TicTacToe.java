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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(Color.BLACK);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Auto generate maethod
    }

    public void firstTurn(){

    }

    public void check(){

    }

    public void winnnerX(int a, int b, int c){

    }

    public void winnnerO(int a, int b, int c){

    }
}

