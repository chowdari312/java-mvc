package mvs;

public class model {
	private String title;
	private String description;
    private int level;
	model(String title,String description,int level)
	{
		this.title=title;
		this.description=description;
		this.level=level;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public int getLevel() {
		return level;
	}
	
	
	
  
}
										