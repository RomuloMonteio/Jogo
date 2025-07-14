
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romy
 */
public class GamePanel extends JPanel {
    //Screen settings
    
    final int originalTileSize = 16;
    final int scale = 3;
    
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    
    final int screeWith = tileSize * maxScreenCol;
    final int screenHeigth = tileSize * maxScreenRow;
    
    public GamePanel()
    {
        this.setPreferredSize(new Dimension(screeWith,screenHeigth));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        
    }
}
