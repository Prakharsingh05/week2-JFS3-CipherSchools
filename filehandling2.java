
import java.io.File;

public class FileHandlingTest3 {
	public static void main(String[] args) {
		File f = new File("f:\\TestFile.txt");
		String[] files = f.list();
		
		for(String file : files) {
			System.out.println(file);
		}
		File[] files_arr = f.listFiles();
		for (File ff : files_arr) {
			ff.delete();
		}
	}
}

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderTest0 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("f:\\TestFile.txt\\Rhyme.txt");
		BufferedReader br = new BufferedReader(fr);
		String line ;
		
		while((line = br.readLine()) !=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}
