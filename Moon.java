
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
public class Moon
{
     private Color color;
    private int baseX;//starting x coordinate
    private int baseY;//starting y coordinate
    private int height;
    private int width;
    
    public Moon(int left, int right, int width, int height)
    {
        left = baseX;
        right = baseY;
         this.width = width;
        this.height = height;
    }

    /**
     */
    public void draw(Graphics2D g2)
    {       
        Ellipse2D.Double moon = new Ellipse2D.Double(baseX, baseY, width, height);
        g2.setColor(Color.yellow);
        g2.draw(moon);        
        g2.fill(moon);
    }
    
    public void changePos()
    {
        double moon = baseX/2.0 + baseX/2.0*Math.cos(Math.PI+2.0*Math.PI);
        double moony = baseY/2.0 + baseY/2.0*Math.sin(Math.PI+2.0*Math.PI);

    }
    

}
