package org.bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileSample {
	public static void main(String[] args) throws IOException {
		
		//File s= new  File("E:\\Testing\\Selenium\\Sample");

//		File f = new File("E:\\Testing\\Selenium\\Sample");
//		
//		File[] l = f.listFiles();
//		
//		for (File x : l) {
//			
//			String a = x.getAbsolutePath();
//			System.out.println(a);
//	}



	//To read the file
		
		System.out.println("TO Tead The File");
		File f1 = new File("E:\\Testing\\Selenium\\Sample\\test.txt");
		
		List<String> l1 = FileUtils.readLines(f1);
		
		for (String s : l1) {
			
			System.out.println(s);
			
		}
		

	//To copy and paste
		System.out.println("TO copy  and paste into another file");
		File f2 = new File("E:\\Testing\\Selenium\\Sample\\test.txt");
		
		File f3 = new File("E:\\Testing\\Selenium\\Sample\\java.txt");
		
		FileUtils.copyFile(f2, f3);
		
		List<String> r = FileUtils.readLines(f2);
		
		for (String s : r) {
			System.out.println(s);
		}



	//To write
	  System.out.println("TO Write file");
		File f4 = new File("E:\\Testing\\Selenium\\Sample\\write.txt");
		
		FileUtils.write(f4, "Hello Students");
		
		System.out.println("Its done");



	//To replace existing
		System.out.println("TO Replace Existing  file");
		//File f = new File("E:\\Testing\\Selenium\\Sample\\write.txt");
		
		FileUtils.write(f4, " By highest world",true);
		
		System.out.println("Its done");
		
/*
	//To add keyword along with existing
		File f = new File("E:\\oracle\\database\\besant.txt");
		
		FileUtils.write(f, "Hi world",true);
		
		System.out.println("Its done");
*/
	//Reading File 

		FileReader f5 = new FileReader("E:\\Testing\\Selenium\\Sample\\java.txt");
		BufferedReader b = new BufferedReader(f5);
		
		String str;
		
		while ((str=b.readLine())!=null) {
			
			System.out.println(str);
			
		}
		


				
				
	}

}
