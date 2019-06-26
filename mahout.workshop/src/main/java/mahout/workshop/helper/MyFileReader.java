package mahout.workshop.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
	List<String> lineSeperatedFile;
	
	public MyFileReader(String absolutePath) throws IOException  {
		
		
		lineSeperatedFile = new ArrayList<String>();
		
		readInFile(absolutePath);	
	}

	private void readInFile(String path) throws IOException
	{
		File file = new File(path);
		 
		  BufferedReader br = null;
	
		  br = new BufferedReader(new FileReader(file));
			
		  String st;
		  try {
			while ((st = br.readLine()) != null)
			{
				//holeFile += st+"\n";
				
				lineSeperatedFile.add(st);
			}
			br.close();
		} catch (IOException e) {
			br.close();
			throw new IOException("Something went wrong while reading the file. See the stacktrace for detailed information:\n"+e.getStackTrace());
		}
	}
	
	public List<String> getHoleFileAsList()
	{
		return lineSeperatedFile;
	}
	
	public String getLineOfFile(int lineNumber)
	{
		return lineSeperatedFile.get(lineNumber);
	}
	
	public static String createAbsolutePath(String relativePath, Boolean logPathToConsole) throws IOException
	{
		String current = new java.io.File( "." ).getCanonicalPath();
		String absPath = current + relativePath;
		if(logPathToConsole)
			System.out.println(absPath);
		return absPath;
	}
}
