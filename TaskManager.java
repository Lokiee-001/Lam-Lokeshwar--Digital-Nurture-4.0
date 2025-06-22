package task__manager;

	public class TaskManager {
	    Task head;

	    void add(int id, String name, String status) {
	        Task t = new Task(id, name, status);
	        if (head == null) head = t;
	        else {
	            Task cur = head;
	            while (cur.next != null) cur = cur.next;
	            cur.next = t;
	        }
	    }

	    void delete(int id) {
	        if (head == null) return;
	        if (head.id == id) {
	            head = head.next;
	            return;
	        }
	        Task cur = head;
	        while (cur.next != null && cur.next.id != id) cur = cur.next;
	        if (cur.next != null) cur.next = cur.next.next;
	    }

	    Task search(int id) {
	        Task cur = head;
	        while (cur != null) {
	            if (cur.id == id) return cur;
	            cur = cur.next;
	        }
	        return null;
	    }

	    void edit(int id, String newName, String newStatus) {
	        Task t = search(id);
	        if (t != null) {
	            t.name = newName;
	            t.status = newStatus;
	            System.out.println("Task updated.");
	        } else {
	            System.out.println("Task not found.");
	        }
	    }

	    void show() {
	        if (head == null) {
	            System.out.println("No tasks found.");
	            return;
	        }
	        Task cur = head;
	        System.out.println("ID | Name | Status");
	        while (cur != null) {
	            System.out.println(cur.id + " | " + cur.name + " | " + cur.status);
	            cur = cur.next;
	        }
	    }
	}
