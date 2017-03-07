package cn.edu.nju.concurrency;

public abstract class IntGenerator {
	//Ϊ��ȷ�������ԣ�����canceled��־����Ϊvolatile
	private volatile boolean canceled = false;
	
	public abstract int next();
	
	public void cancel() {
		canceled = true;
	}
	
	public boolean isCanceled() {
		return canceled;
	}
}
