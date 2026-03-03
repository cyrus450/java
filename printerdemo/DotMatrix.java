package printerdemo;

class DotMatrix extends printer{
	void configuration() {
		System.out.println("Dotmatrix printer configuration:");
		System.out.println("resolutions: 300dpi");
		System.out.println("speed:300 cps");
	}
	void display() {
		System.out.println("Dotmatrix printer is printing....:");
	}
}