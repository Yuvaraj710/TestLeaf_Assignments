package week3.day2.assignment;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public void java() {
		System.out.println("Java is Programming Language ");

	}

	public void selenium() {
		System.out.println("Selenium is a testing Automation Tool ");

	}

	void ruby() {
		System.out.println("Ruby is programming language ");

	}

	public static void main(String[] args) {
		Automation lang = new Automation();

		lang.java();
		lang.selenium();
		lang.ruby();
		lang.python();
	}

}
