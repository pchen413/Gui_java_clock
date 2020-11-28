import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class ClockGUI extends JFrame
{
	private ArrayList<Clock> clock;
	private JTextArea a,b;
	public ClockGUI(ArrayList<Clock> c) {
		clock = c;
		setTitle("Clock Times");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,350);
		setLocation(200,200);
		setLayout(new GridLayout(1,2));
		a = new JTextArea("Unsorted Times" + "\n");
		a.setEditable(false);
		for(int i = 0; i < clock.size(); i++) {
			a.append(clock.get(i).toString() + "\n");
		}
		add(a);
		
		selectSort(clock);
		b = new JTextArea("Sorted Times" + "\n");
		b.setEditable(false);
		for(int i = 0; i < clock.size(); i++) {
			b.append(clock.get(i).toString() + "\n");
		}
		add(b);
		setVisible(true);
		
	}
	
	
	private void selectSort(ArrayList<Clock> clock) {
		for(int i = 0; i < clock.size(); i++) {
			int x = i;
			for(int j = i+1; j < clock.size(); j++) {
				if(clock.get(j).getHour() < clock.get(x).getHour())
					x = j;
			}
			Clock temp = clock.get(x);
			clock.set(x,  clock.get(i));
			clock.set(i, x);
		}
	}
	
	
}

