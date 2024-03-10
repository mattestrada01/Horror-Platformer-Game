package entities;

import static utilizations.constants.EnemyConstants.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gamestates.*;
import utilizations.LoadSave;

public class EnemyManager {

    private ArrayList<Enemy1> enemies1 = new ArrayList<>();
    private Playing playing;
    private BufferedImage[][] enemy1arr;

    public EnemyManager(Playing playing) {
        this.playing = playing;
        loadEnemyImages();
        addEnemies();
    }

    private void addEnemies() {
        enemies1 = LoadSave.GetEnemies1();
    }

    private void loadEnemyImages() {
        enemy1arr = new BufferedImage[5][7];
        BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.ENEMY1_SPRITE);

        for (int j = 0; j < enemy1arr.length; j++) {
            for(int i = 0; i < enemy1arr[j].length; i++){
                enemy1arr[j][i] = temp.getSubimage(i*ENEMY1_WIDTH_DEFAULT, j*ENEMY1_HEIGHT_DEFAULT, ENEMY1_WIDTH_DEFAULT, ENEMY1_HEIGHT_DEFAULT);
            }
        }
    }

    public void update(int[][] lvlData, Player player) {
        for (Enemy1 c : enemies1) {
            c.update(lvlData, player);
        }
    }

    public void draw(Graphics g, int xLevelOffset) {
        drawEnemy1(g, xLevelOffset);
    }

    private void drawEnemy1(Graphics g, int xLevelOffset) {
        for (Enemy1 c : enemies1) {
            g.drawImage(enemy1arr[c.getState()][c.getAnimationIndex()], (int)c.getHitbox().x - xLevelOffset - ENEMY1_DRAWOFFSET_X, 
                            (int)c.getHitbox().y - ENEMY1_DRAWOFFSET_Y, ENEMY1_WIDTH, ENEMY1_HEIGHT, null);
            c.drawHitbox(g, xLevelOffset);
        }
    }
}