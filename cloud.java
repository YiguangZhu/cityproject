
/**
 * Write a description of class cloud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
class Circle
{
	int x;
	int y;
	int r;

	Circle(int x, int y, int r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
}

public class cloud
{
	private int length;

	public void Cloud(int lengthFactor)
	{
		this.length = (lengthFactor + 1) * 40;
	}
}