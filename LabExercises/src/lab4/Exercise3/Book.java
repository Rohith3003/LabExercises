package lab4.Exercise3;

public class Book extends WrittenItem{
	
	public void addItem()
	{
		System.out.println("Book Added Successfully");
	}

	@Override
	public void Renewal() {
		System.out.println("Book renewal successfull");
	}

	@Override
	public void lease() {
		System.out.println("Book leased successfully");
	}

}
