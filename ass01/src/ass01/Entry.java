package ass01;

public abstract class Entry {
	private String name; //name is relevant to determine if an entry exists
	private Directory parent; //is set if an entry has a parent, which is always a directory
	
	/* constructor */
	public Entry(Directory parent){
		this.parent = parent;
	}
	
	/* parent setter */
	public void setParent(Directory parent){
		this.parent = parent;
	}
	
	/* parent getter */
	public Directory getParent(){
		return parent;
	}
	
	/* name setter */
	public void setName(String name){
		this.name = name;
	}
	
	/* name getter */
	public String getName(){
		return name;
	}
	
	/* delete an entry */
	public boolean delete(){
		this.setName(null); //an entry is considered deleted, if it no longer has a name
		return true; //TODO
	}
	
	/* check if the given entry is considered existent */
	public boolean exists(){
		if(name != null){ //if a name is set, the entry exists
			return true;
		}else{
			return false;
		}
	}
}
