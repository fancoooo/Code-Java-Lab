package lab4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.font.TextLayout;

import javax.swing.JFrame;
import javax.swing.ViewportLayout;
import javax.swing.text.TextAction;

public class AwtExample extends JFrame{
	
	private final TextField text ;
	public AwtExample() {
		text = new TextField();
		text.setText("ahihi do ngoc");
		setLayout(new FlowLayout());
		setSize(350, 350);
		setLocation(100,100);
		Button b = new Button("Buton");
		add(b);
		close(b,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				add(text,BorderLayout.AFTER_LINE_ENDS);
			}
		});
		setVisible(true);
	}
	public void close(Button b,ActionListener r) {
		b.addActionListener(r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AwtExample t = new AwtExample();
	}

}
