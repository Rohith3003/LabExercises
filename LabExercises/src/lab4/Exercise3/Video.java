package lab4.Exercise3;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int releasedYear;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Video is playing");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Video paused");
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		System.out.println("Video resumed");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Video stopped playing");
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Video file added successfully");
	}

	@Override
	public void Renewal() {
		// TODO Auto-generated method stub
		System.out.println("Video renewal  is successfully done");
	}

	@Override
	public void lease() {
		// TODO Auto-generated method stub
		System.out.println("Video file leased successfully");
	}
	

}
