package ass01;

public class File extends Entry{
	/* constructor */
	public File(Directory parent, String name) {
		super(parent); //super constructor
		this.setName(name); //set name
		this.setParent(parent); //set parent
		parent.setChild(this); //set this as the child of the parent
	}
}
