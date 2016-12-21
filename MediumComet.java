import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.Random;
import java.util.Vector;

public class MediumComet extends Comet {
	private double XPOS;
	private double YPOS;

	public MediumComet(double xPos, double yPos, double xVel, double yVel) {
		super(xPos, yPos, xVel, yVel, 30);
		XPOS = xPos;
		YPOS = yPos;
	}

	public java.util.Vector<Comet> explode() {
		// play sound because one of the comet was exploded
		URL soundPath = CometsMain.class.getResource("explosion.wav");
		final AudioClip theSound = Applet.newAudioClip(soundPath);

		theSound.play();
		CometsMain.score += 50;
		Random m = new Random();
		// add three small comets
		Vector<Comet> Lcomet = new Vector<Comet>();
		Lcomet.add(new SmallComet(this.XPOS, this.YPOS, m.nextInt(10), m
				.nextInt(10)));
		Lcomet.add(new SmallComet(this.XPOS, this.YPOS, m.nextInt(10), m
				.nextInt(10)));
		Lcomet.add(new SmallComet(this.XPOS, this.YPOS, m.nextInt(10), m
				.nextInt(10)));
		return Lcomet;
	}

}
