package my.personal.code;

/*
 * Date 06/29/2016
 * @author Harish Krishnan
 *
 * Get Nth point from Square Spiral points on a graph. 
 *
 */

public class SquareSpiral {

	public SquareSpiral() {
		// TODO Auto-generated constructor stub
	}

	private enum Direction { 
		UP(0), 
		RIGHT(1), 
		DOWN(2), 
		LEFT(3);

		private int value;

		private Direction(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public void getNthPoint(int N) throws Exception {
		if(N < 0)
			throw new Exception("Enter positive number");
		if(N == 0)
			System.out.println(new Point().toString());

		System.out.println(""+N+"th point from origin(including) is "+getNthPointUtil(new Point(), Direction.values()[0], 1, 1, N).toString());	
	}

	private Point getNthPointUtil(Point point, Direction direction, int dx, int dy, int N) {
		/* 
		 * Util function that recursively gets Nth point
		 * 
		 * Parameters:
		 * point - any point (x,y)
		 * direction - one of the following (UP, RIGHT, DOWN, LEFT)
		 * dx - upper limit for x based on direction
		 * dy - upper limit for y based on direction
		 * N - number of points from origin
		 * 
		 */
		if(N == 0)
			return point;

		int delta = 0;
		switch(direction) {
		/*
		 * for delta from o to dx(or dy)
		 * access next point (x,y) and decrement N
		 */
		case UP:		
			while(delta < dy && N >0) {
				point.setY(point.getY()+1);
				delta++;
				N--;
			}
			dy = dy+1;
			break;
		case RIGHT:		
			while(delta < dx && N >0) {
				point.setX(point.getX()+1);
				delta++;
				N--;
			}
			dx = dx+1;
			break;
		case DOWN:		
			while(delta < dy && N >0) {
				point.setY(point.getY()-1);
				delta++;
				N--;
			}
			dy = dy+1;
			break;
		case LEFT:		
			while(delta < dx && N >0) {
				point.setX(point.getX()-1);
				delta++;
				N--;
			}
			dx = dx+1;
			break;
		}

		//pass next direction
		int num = direction.getValue()+1;

		return getNthPointUtil(point, Direction.values()[num%4], dx, dy, N);	

	}

	public static void main (String args[]) throws Exception {
		SquareSpiral sp = new SquareSpiral ();
		sp.getNthPoint(9);
	}

}
