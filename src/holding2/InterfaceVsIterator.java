package holding2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class InterfaceVsIterator {
	public static void display(Iterator<Pet> it){
		int i=0;
		while(it.hasNext()){
			i++;
			Pet p=it.next();
			System.out.print(i+":"+p+" ");
		}
		System.out.println();
	}
	public static void display(Collection<Pet> pets){
		int i=0;
		for(Pet p:pets){
			i++;
			System.out.print(i+":"+p+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		List<Pet> petList=Pets.arrayList(8);
		Set<Pet> petSet=new HashSet<Pet>(petList);
		Map<String,Pet> petMap=new LinkedHashMap<String,Pet>();
		String[] names=("Ralph Eric Robin Lacey "+
		"Britney Sam Spot Fluffy").split(" ");
		for(int i=0;i<names.length;i++)
			petMap.put(names[i], petList.get(i));
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		System.out.print(petMap);
		System.out.println();
		System.out.print(petMap.keySet());
		System.out.println();
		display(petMap.values());
		display(petMap.values().iterator());
	}
}
