package strings;

public class SimpleFormat {
	public static void main(String[] args){
		int x=5;
		double y=5.332542;
		//the old way
		System.out.println("Row q:["+x+" "+y+"]");
		//the new way
		System.out.format("Row 1:[%d %f]\n",x,y);
		//or
		System.out.printf("Row 1:[%d %f]\n",x,y);
	}
}
