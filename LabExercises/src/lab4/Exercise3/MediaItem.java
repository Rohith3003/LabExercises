package lab4.Exercise3;

public abstract class MediaItem extends Item{
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public abstract void play();
	public abstract void pause();
	public abstract void resume();
	public abstract void stop();
}
