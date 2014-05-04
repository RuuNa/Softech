package ass01;

public class TestProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Directory d1 = new Directory(null, "bla");
		System.out.println(d1.getName());
		
		Directory d2 = new Directory((Directory) d1, "bla2");
		System.out.println(d2.getName());
		
		File f1 = new File((Directory)d2, "blubb1");
		System.out.println(f1.getName());
		
		Directory d3 = new Directory((Directory)d2, "bla3");
		System.out.println(d3.getName());
	}

}
