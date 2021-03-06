package holding2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
	public static void main(String[] args){
		List<Snow> snow1=Arrays.asList(
				new Crusty(),new Slush(),new Powder());
//		List<Snow> snow2=Arrays.asList(new Light(),new Heavy());
//		Collections.addAll(snow1, new Light());
		List<Snow> snow3=new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(),new Heavy());
		List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
		for(Snow c:snow1)
			System.out.print(c+" ");
		System.out.println();
		for(Snow c:snow3)
			System.out.print(c+" ");
		System.out.println();
		for(Snow c:snow4)
			System.out.print(c+" ");
	}
}
