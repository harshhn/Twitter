package my.personal.code;

/*
 * Date 06/29/2016
 * @author Harish Krishnan
 *
 * Helper class to construct a point (x,y) 
 *
 */

public class Point {
    
    private int x;
    private int y;

    public Point() {
	this.x = 0;
	this.y = 0;
    }
    
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }
    
    public int getX() {
	return x;
    }
    
    public int getY() {
	return y;
    }
    
    public String toString() {
	return "(" + x + ", " + y + ")";
    }
    
    public void setX(int x) {
	this.x = x;
    }
    
    public void setY(int y) {
	this.y = y;
    }
    
    public static void main(String args[]) {
	Point p = new Point();	
	System.out.println(p.toString());	
	System.out.println("X coordinate of p: "+p.getX());
	
	Point q = new Point(3,2);
	System.out.println(q.toString());	
	System.out.println("Y coordinate of q: "+q.getY());
	
	q.setY(q.getY()+1);
	System.out.println("New q: "+q.toString());
    }

}
