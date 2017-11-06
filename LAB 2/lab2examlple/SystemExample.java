package lab2examlple;


public class SystemExample {
	public static void main(String[] args) {
		System.out.println("JAVA_HOME : " + System.getProperty("java.home"));
		System.setProperty("java.home", "C:\\Program Files\\Java\\jre1.8.0_131");
		System.out.println("JAVA_HOME : " + System.getProperty("java.home"));
		System.out.println("USER NAME : " + System.getProperty("user.name"));
		System.out.println("OS NAME : "+ System.getProperty("path.separator"));
	}
}
