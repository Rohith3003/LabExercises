package lab4.Exercise3;

public class JournalPaper extends WrittenItem{
	private int publishedYear;

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public void addItem() {
		System.out.println("Journal paper added successfully");
		
	}

	@Override
	public void Renewal() {
		System.out.println("Journal paper renewal is successfull");
		
	}

	@Override
	public void lease() {
		System.out.println("Journal paper leased successfully");
		
	}
	

}
