
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */

public class DisplayOverview {
    
    ArrayList<Cricketer> scoreList;
    int num;
    
    public void setScoreList(ArrayList<Cricketer> scoreList) {
        this.scoreList = scoreList;
    }
    
    public void display() {
        num = 0;
        for(int i=0; i<scoreList.size(); i++) {
            num = num + scoreList.get(i).getScore();
        }
        
        //System.out.println(num);
        //return num;
    }
    
    public void passFullScore() {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.setOvervewTextField(num);
    }
}
