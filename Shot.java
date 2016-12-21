class Shot extends SpaceObject {
	public int Age = 0;

	public Shot(double xPos, double yPos, double xVel, double yVel) {
		super(xPos, yPos, xVel, yVel, 3);

	}

	public int getAge() {

		return Age++;

	}

	public void move() {
		super.move();
		getAge();
	}
}
