
public class Dog {

	int weight;
	int amountOfLegs;
	
	public Dog(int i, int j) {
		this.weight = i;
		this.amountOfLegs =j;
	}

	public boolean equals(Object a){
		boolean Result = false;
		if(a!=null && a instanceof Dog && ((Dog)a).getWeight() == this.weight) //(Dog)a) -���������� ������� � ������ Dog 
		{
				Result = true;
		}
		return Result;
		
	}
	
	@Override
	public int hashCode(){
			return this.weight;
	}

	
	public int getWeight()
	{
		return weight;
	}
}
