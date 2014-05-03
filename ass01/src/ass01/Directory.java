package ass01;

public class Directory extends Entry{

	private String name;

	public Directory(Directory parent, String name) {
		super(parent);
		this.setName(name);
	}
	
	public boolean delete(){
		return true; //TODO. OVERWRITES DELETE()
	}
	
	public boolean deleteRecursively(){
		super.delete(); //call delete method of the parent directory
		return true;
	}
	
	public File createFile(String name){
		File file = new File(this, name);
		return file;
	}
	
	public Directory createDir(String name){
		Directory dir = new Directory(this, name);
		return dir;
	}

}
