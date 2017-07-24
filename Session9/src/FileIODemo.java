import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileIODemo {

	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/tomcaterror.txt");
			if(file.exists()){
				System.out.println("Going to start reading "+file.getName());
				System.out.println("========================================");
				
				/*FileInputStream fis = new FileInputStream(file); // Read Operation in Binary
				
				int ch = 0;
				
				while((ch = fis.read()) != -1){
					System.out.print((char)ch);
				}
				
				fis.close(); // Resources shall be released*/
				
				FileReader reader = new FileReader(file); // Read Operation in Textual Data
				BufferedReader buffer = new BufferedReader(reader);
				
				String line="";
				int count=0;
				while((line= buffer.readLine()) !=null){
					System.out.println(line);
					if(line.contains("java")){
						count++;
					}
				}
				
				System.out.println("========================================");
				System.out.println("java appeared in "+count+" lines");
				
				buffer.close();
				reader.close();
				
				System.out.println("========================================");
				System.out.println("File "+file.getName()+" read completely");
			}else{
				System.out.println("Sorry, no such file "+file.getName());
			}
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	void writeIntoFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/quotes.txt");
			/*if(file.exists()){
				System.out.println(file.getName()+ " exists");
			}else{
				System.out.println(file.getName()+ " does not exists");
			}*/
			
			//FileWriter writer = new FileWriter(file); // if file exists write the data, if not create and write the data
													// true -> data is appended
			FileWriter writer = new FileWriter(file,true); // if file exists write the data, if not create and write the data
			String data = "Search the Candle, rather than cursing the darkness!!";
			
			writer.write(data);
			
			writer.close();
			System.out.println("--Data written--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	
	public static void main(String[] args) {
		
		FileIODemo fRef = new FileIODemo();
		//fRef.readFromFile();
		fRef.writeIntoFile();
		
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String today = sdf.format(date);
		System.out.println(today);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Whats Your Name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, "+name);

	}

}
