import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class copyFile {

	public static void main(String[] args)throws IOException {
		File source = new File("C:\\text.txt");
		// ��������� ������������� ����� text.xtx (����������)
		if (source.isFile()) {
			System.out.println("���� �����: " + source.getPath() + " ��� �����: "
					+ source.getName());
		}
		// ������� ������ ������������ �����
		File dest = new File("D:\\dest.txt");

		// ������� ������� �����
		FileInputStream is = new FileInputStream(source);
		try {
			// ������� �������� �����
			FileOutputStream os = new FileOutputStream(dest);
			// �������� ��������� �����
			try {
				byte[] buffer = new byte[4096];
				int length;
				while ((length = is.read(buffer)) > 0) {
					os.write(buffer, 0, length);
				}
			} finally {
				os.close();
			}
		} finally {
			is.close();
		}
		if (dest.isFile()) {
			System.out.print("���� �����: " + dest.getPath() + " ��� �����: "
					+ dest.getName());
		}
	}
}
