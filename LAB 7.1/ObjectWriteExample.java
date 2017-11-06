package lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;

public class ObjectWriteExample {
	
	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Temp\\hello.txt");
		writefile(file);
		readfile(file);
	}
	public static void writefile(File f) throws Exception{
		ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(f));
		a.writeObject(new Person("Viet",20));
		a.writeObject(new Person("Ha",23));
		a.close();
	}
	public static void readfile(File f) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		Object oj = in.readObject();
		Method method = oj.getClass().getMethod("print", new Class[0]);
		method.invoke(oj, new Object[0]);
		
		in.close();
	}
}


class Person implements Serializable{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println(this.name + " age is " + this.age);
	}
}