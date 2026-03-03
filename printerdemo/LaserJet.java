package printerdemo;

class LaserJet extends printer{
	void configuration() {
		System.out.println("Laserjet printer configuration:");
		System.out.println("resolutions: 1200dpi");
		System.out.println("speed:500cps");
	}
	void display() {
		System.out.println("laserjet printer is printing....:");
	}
}