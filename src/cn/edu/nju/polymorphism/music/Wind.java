package cn.edu.nju.polymorphism.music;

public class Wind extends Instrument {
	public Wind() {
//		super(8);
		System.out.println("create Wind()");
//		super(4);
	}
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}