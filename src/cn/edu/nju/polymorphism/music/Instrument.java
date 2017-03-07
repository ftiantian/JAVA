package cn.edu.nju.polymorphism.music;

class Instrument {
	public Instrument() {
		System.out.println("create instrument()");
	}
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}
