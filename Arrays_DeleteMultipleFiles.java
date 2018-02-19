//deleting multiple files

import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Arrays_DeleteMultipleFiles {

	public static void main(String[] args) {
		
		//File class, argument "." makes it refer to project's parent dir.
		//yes, it's called  a file, not folder, not dir
	File folder = new File(".");
	// enhanced for loop: for (Typename variableName : Range of values) {code}
	for (File file : folder.listFiles()) {
		if (file.getName().endsWith(".txt")) {
			file.delete();
		}
	}

	
	}
}
