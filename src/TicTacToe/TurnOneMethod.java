package TicTacToe;

public class TurnOneMethod {



    public static void turnOnePlay(){
    System.out.println("Enter something");

    Input user = new Input();
    Integer userNum = user.userInput;

        if (userNum.equals(1)){
        TurnOneBoard.rowOneColOneX();
    }   if (userNum.equals(2)){
            TurnOneBoard.rowOneColTwoX();
    }   if (userNum.equals((3))){
            TurnOneBoard.rowOneColThreeX();
    }   if (userNum.equals(4)){
            TurnOneBoard.rowTwoColOneX();
    }   if (userNum.equals(5)){
            TurnOneBoard.rowTwoColTwoX();
    }   if (userNum.equals(6)) {
            TurnOneBoard.rowTwoColThreeX();
    }   else {
            System.out.println("bye");
    }
}


}
