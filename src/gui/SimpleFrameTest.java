package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SimpleFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				SimpleFrame frame=new SimpleFrame();
				//用户关闭框架时的响应动作
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
class SimpleFrame extends JFrame{
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	
	public SimpleFrame(){
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}
