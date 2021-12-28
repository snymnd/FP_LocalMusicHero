package object;

public class Song {
	private String path;
	private String title;
    private String subtitle;
	private Integer[] timeBeat;
	private Integer[] timeBeat1;
	private Integer[] timeBeat2;
	private Integer[] timeSpecialBeat;
	private Integer[] timeSpecialBeat1;
	private Integer[] timeSpecialBeat2;
	
	public Song() {}
	
    //Setter
    public void setPath(String path) {
		this.path = path;
	}

    public void setTitle(String title) {
		this.title = title;
	}

    public void setSubTitle(String subtitle) {
		this.subtitle = subtitle;
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
	public void setTimeSpecialBeat(Integer[] timeBeat) {
		this.timeSpecialBeat = timeBeat;
	}
	public void setTimeSpecialBeat1(Integer[] timeBeat) {
		this.timeSpecialBeat1 = timeBeat;
	}
	public void setTimeSpecialBeat2(Integer[] timeBeat) {
		this.timeSpecialBeat2 = timeBeat;
	}
	
    //Getter
    public String getPath() {
		return path;
	}

	public String getTitle() {
		return title;
	}

    public String getSubTitle() {
		return subtitle;
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

	public Integer[] getTimeSpecialBeat() {
		return timeSpecialBeat;
	}
	public Integer[] getTimeSpecialBeat1() {
		return timeSpecialBeat;
	}
	public Integer[] getTimeSpecialBeat2() {
		return timeSpecialBeat;
	}

}
