import java.io.File;
import java.io.IOException;
public class FileHandlingTest0 {
	
	public static void main(String[] args) {
		File f = new File("f:\\myTestFile.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file created successfully");
	}

}
public class FileHandlingTest1 {
	public static void main(String[] args) {
		File f = new File("f:\\myTestFile.txt");
		
		if (f.exists()) {
			System.out.println("Printing File Details");
			System.out.println("---------------------");
			
			System.out.println("File Name :" + f.getName());
			System.out.println("File Size :" + f.length());
			System.out.println("File Path :" + f.getAbsolutePath());
			System.out.println("Is File readable ?" + f.canRead());
			System.out.println("Is File writable ?" + f.canWrite());
			System.out.println("---------------------");
		}
		File f1 = new File("f:\\TestFile.txt");
		f1.mkdir();
	}

}

import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingTest2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("f:\\myTestFile.txt",true);
		
		fw.write("I am the Earth \n");
		fw.write("I am the Forest Green \n");
		fw.write("I am the Four Winds Blowing \n");
		fw.write("I am the Earth \n");
		fw.flush();
		fw.close();
		System.out.println("File prepared successfully");
	}
	
}
