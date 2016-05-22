package holding2;

import java.util.List;
import java.util.ListIterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIteration {
	public static void main(String[] args){
		List<Pet> pets=Pets.arrayList(8);
		ListIterator<Pet> it=pets.listIterator();
		System.out.println(pets);
		System.out.println(it);
		while(it.hasNext())
			System.out.println(it.next()+","+it.nextIndex()+
					","+it.previousIndex()+";");
//		System.out.println();
		System.out.println(pets);
		it=pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
}
