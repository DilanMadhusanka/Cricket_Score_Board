/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Cricketer {
    private String player;
    private int score;
    private int played_balls;
    private int sr;
    
    public Cricketer(String player, int score, int played_balls, int sr) {
        this.player = player;
        this.score = score;
        this.played_balls = played_balls;
        this.sr = sr;
    }
    
    public String getPlayer() {
        return player;
    }
    
    public int getScore() {
        return score;
    }
    
    public int getPlayed_balls() {
        return played_balls;
    }
    
    public int getSR() {
        return sr;
    }
}
