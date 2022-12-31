
import java.util.*;
public class FCFS implements Algorithm {
	private List<Task> queue;
	
	public FCFS(List<Task> queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}

	@Override
	public void schedule() {
		// TODO Auto-generated method stub
		List<Task> scheduledTasks = new ArrayList<Task>();
		
		int tID = queue.get(0).getTid();
		

		System.out.println(scheduledTasks);
		
	}

	@Override
	public Task pickNextTask() {
	     return null;
	}

}
