package gui;

import java.awt.EventQueue;
import java.awt.Image;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ResourceTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame=new ResourceTestFrame();
				frame.setTitle("ResourceTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class ResourceTestFrame extends JFrame{
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=300;
	
	public ResourceTestFrame(){
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		URL aboutURL=getClass().getResource("data//psb.gif");
		Image img=new ImageIcon(aboutURL).getImage();
		setIconImage(img);
		
		JTextArea textArea=new JTextArea();
		InputStream stream=getClass().getResourceAsStream("data\\aaa.txt");
		Scanner in=new Scanner(stream);
		while(in.hasNext())
			textArea.append(in.nextLine()+"\n");
		add(textArea);
	}
}