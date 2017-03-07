package cn.edu.nju.concurrency;

/**
 * 定义任务，实现Runnable接口，并编写run()方法，使得该任务可以执行你的命令
 * 
 * 下面方法的任务是显示发射之前的倒计时
 * @author fantiantian
 *
 */
public class LiftOff implements Runnable {
	protected int countDown = 10;//代表每个任务进行的都是10秒倒计时
	private static int taskCount = 0;
	private final int id = taskCount++;//id用来区分任务的多个实例，final类型，被初始化后不希望被修改
	
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status() {
		return "#" + id + "(" + (countDown>0 ? countDown:"Liftoff!") + "). ";
	}
	
	//任务的run()方法通常总会有某种形式的循环，使得任务一直运行下去直到不再需要，所以通常要设置跳出循环的条件
	public void run() {
		while(countDown-- > 0) {
			System.out.print(status());
			//下面方法的调用是对线程调度器
			Thread.yield();
		}
		System.out.println();
	}
}
