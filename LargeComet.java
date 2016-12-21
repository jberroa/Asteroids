import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.Random;
import java.util.Vector;

public class LargeComet extends Comet {

	public LargeComet(double xPos, double yPos, double xVel, double yVel) {
		super(xPos, yPos, xVel, yVel, 40);

	}

	public java.util.Vector<Comet> explode()

	{
		URL soundPath = CometsMain.class.getResource("explosion.wav");
		final AudioClip theSound = Applet.newAudioClip(soundPath);

		theSound.play();
		CometsMain.score += 100;
		Random m = new Random();
		Vector<Comet> Lcomet = new Vector<Comet>();
		Lcomet.add(new MediumComet(this.XPosition, this.YPosition, m
				.nextInt(10), m.nextInt(10)));
		Lcomet.add(new MediumComet(this.XPosition, this.YPosition, m
				.nextInt(10), m.nextInt(10)));

		return Lcomet;
	}

}
