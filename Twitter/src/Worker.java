import java.util.ArrayList;
import java.util.List;

public class Worker {
	
	public static List lala = new ArrayList();

	public static void main(String[] args) throws InterruptedException {
		// �������� ������
		Thread myThready1 = new Thread(new Runnable() {

			public void run() // ���� ����� ����� ����������� � �������� ������
			{
				for (int i = 0; i < 100; i++) {
					lala.add(i);
					
				}
				lala.add("stop");
		}
		});
		myThready1.start(); // ������ ������
		
		Thread myThready2 = new Thread(new Runnable() {

			public void run() // ���� ����� ����� ����������� � �������� ������
			{
					if (lala.size()>0){
					String res = (String) lala.get(lala.size());
					int resI = 0;
					if (res == "stop")
						System.out.println("����� �� 2-�� ������");
					else
						resI = Integer.parseInt(res) ;
						System.out.println(resI);
						}
			
			}
		});
		myThready2.start(); // ������ ������
			
		myThready1.join();
		myThready1.join();
		

		System.out.println("all...");
	}
}

