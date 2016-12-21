import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.Vector;

public class SmallComet extends Comet {
	public SmallComet(double xPos, double yPos, double xVel, double yVel) {
		// TODO Auto-generated constructor stub
		super(xPos, yPos, xVel, yVel, 20);
	}

	public Vector<Comet> explode() {
		URL soundPath = CometsMain.class.getResource("explosion.wav");
		final AudioClip theSound = Applet.newAudioClip(soundPath);

		theSound.play();
		Vector<Comet> Lcomet = new Vector<Comet>();

		CometsMain.score += 30;
		return Lcomet;
	}

}
