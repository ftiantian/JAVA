package cn.edu.nju.concurrency;

/**
 * ��������ʵ��Runnable�ӿڣ�����дrun()������ʹ�ø��������ִ���������
 * 
 * ���淽������������ʾ����֮ǰ�ĵ���ʱ
 * @author fantiantian
 *
 */
public class LiftOff implements Runnable {
	protected int countDown = 10;//����ÿ��������еĶ���10�뵹��ʱ
	private static int taskCount = 0;
	private final int id = taskCount++;//id������������Ķ��ʵ����final���ͣ�����ʼ����ϣ�����޸�
	
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status() {
		return "#" + id + "(" + (countDown>0 ? countDown:"Liftoff!") + "). ";
	}
	
	//�����run()����ͨ���ܻ���ĳ����ʽ��ѭ����ʹ������һֱ������ȥֱ��������Ҫ������ͨ��Ҫ��������ѭ��������
	public void run() {
		while(countDown-- > 0) {
			System.out.print(status());
			//���淽���ĵ����Ƕ��̵߳�����
			Thread.yield();
		}
		System.out.println();
	}
}
