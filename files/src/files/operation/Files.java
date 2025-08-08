package files.operation;

import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

class Files{
	public static void main(String[] args) throws IOException
	{
		File obj = new File("file.txt");
		//by default it create inside the eclipse workspace
/**
 *****CHECK IF THE DIRECTORIES EXIST OR NOT: IF directory doen't exist create the directory with parent directory; 
 * File directory = new File("/home/user/documents");
if (!directory.exists()) {
 directory.mkdirs(); // Creates the directory and any necessary parent directories
}
*/
		
//		try {
//			//it return the boolean value if the same filName doesn't exist in our system: 
//			if(obj.createNewFile())
//			{
//				System.out.println("The file name is : " + obj.getName());
//				System.out.println("The path of that file : "+obj.getAbsolutePath());
//			}
//			else
//			{
//				System.out.println("The file is already Exist");
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.println("An error Occured");
//		}
		
		/**
		 * =======READ DATA FROM FILE================
		 *    Scanner Reader = new Scanner(obj);
	   
	   while(Reader.hasNextLine())
	   {
		   String data = Reader.nextLine();
		   System.out.println(data);
	   }
	   
	   Reader.close();
		 */
	
		/**
		 * FileWriter class
		 * Automatically creates the file if it doesn't exist.
		 * File file = new File("myfile.txt");
if (!file.exists()) {
    file.createNewFile();
}
FileWriter writer = new FileWriter(file);
writer.write("Using both File and FileWriter!");
writer.close();

		 */
		/**
		 * 	try {
			//we have to provide true as a second parameter which tells the java it only append the content
			FileWriter writer = new FileWriter(obj,true);
			writer.write("I am Kaviarasan\n Have a Nice day");
			writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		by using obj.Delete we can delete the file: 
		
		 */
		
	
		
		
	}
}