package ass01;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry{

	/* vector of directory-children */
	private Vector<Entry> children; //a child can be an entry, therefore a directory or a file
	
	//declares an entry(parameter) as the child of this directory
	public void setChild(Entry child){
		children.add(child);
	}
	
	/* directory constructor */
	public Directory(Directory parent, String name) {
		super(parent); //super constructor
		this.setName(name); //set name using super class method
		children = new Vector<Entry>(); //make sure a children vector is created
		this.setParent(parent); //set parent using super class method
		parent.setChild(this); //set this as the child of the parent (always a directory)
	}
	
	/* check if this directory has children */
	public boolean hasChildren(){
		if(children.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	
	/* override the super class delete method */
	public boolean delete(){
		if (this.hasChildren()){ //if there are children use deleteRecursively instead
			this.deleteRecursively();
		}else{ //else set name to null and clean up the children vector, then consider this directory deleted
			this.children = null;
			this.setName(null);
		}			
		return true; 
	}
	
	/* delete method when this directory has children */
	public boolean deleteRecursively(){
		Iterator<Entry> it = children.iterator();
		while(it.hasNext()){ //iterate the children vector, call the delete method of all entries inside
			Entry e = it.next();
			e.delete();
		}
		this.delete(); //delete this, after calling delete for all children
		return true;
	}
	
	/* create a file object */
	public File createFile(String name){
		File file = new File(this, name);
		this.setChild(file); //the created file is set as this directory's child
		return file;
	}
	
	/* create a directory object */
	public Directory createDir(String name){
		Directory dir = new Directory(this, name);
		this.setChild(dir); //the created directory is set as this directory's child
		return dir;
	}
}
