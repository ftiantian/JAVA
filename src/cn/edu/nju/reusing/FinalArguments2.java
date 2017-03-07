package cn.edu.nju.reusing;

class Gizmo2 {
	Gizmo2() {
		System.out.println("Gizmo2()");
	}
	public void spin() {
		System.out.println("spin()");
	}
}
public class FinalArguments2 {
	void with(final Gizmo2 g) {
		//g = new Gizmo2();不能在此处定义，因为g是final
		System.out.println("final Gizmo2");
	}
	
	void without(Gizmo2 g) {
		g = new Gizmo2();
		g.spin();
		System.out.println("without final Gizmo2");
	}
	
	int g(final int i) {
		return i+1;
	}
	
	public static void main(String[] args) {
		FinalArguments2 bf = new FinalArguments2();
		bf.without(new Gizmo2());
		System.out.println("with()");
		bf.with(new Gizmo2());
	}
	
}
