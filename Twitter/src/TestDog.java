import java.util.ArrayList;
import java.util.List;

//import java.List;

public class TestDog {

	public static void main(String[] args) {
		Dog a =  new Dog(15,3);
		Dog b = new Dog(15,4);
//		a.weight = 15;
//		b.weight = 15;
		List lDog = new ArrayList();
		lDog.add(a);
		System.out.println(lDog.contains(b));
		System.out.println(a.equals(b));
		

	}

}
