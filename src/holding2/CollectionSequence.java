package holding2;

import java.util.AbstractCollection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionSequence extends AbstractCollection<Pet>{
	private Pet[] pets=Pets.createArray(8);
	@Override
	public Iterator<Pet> iterator() {
	
		return new Iterator<Pet>(){
			private int index=0;
			public boolean hasNext(){
				return index < pets.length;
			}
			public Pet next(){
				return pets[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args){
		CollectionSequence c=new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}

	@Override
	public int size() {
		return pets.length;
	}
	
	
}
