package todoList;

public class PriorityTask extends Task {
	
	private int priority;
	
	public PriorityTask(String title, String description, int priority) {
		super(title, description);
		this.priority = priority;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		PriorityTask other = (PriorityTask) obj;
		return this.getTitle().equals(other.getTitle()) && 
				this.getDescription().equals(getDescription()) && 
				this.priority == other.priority && 
				this.isCompleted() == other.isCompleted();
	}
	
	@Override
	public String toString() {
		return "[PriorityTask] [title=\"" + this.getTitle() + 
				", description=\"" + this.getDescription() + 
				"\", priority=\"" + this.priority + 
				"\", completed=\"" + this.isCompleted() + "\"]";
	}
}
