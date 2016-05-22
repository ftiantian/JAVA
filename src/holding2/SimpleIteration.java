package holding2;

import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class SimpleIteration {
	public static void main(String[] args){
		List<Pet> pets=Pets.arrayList(12);
		System.out.println(pets);
		Iterator<Pet> it=pets.iterator();
		int i=0;
		while(it.hasNext()){
			i++;
			Pet p=it.next();
			System.out.println(i+":"+p+" ");
		}
		System.out.println();
		for(Pet p:pets)
			System.out.print(p+" ");
		System.out.println();
		it=pets.iterator();
		for(int j=0;j<6;j++){
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}
}
