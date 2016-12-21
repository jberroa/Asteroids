import java.util.Vector;

public abstract class Comet extends SpaceObject {

	public Comet(double xPos, double yPos, double xVel, double yVel,
			double radius) {
		super(xPos, yPos, xVel, yVel, radius);
		// TODO Auto-generated constructor stub
	}

	public Vector<Comet> explode() {
		Vector<Comet> Lcomet = new Vector<Comet>();
		if (Lcomet.isEmpty())
			return Lcomet;
		return null;

	}

}
