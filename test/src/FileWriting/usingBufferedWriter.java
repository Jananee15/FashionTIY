package FileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class usingBufferedWriter {
	public static void main(String[] args) throws IOException {
		String location ="BufferedWriter.txt";
		String content = "This is a bufferedWriter's content";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	}
}