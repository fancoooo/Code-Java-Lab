package exception;

public class SaiSoException extends NumberFormatException{
	private String value;
	public SaiSoException(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	public String getMese() {
		return "Gia tri "+ value + " khong phai la so";
	}
}
