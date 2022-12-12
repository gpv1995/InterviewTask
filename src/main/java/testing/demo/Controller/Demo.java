package testing.demo.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

import java.time.LocalDate;
import java.time.Month;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {
	public static void main(String args[]) throws StreamReadException, DatabindException, IOException {
		 		Date date = new Date();
		    SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy");
		    String strDate= formatter.format(date);
		    System.out.println(strDate);

			//demo


		File[] listOfFiles = new File("/Users/praveenvarma/Documents/demo 4/src/main/resources/jsonfiles").listFiles();
		for (File file : listOfFiles) {
			if (file.isFile()) {
				System.out.println(file.getName());
				if(file.getName().contains(strDate))
				{
					//String test = file.getPath();
					ObjectMapper mapper = new ObjectMapper();
					Student s1 = mapper.readValue(new File(file.getPath()),Student.class);
					System.out.println(file.getName());
					System.out.println(s1.getName());
				}

			}
		}
	}
}