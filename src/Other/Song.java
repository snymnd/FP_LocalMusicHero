package Other;

public class Song {

	private String path;
	private String title;
    private String subtitle;
	private Integer[] timeBeat;
	private Integer[] timeBeat1;
	private Integer[] timeBeat2;
	
	public Song() {
	
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

    public String getSubTitle() {
		return subtitle;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    public void setSubTitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Integer[] getTimeBeat() {
		return timeBeat;
	}
	public Integer[] getTimeBeat1() {
		return timeBeat1;
	}
	public Integer[] getTimeBeat2() {
		return timeBeat2;
	}

	public void setTimeBeat(Integer[] timeBeat) {
		this.timeBeat = timeBeat;
	}
	public void setTimeBeat1(Integer[] timeBeat) {
		this.timeBeat1 = timeBeat;
	}
	public void setTimeBeat2(Integer[] timeBeat) {
		this.timeBeat2 = timeBeat;
	}
}
