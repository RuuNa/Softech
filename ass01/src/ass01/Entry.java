package ass01;

public abstract class Entry {
	private String name;
	private Entry parent; //is it allowed to have variables that are not mentioned in the diagram?
	
	public Entry(Directory parent){
		this.parent = parent;
	}
	
	public void setParent(Directory parent){
		this.parent = parent;
	}
	
	public Entry getParent(){
		return parent;
	}
	
	public void setName(String name){
		this.name = name;
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
