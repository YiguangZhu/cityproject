
/**
 * Write a description of class Sky here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
public class sky extends JComponent implements Runnable
{
    private int baseX;     
    private int baseY;     
    private Color color;   
    private int height;    
    Random generator = new Random();
    
    public sky(int x, int y, Color c, int h){
        baseX = x;
        baseY = y;
        color = c;
        height = h; 
    }
    public void setHeight(int size){
        height = size;
        System.out.println(color);
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        draw (g2);
    }
    public void draw (Graphics2D page)
       {
           Color night = new Color(0, 0, 0);
           
           page.setColor(night);
           page.drawLine(baseX, baseY-height, baseX+600, baseY-height);
           page.drawLine(baseX+600, baseY-height,baseX+600,baseY);
           page.drawLine(baseX+600, baseY, baseX, baseY);
           page.fillRect(baseX,baseY,600,-height);
           //Creates a rectangle which is placed in the backround and drawn over

          
          
          
          

       }
       public void run()
        {
        while(true){
            
            try{
                Thread.sleep(17);
            }catch (Exception e){}

            System.out.print(height);
        }

        }
        
}