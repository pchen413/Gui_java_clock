import java.util.ArrayList;
import java.util.StringTokenizer;

public class Project1 
{
	public static void main(String[] args) 
	{
		String FileName = args[0];
		TextFileInput tfi = new TextFileInput(FileName);
		ArrayList <Clock> clocks = new ArrayList<Clock>();
		String line = tfi.readLine();
		
		while(line != null) {
			int[] time = new int[3];
			StringTokenizer st = new StringTokenizer(line,":");
			int TokenCount = st.countTokens();
			for(int i = 0; i < TokenCount ; i++) {
				time[i] = Integer.parseInt(st.nextToken(":"));
			}
			clocks.add(new Clock(time[0],time[1],time[2]));
			line = tfi.readLine();
		}
		
		ClockGUI showClock = new ClockGUI(clocks);
		

	}
}
