package lab7;

import java.io.*;

public class FileOutputExample {
	public static void main(String[] args) throws IOException {
		String file = "C:" + File.separator + "Temp" + File.separator + "hello.txt";
		OutputStream f = null;
		try{
			f = new FileOutputStream(new File(file));
			byte[] b = "anh yeu em hihi".getBytes();
			f.write(b);
		}catch(Exception e) {
			
		}finally {
			f.close();
		}
	}
}
