package cn.edu.nju.concurrency;

public class BasicThreads {
	public static void main(String[] args) {
		//Thread t�߳���һ���µ��̣߳����Ը÷������������̣߳��Ǿ���t�̺߳�main�߳�
		Thread t = new Thread(new LiftOff());
		System.out.println("Starting for LiftOff");
		t.start();
		System.out.println("Waiting for LiftOff");
		System.out.println("ending for LiftOff");
	}
}
