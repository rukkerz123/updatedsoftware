package hashmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\hashmap\\src\\hashmap\\test.properties");
         prop.load(fis);
         System.out.println(prop);
         System.out.println(prop.getProperty("harish"));
         prop.setProperty("dosai", "25");
         FileOutputStream fos = new FileOutputStream("C:\\Users\\vijay\\eclipse-workspace\\hashmap\\src\\hashmap\\test.properties");
         prop.store(fos, "updated price");
	}

}
