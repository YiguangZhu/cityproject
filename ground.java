
/**
 * Write a description of class Background here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.awt.*;
 import java.util.Random;
public class ground 
{
    private Color color;
    private int x;
    private int y;
    private int height;
    private Random generator = new Random();
    public ground(int x, int y, Color c, int h)
    {
        this.x = x;
        this.y = y;
        color = c;
        height = h;
    }
    public void draw(Graphics page)
    {
        page.setColor(color);
        int top = y-height;
        //           center bottom w   h
        page.fillRect(x,top,1366,100);
    }
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(250);
            }
            catch(Exception e){}
        }
        
    }
}