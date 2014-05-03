package ass01;

public class File extends Entry{
	
	private String name;

	public File(Directory parent, String name) {
		super(parent);
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

}
