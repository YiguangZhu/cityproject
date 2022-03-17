import java.awt.*;
    import java.util.*;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class city extends JComponent //implements Runnable
{
   private final int APPLET_WIDTH = 400;    
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45;
   Random generator = new Random();
  
   private cityscape road, building, building2,building3, building4, sky;
   
      int h1 = HEIGHT_MIN+60;
      int h2 = HEIGHT_MIN+35; 
      int h3 = HEIGHT_MIN+120;
      int h4 = HEIGHT_MIN+100;
   //-----------------------------------------------------------------
   //  Creates several cityscape pieces
   //-----------------------------------------------------------------
   public city() //init in applet is like constructor; runs only once
   {                   //Different than start.

      Color road1 = new Color(0,0,0);
      Color b1 = new Color(165,42,42);
      Color b2 = new Color(165,42,42);
      Color b3 = new Color(165,42,42);
      Color b4 = new Color(165,42,42);
      road = new cityscape (road1);
      building4 = new cityscape(b4);
      building = new cityscape(b1);
      building2 = new cityscape(b2);
      building3 = new cityscape(b3);
      sky = new cityscape(Color.blue);
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);      
   }

   public void paint (Graphics page)
   {
    sky.sky(page);
      building4.build(page,h4);
      cityscape.draw(4);
      building3.build(page,h3);
      cityscape.draw(3);
      building2.build(page,h2);
    cityscape.draw(2);
      building.build(page,h1);
      cityscape.draw(1);
      road.road(page);
      
    
}

   public void nextFrame()
   {
      

       repaint();

   }

   public void run()
   {
    }
}