package todoList;

public class PriorityTask extends Task {
	
	private int priority;
	
	public PriorityTask(String title, String description, int priority) {
		super(title, description);
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "[PriorityTask] [title=\"" + this.getTitle() + 
				", description=\"" + this.getDescription() + 
				"\", priority=\"" + this.priority + 
				"\", completed=\"" + this.isCompleted() + "\"]";
	}
}
