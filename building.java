
/**
 * Write a description of class building here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
 import java.util.Random;
public class building implements Runnable
{
    private Color color;
    private int x;
    private int y;
    private int height;
    private Random generator = new Random();
    public building(int x, int y, Color c, int h)
    {
        this.x = x;
        this.y = y;
        color = c;
        height = h;
    }
    public void draw(Graphics page)
    {
        page.setColor(color);
        int top = x-height;
        //           center bottom w   h
        page.fillRect(x-10,top,200,450);
    }
    public void run()
    {
        while(true)
        {
            int newHeight = generator.nextInt(100);
            height = newHeight;
            try
            {
                Thread.sleep(250);
            }
            catch (Exception e){}
        }
    }
}