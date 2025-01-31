package todoList;

//todo: create a CLI task list that uses IO and exception handling.
//classes & objects: inheritance and polymorphism
//IO & exception handling: File, Scanner, BufferedReader, PrintWriter, BufferedWriter, FileWriter

public class Task {
	
	private String title;
	private String description;
	private boolean completed;
	
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
		this.completed = false;
	}
	
	// Getters
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public boolean isCompleted() {
		return this.completed;
	}
	
	//Setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	//todo: change the name of the method to toggleCompleted, don't pass any arguments and control the flow of toggling completion here.
	public void setIsCompleted(boolean completed) {
		this.completed = completed;
	}
	
	@Override
	public String toString() {
		return "[Task] [title=\"" + this.title + ", description=\"" + this.description + "\", completed=\"" + this.completed + "\"]";
	}
}
