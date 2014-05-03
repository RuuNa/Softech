package ass01;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry{

	private Vector<Entry> children;
	
	public void setChild(Entry child){
		children.add(child);
	}
	
	public Directory(Directory parent, String name) {
		super(parent);
		this.setName(name);
		children = new Vector<Entry>();
		this.setParent(parent);
		parent.setChild(this);
	}
	
	public boolean delete(){
		if (this.exists()){
			this.deleteRecursively();
		}else{
			//this.delete();
		}
			
		return true; //TODO. OVERWRITES DELETE()
	}
	
	public boolean deleteRecursively(){
		Iterator<Entry> it = children.iterator();
		while(it.hasNext()){
			Entry e = it.next();
			e.delete();
		}
		return true;
	}
	
	public File createFile(String name){
		File file = new File(this, name);
		this.setChild(file);
		return file;
	}
	
	public Directory createDir(String name){
		Directory dir = new Directory(this, name);
		return dir;
	}
	
	public String doMagic(Entry e){
		return e.getName();
	}
}
