import java.awt.Rectangle;
import java.awt.Point;
public class Geometry{

	public static int area(Rectangle r) {
		return r.height*r.width;
	}
	public static int perimeter(Rectangle r) {
		return (r.height*2)+(r.width*2);
	}
	public static Rectangle pointsToRectangle(Point ul, Point br){
		int h = ul.y-br.y;
		int w = br.x-ul.x;
		Rectangle r = new Rectangle(ul.x, ul.y, w, h);
		return r;
	}
}
