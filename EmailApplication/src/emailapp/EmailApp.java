package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email obj = new Email("John", "Smith");
		// obj.setAlternateEmail("js@gmail.com");
		// System.out.println(obj.getAlternateEmail());
		System.out.println(obj.showInfo());
	}

}
