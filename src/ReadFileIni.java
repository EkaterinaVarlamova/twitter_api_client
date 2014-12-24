import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class ReadFileIni {

	public static Map<String, String> Read() throws FileNotFoundException,
			IOException {

		File file = new File("D:\\MYSQl.ini");

		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), "UTF-8"));
		String line = null;
		Map<String, String> mySQlparam = new HashMap<String, String>();
		while ((line = br.readLine()) != null) {
			String result;		
			String param ="JDBC_DRIVER=";
			if (line.startsWith(param))
			{
				result = line.substring(param.length(), line.length());
				mySQlparam.put("JDBC_DRIVER",result);
			}				
			param ="DB_URL=";
			if (line.startsWith(param))
			{
				result = line.substring(param.length(), line.length());
				mySQlparam.put("DB_URL",result);
			}				
			param ="USER=";
			if (line.startsWith(param))
			{
				result = line.substring(param.length(), line.length());
				mySQlparam.put("USER",result);
			}				
			param ="PASS=";
			if (line.startsWith(param))
			{
				result = line.substring(param.length(), line.length());
				mySQlparam.put("PASS",result);
			}				
			
			System.out.println(line);
		}
		br.close();
		return mySQlparam;
	}
}

/* ���������� ����� D:\MYSQl.ini
��������� ����������� � MySQl
JDBC_DRIVER=com.mysql.jdbc.Driver  
DB_URL=jdbc:mysql://db4free.net/hillel2014java1
USER = hillel2014java1
PASS = hillel2014java1
 */