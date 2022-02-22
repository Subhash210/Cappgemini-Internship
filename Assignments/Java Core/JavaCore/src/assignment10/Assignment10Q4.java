package assignment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment10Q4 {
	
	public static void main(String[] args) {
		
		var path ="C:\\Users\\Subhash\\OneDrive\\Desktop\\StudentList.txt";
		
		try {
			String S=Files.readString(Path.of(path));
			S.lines().forEach((i)->i.isBlank());
			

			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
