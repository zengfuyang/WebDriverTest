package Configure;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LocalResoure {
	
	static HashMap<String, String> newDictionary = new HashMap<String, String>();
	
	public static HashMap<String, String> loadLocalResoure(String locale) throws IOException{
		
		try{
			
			String path = "src/LocalResoure/locale-" + locale + ".js";
			File file = new File(path);
		
			Scanner scanner = new Scanner(file, "UTF8");
		
			while (scanner.hasNextLine()) {
				// Process each line.
				String line = scanner.nextLine().trim();
				int separator = line.indexOf("\":");
				if (separator > 0) {
				
					String key = line.substring(1, separator);
					String value = line.substring(separator + 4, line.length() - 2);
					value = value.replace((char) 160, ' ');
					newDictionary.put(key, value);
				}
			}
			if (scanner != null) {
				scanner.close();
			}
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return newDictionary;
	}
	
	public static void main(String[] args) throws IOException{
		
//		LocalResoure lr=new LocalResoure();
//		//String errorMsg=lr.loadLocalResoure().get("Authentication Error");
//		System.out.println(errorMsg);
//		logger.error("######################");
		
	}

}
