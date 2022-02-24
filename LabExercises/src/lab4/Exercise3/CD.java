package lab4.Exercise3;

public class CD extends MediaItem{
	private String artist;
	private String genre;
	@Override
	public void play() {
		System.out.println("CD is playing");
		
	}
	@Override
	public void pause() {
		System.out.println("CD is paused playing");
		
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void resume() {
		System.out.println("CD is resumed playing");
		
	}
	@Override
	public void stop() {
		System.out.println("CD is stopped playing");
		
	}
	@Override
	public void addItem() {
		System.out.println("CD file added");
		
	}
	@Override
	public void Renewal() {
		System.out.println("CD renewal successfull");
		
	}
	@Override
	public void lease() {
		System.out.println("CD leased successfully");
	}

}
