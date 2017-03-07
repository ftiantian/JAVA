package cn.edu.nju.concurrency;

public abstract class IntGenerator {
	//为了确保可视性，所以canceled标志设置为volatile
	private volatile boolean canceled = false;
	
	public abstract int next();
	
	public void cancel() {
		canceled = true;
	}
	
	public boolean isCanceled() {
		return canceled;
	}
}
