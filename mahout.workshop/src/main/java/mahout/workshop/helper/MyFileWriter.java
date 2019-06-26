package mahout.workshop.helper;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MyFileWriter {
	protected String path;
	
	PrintWriter writer;
	
	public MyFileWriter(String absolutePathWithFileName) {
		path = absolutePathWithFileName;
		
		try {
			writer = new PrintWriter(path, "UTF-8");
		} catch (FileNotFoundException e) {
		} catch (UnsupportedEncodingException e) {
		}
	}
	
	public void addLine(String line) {
		writer.println(line);
	}
	
	public void saveAndCloseFile() {
		writer.close();
	}
}
