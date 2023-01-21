import java.awt.*;

public class Scores {
    static int GAME_WIDTH;
    static int GAME_HIGHT;
    int player1;
    int player2;

    Scores(int GAME_WIDTH,int GAME_HIGHT){
        Scores.GAME_WIDTH = GAME_WIDTH;
        Scores.GAME_HIGHT = GAME_HIGHT;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.PLAIN,60));
        g.drawLine(GAME_WIDTH/2,0,GAME_WIDTH/2,GAME_HIGHT);
        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10),(GAME_WIDTH/2)-85,50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10),(GAME_WIDTH/2)+20,50);
    }
}
