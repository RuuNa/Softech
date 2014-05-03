package ass01;

public class Entry {
	private String name;
	private Entry parent;
	
	public Entry(Directory parent){
		//TODO
	}
	
	public void setParent(Directory thisParent){
		parent = thisParent;
	}
	
	public Entry getParent(){
		return parent;
	}
	
	public void setName(String thisName){
		name = thisName;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean delete(){
		return true; //TODO
	}
	
	public boolean exists(){
		return true;//TODO
	}
}
