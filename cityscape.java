
import java.awt.*;
import java.util.Random;
public class cityscape 
{
   private int count, delay;
   private static int end, baseY;
   private int [] baseX = new int [5]; 
   private Color color, moon, background; 
   private Random generator = new Random();
   private int[] x = new int [40];
   private static int i = 1;
   private int xmove,ymove;
   private static boolean day = true;
   private Color [] colors;
   
   public cityscape (Color shade)//constructor
   {
      color = shade;
      moon = new Color(235,235,235);
      background =  new Color(124,196,245);
      baseY = 0;
      xmove=0;
      ymove=0;
      x[1] = 0;
      x[2] = 190;
      x[3] = 410;
      x[4] = 600;
     
   }
   public void road (Graphics page)
   {
      page.setColor(Color.black);
      page.fillRect(0,baseY+520,800,900);
      
      
   }
   public void sky (Graphics page)
   {
      page.setColor(background);
      page.fillRect(0,0,800,800);//basic background/sky
     
      if(xmove<800){//moves moon or sun across screen
          xmove+=10;
        }
      else{//the cycle
        xmove = -150;
        ymove = 0;
        day = !day;
        end++;
        }
      
      if(day ==true){//if day
          page.setColor(Color.yellow);//make sun
          if(xmove == 0){
              background =  new Color(124,196,245);
            }
          if(xmove == 440){
              background = new Color(104,176,225);
            }
          if(xmove == 500){
              background = new Color(84,156,205);
            }
          if(xmove == 560){
              background = new Color(64,136,185);
            }
          if(xmove == 640){
              background = new Color(44,116,165);
            }
          if(xmove == 700){
              background = new Color(34,106,155);
            }
          if(xmove == 750){
              background = new Color(14,86,135);
            }
          
      }
      if(day == false){//if night
          page.setColor(moon);
          if(xmove==0){
              background = new Color(4,76,125);
          }
          if(xmove == 440){
              background = new Color(14,86,135);
            }
          if(xmove == 500){
              background = new Color(34,106,155);
            }
          if(xmove == 560){
              background = new Color(44,116,165);
            }
          if(xmove == 640){
              background = new Color(64,136,185);
            }
          if(xmove == 700){
              background = new Color(84,156,205);
            }
          if(xmove == 750){
              background = new Color(104,176,225);
            }
        }
      page.fillOval(30+xmove,50+ymove,100,100);
      if(xmove>440){
          ymove+=8;
        }
        
      try{
                Thread.sleep(0);
            }
        catch(Exception e){}
      
   }
   
   
    
   public void build (Graphics page, int height)
   {
      page.setColor (color);
      page.fillRect(x[i],height,180,500);
      for(int k = 0; k<10; k++){
          for(int j = 0; j<4;j++){
              if(generator.nextInt(2)==1){
                  page.setColor(Color.yellow);
                }
              else{
                  page.setColor(Color.gray);
                }
              page.fillRect(x[i]+10+45*j,height+10+50*k,25,30);
            }
        }
     
       
      try{
                Thread.sleep(0);
            }
        catch(Exception e){}
      
   }
   
   
   public static void draw(int c){
    i = c;
   }
}