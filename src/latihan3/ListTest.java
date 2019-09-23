package latihan3;

public class ListTest {
	public static void main(String[] args) {
		List l = new List();
		l.addHead(2);
		l.addHead(9);
		l.addHead(7);
		
		l.displayElement();
		
		System.out.println();
		System.out.println();
	
		List l2 = new List();
		l2.addHead(2);
		l2.addHead(9);
		l2.addHead(7);
		l2.removeHead();
	
		l2.displayElement();
	}
}
