package task__manager;

public class Task {

	    int id;
	    String name;
	    String status;
	    Task next;

	    Task(int id, String name, String status) {
	        this.id = id;
	        this.name = name;
	        this.status = status;
	        this.next = null;
	    }
	}
