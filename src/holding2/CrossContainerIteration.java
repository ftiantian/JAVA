package holding2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CrossContainerIteration {
	public static void display(Iterator<Pet> it){
		int i=0;
		while(it.hasNext()){
			i++;
			Pet p=it.next();
			System.out.print(i+":"+p+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		ArrayList<Pet> pets=Pets.arrayList(8);
		LinkedList<Pet> petsLL=new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS=new HashSet<Pet>(pets);
//		TreeSet<Pet> petsTS=new TreeSet<Pet>(pets);
		System.out.println("1:"+pets);
		display(pets.iterator());
		System.out.println("2:"+petsLL);
		display(petsLL.iterator());
		System.out.println("3:"+petsHS);
		display(petsHS.iterator());
//		System.out.println("4:"+petsTS);
//		display(petsTS.iterator());
	}
}
