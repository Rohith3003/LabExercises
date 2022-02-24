package lab4.Exercise3;

public abstract class Item {
	private String unqIdentificationNumber;
	private String title;
	private int numOfCopies;

	public String getUnqIdentificationNumber() {
		return unqIdentificationNumber;
	}

	public void setUnqIdentificationNumber(String unqIdentificationNumber) {
		this.unqIdentificationNumber = unqIdentificationNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public abstract void addItem();
	public abstract void Renewal();
	public abstract void lease();
}
