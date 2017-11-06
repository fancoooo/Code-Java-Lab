package lab7;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class FileExample {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\HaNT\\Desktop\\Good-Night-Bot-master");
		System.out.println(file.isFile() ? "file" : "folder");
		File[] files = file.listFiles();
		for(File f:files) System.out.println(f.getName());
		System.out.println("Size file = " + getSize1(file)/(1024*1024));
		System.out.println("Size file = " + getSize2(file)/(1024*1024));
	}
	public static long getSize1(File f) {
		if(f.isFile()) return f.length();
		long len = 0;
		File[] file = f.listFiles();
		for(File g:file) {
			if(g.isFile()) len += g.length();
			else len += getSize1(g);
		}
		return len;
	}
	public static long getSize2(File f) {
		if(f.isFile()) return f.length();
		AtomicLong len = new AtomicLong(0);
		Arrays.stream(f.listFiles()).forEach( g-> {
			len.addAndGet(g.isFile() ? g.length() : getSize2(g));
		});
		return len.get();
	}
}
