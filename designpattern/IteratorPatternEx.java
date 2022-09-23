package designpattern;


interface Iterator{
	
	public boolean hashNext();
	public Object next();
}


class CollectionOfNames implements Container{
	
	public String name[] = {"Raj","Ajay","Tahir","Meera","Meena","Paras"}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CollectionNamesIterate();
	}
	
	private class CollectionNamesIterate implements Iterator{
		int i;

		@Override
		public boolean hashNext() {
			// TODO Auto-generated method stub
			if(i<name.length)
				return true;
			else
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if this.
			return null;
		}
	}
	
}
public class IteratorPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
