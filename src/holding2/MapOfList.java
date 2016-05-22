package holding2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typeinfo.pets.Cat;
import typeinfo.pets.Cymric;
import typeinfo.pets.Dog;
import typeinfo.pets.Mutt;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;
import typeinfo.pets.Rat;

public class MapOfList {
	public static Map<Person,List<? extends Pet>>
		petPeople=new HashMap<Person,List<? extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"), 
				Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
		petPeople.put(new Person("Kate"), 
				Arrays.asList(new Cat("Shackleton"),
						new Cat("Elsie May"),new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"), Arrays.asList(
				new Pug("aaaaa"),new Cat("bbbbb"),new Cat("ccccc")));
		petPeople.put(new Person("Li"), Arrays.asList(
				new Rat("Fuzzy"),new Rat("Fizzy")));
		petPeople.put(new Person("fanzhenzhen"), Arrays.asList(new Rat("ddddd")));
	}
	public static void main(String[] args){
		System.out.println("People: "+petPeople.keySet());
		System.out.println("Pets: "+petPeople.values());
		for(Person person:petPeople.keySet()){
			System.out.println(person+"has:");
			for(Pet pet:petPeople.get(person))
				System.out.print("    "+pet);
			System.out.println();
		}
	}
}
