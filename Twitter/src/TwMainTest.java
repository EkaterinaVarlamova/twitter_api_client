import java.util.HashMap;
import java.util.Map;

import org.junit.Test;



public class TwMainTest {

	@Test
	public void testMain() {
		String testArgs[]  = {"-UsID=Igor1578","-GtSt=788798","-PtSt=����� ����"}; // ������ ���������� ���������� ������
		
		Map<String, String> testCommands = new HashMap<String, String>(); //������� ��������� map
		testCommands.put("ArgUsID","Igor1578");
		testCommands.put("ArgGtSt","788798");
		testCommands.put("ArgPtSt","����� ����");
		Map<String, String> Result = TwMain.ParcingArg(testArgs); //�������� map �� ������� ����������
		boolean mapsAreEqual = testCommands.equals(Result); //����������
		if(mapsAreEqual){
			System.out.println("���� ��������!!!");
		}
		else {
			System.out.println("���� ��������!!!");
		}
		
		    
		
	}

}
