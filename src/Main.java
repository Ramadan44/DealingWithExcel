import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream; //save the file 


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook workbook = new HSSFWorkbook();
		
		
		
		
		
		
		
		try {
			FileOutputStream output = new FileOutputStream("test.xls");
			workbook.write(output);
			output.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
