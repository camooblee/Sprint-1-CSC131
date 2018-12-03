//Sprint 1 CL
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pirex implements ActionListener {
		JMenu menu;
		JMenuItem item1;	//Exit button

		Pirex() {
			JFrame f = new JFrame();
			JMenuBar mb = new JMenuBar();	//mb = menubar
			menu = new JMenu("File");
			item1 = new JMenuItem("Exit");
			item1.addActionListener(this);
			
			menu.add(item1);
			mb.add(menu);
			
			f.setJMenuBar(mb);
			f.setSize(400, 400);
			f.setLayout(null);
			f.setVisible(true);
			}

		public static void main(String args[]) {
			new Pirex();
			}

		@Override
		public void actionPerformed(ActionEvent aE) {
			System.exit(0);
			}

	}

