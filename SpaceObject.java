public abstract class SpaceObject {
	public static double playfieldWidth;
	public static double playfieldHeight;
	protected double xVelocity;
	protected double yVelocity;
	public double Radius;
	public double XPosition;
	public double YPosition;

	public SpaceObject(double xPos, double yPos, double xVel, double yVel,
			double radius) {
		Radius = radius;
		XPosition = xPos;
		YPosition = yPos;
		xVelocity = xVel;
		yVelocity = yVel;

	}

	public double getRadius() {
		return Radius;
	}

	public double getXPosition() {
		return XPosition;
	}

	public double getYPosition() {
		return YPosition;
	}

	public boolean overlapping(SpaceObject rhs) {
		double x = Math.pow(XPosition - rhs.XPosition, 2);
		double y = Math.pow(YPosition - rhs.YPosition, 2);
		double r = Radius + rhs.Radius;
		if (Math.sqrt(x + y) < r)
			return true;
		return false;

	}

	public void move() {
		
		//this makes sure that comets wrap around the screen 
		if (XPosition >= 500 || XPosition <= 0) {
			if (XPosition >= 500)
				XPosition = 0;
			else if (XPosition <= 0)
				XPosition = 500;

		}

		if (YPosition >= 500 || YPosition <= 0) {
			if (YPosition >= 500)
				YPosition = 0;
			else if (YPosition <= 0)
				YPosition = 500;

		}

		XPosition += xVelocity;
		YPosition += yVelocity;

	}
}
