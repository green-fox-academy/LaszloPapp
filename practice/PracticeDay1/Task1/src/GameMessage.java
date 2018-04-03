public class GameMessage {

    String start;
    String greater;
    String smaller;
    String win;
    String over;

    public GameMessage() {
    }

    public String getStart() {
        return "Guess a number!";
    }

    public String getGreater() {
        return "The number you did provide greater than we are looking for. :( Guess again!";
    }

    public String getSmaller() {
        return "The number you did provide smaller than we are looking for. :( Guess again!";
    }

    public String getWin() {
        return "You just hit the number! Well done! :D";
    }

    public String getOver() {
        return "Provide a valid number! Game Over! :(";
    }
}
