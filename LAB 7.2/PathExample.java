package lab7;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.DirectoryStream.Filter;
import java.util.function.Consumer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:\\Temp");
		try{
			Files.newDirectoryStream(p).forEach(new Consumer<Path>() {
				@Override
				public void accept(Path p) {
					if(Files.isDirectory(p)) System.out.println(p.getFileName());
				}
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
