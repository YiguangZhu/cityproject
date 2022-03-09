import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class Structure
{
    private int height;
    private int width;
    private int baseY;
    private int baseX;    
    public Structure(int left, int right, int width, int height)
    {
        this.height = height;
        this.width = width;
        left = baseY;
        right = baseX;        
    }
    
    public int getHeight()
    
    {
        return this.height;
    }   
    
    
    public void draw(Graphics2D g2)
    {
        Rectangle grass = new Rectangle (baseY, baseX, width, height);
        g2.setColor(Color.GREEN);
        g2.draw(grass);
        g2.fill(grass);
    }

}