
/**
 * Write a description of class moon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;

public class Moon{

	private double x=0, y=0;
	private Thread thread;
	public Moon(){

	}

	public void draw(Graphics page){
		page.setColor(Color.gray);
		page.fillOval(xcoordinate(), ycoordinate(), 50, 50);
		x+=0.05;
		y+=0.05;
	}


	public double xcoordinate(){

		return (double)(1000* Math.cos(x));
	}
	public double ycoordinate(){
		y = (double) (10*Math.sin(y));
		return (double)y;
	}

}