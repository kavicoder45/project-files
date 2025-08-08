package files.operation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Input {
	public static void main(String[] args) throws IOException   
	{
		//file folder Demo: 
		
//		if(!file.exists())
//		{
//			file.mkdir();
//			
//			if(file.exists())
//			{
//				System.out.println("The folder is created");
//			}
//		}
		File file1 = new File("D:\\SASS tutorail\\kavi");
//		try {
//			boolean present = file1.createNewFile();
//			System.out.println(present);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		File newname = new File("D:\\SASS tutorail\\kavi\\first.txt");
//		file1.renameTo(newname);
		
//		System.out.println(file1.getName());
		
		//list all the files in specific Folder:
		
		String[] files = file1.list();
		System.out.println(Arrays.toString(files));
		
		/**
		 * buy using length , it print the file size in terms of bytes
		 */
//		File[] files = file.listFiles();
//		for(File f : files)
//		{
//			if(f.isFile())
//			{
//			  String fileName = f.getName();
////			  if(fileName.endsWith(".txt"))
////			  {
////				  System.out.println(fileName);
////			  }
//			  int dot = fileName.lastIndexOf(".");
//			  String prefix = fileName.substring(dot+1);
//			  if(prefix.equals("txt"))
//			  {
//				  System.out.println(fileName);
//			  }
//			}
//		}
		
		File file = new File("sample.txt");
//		try {
//			file.createNewFile();
//			FileWriter writer = new FileWriter(file,true);
//			writer.write("Hi I am Kaviarasan");
//			writer.write("I am learing java with Fun");
//			writer.flush();
//			writer.close();
//			
//			FileReader reader = new FileReader(file);
//			int ch;
//			while((ch = reader.read())!=-1)
//			{
//				System.out.print ((char)ch);
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	  //buffered reader , buffered writer:
	FileReader reader;
	try {
		reader = new FileReader(file);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		
		while(line!=null)
		{
//			System.out.println(line);w
			line = br.readLine();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}
}
