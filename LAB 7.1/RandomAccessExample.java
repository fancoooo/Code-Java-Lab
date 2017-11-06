package lab7;

import java.awt.Desktop;
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\Temp\\hello.txt");
		try{
			RandomAccessFile a = new RandomAccessFile(file, "rw");
			a.seek(9);
			byte[] bytes = new byte[1024];
			int read = a.read(bytes);
			System.out.println(new String(bytes,0,read,"UTF-8"));
			a.seek(file.length());
			a.writeBytes("\r\n");
			a.writeBytes("hello");
		}catch(Exception e) {
			
		}
		
	}

}
