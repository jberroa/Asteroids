public class Ship extends SpaceObject {
	public double Angle = 0;

	public Ship(double xPos, double yPos, double xVel, double yVel) {
		// TODO Auto-generated constructor stub
		super(xPos, yPos, xVel, yVel, 10);

	}

	public void accelerate() {
		xVelocity += .1 * Math.sin(Angle);
		yVelocity += .1 * Math.cos(Angle);
		double x, y;
		x = Math.pow(xVelocity, 2);
		y = Math.pow(yVelocity, 2);

		double s = Math.sqrt(x + y);

		if (s > 10) {
			xVelocity *= (10 / s);
			yVelocity *= (10 / s);

		}

	}

	public Shot fire() {

		double vx = 3 * Math.sin(Angle) + xVelocity;
		double vy = 3 * Math.cos(Angle) + yVelocity;
		Shot s = new Shot(XPosition, YPosition, vx, vy);
		return s;
	}

	public void rotateLeft() {

		Angle += .1;

	}

	public double getAngle() {

		return Angle;

	}

	public void rotateRight() {

		Angle -= .1;

	}

}
