package cn.edu.nju.annotion;

@MyAnno(show = "hh")
public class Demo {
	private int num;
	public Demo() {
		
	}
	public Demo(int num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		return num;
	}
	@Override
	public boolean equals(Object d) {
		return true;
	}
	@Override
	public String toString() {
//		return this.getClass() + "@@@" +this.hashCode();
		return "Demo hhh";
	}
}
