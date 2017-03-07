package cn.edu.nju.JavaConcurrency;

/**
 * ���������java���ֱ��ϵ�һЩ������̵�����
 * ��ʶ�̲߳���ȫ�Ĵ���
 * @author fantiantian
 *
 */
public class NoVisiablityTest {
	private static class ReadThread extends Thread {
		private boolean ready;
		private int number;
		
		public void run() {
			while(!ready) {
				number++;
			}
			System.out.println(ready);
		}
		
		public void readyOn() {
			this.ready = true;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReadThread readThread = new ReadThread();
		readThread.start();
		Thread.sleep(100);
		readThread.readyOn();
		System.out.println(readThread.ready);
	}
}