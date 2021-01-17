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
    }   if (userNum.equals((3))) {
            TurnOneBoard.rowOneColThreeX();
        }else{
            System.out.println("bye");
        }

}


}
