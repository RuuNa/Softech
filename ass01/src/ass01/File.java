package ass01;

public class File extends Entry{
	
	public File(Directory parent, String name) {
		super(parent);
		this.setName(name);
		this.setParent(parent);
		parent.setChild(this);
	}
}
