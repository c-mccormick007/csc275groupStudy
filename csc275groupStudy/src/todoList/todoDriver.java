package todoList;

public class todoDriver {

	public static void main(String[] args) {
		
		Task task1 = new Task("Do my laundry", "Make sure to seperate the darks from the delicates");
		
		System.out.println(task1);
		
		task1.setDescription("Be sure to turn all your clothes right side out before washing.");
		task1.setIsCompleted(true);
		System.out.println(task1);
	}

}
