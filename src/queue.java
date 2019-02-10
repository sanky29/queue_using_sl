import java.util.Scanner;

//define the class queue implementing queue_interface
public class queue implements queue_interface{

	//use a linked list with tail
	private list_with_tail<Object> queue = new list_with_tail<>();
	
	//define top function
	public Object top() {
		
		//if len == 0 throw the error
		if (queue.len == 0) {
			
			//throw the erro
			throw new IndexOutOfBoundsException("you have reached the end");
		}
		
		//else show the head
		else {

		//show the head
		return(queue.show_element());
		}
	}
	//define function is empty
	public boolean isEmpty() {
		
		//just return len==0
		return(queue.len == 0);
	}
	
	//define top function
	public Object dequeue() {
		
		//if len == 0 throw the error
		if (queue.len == 0) {
			
			//throw the erro
			throw new IndexOutOfBoundsException("you have reached the end");
		}
		
		//else show the head
		else {
			
		//define temprory object
		Object temp = queue.show_element();
		
		//delete the head
		queue.delete_element();
			
		//show the head
		return(temp);
		}
	}
	
	//define enque function
	public void enqueue(Object new_element) {
		
		//just add at tail
		queue.add_at_tail(new_element);
	}
	public static void main(String args[]) {
		queue s = new queue();
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		Integer t = 0;
		while (temp.matches("stop") != true) {
			
			switch(temp) {
			case "dq":
				System.out.println(s.dequeue());
				break;
			case "eq":
				t = scan.nextInt();
				s.enqueue(t);
				break;
			case "empty":
				System.out.println(s.isEmpty());
				break;
		
			case "top":
				System.out.println(s.top());
				break;
			}
			temp = scan.nextLine();
		}
		scan.close();
	}
}
