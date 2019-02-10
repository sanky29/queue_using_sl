
public interface queue_interface {

	//the enqueue function
	public void enqueue(Object t);
	
	//the denqueue function
	public Object dequeue();
	
	//the is empty function
	public boolean isEmpty();
	
	//the top function
	public Object top();
}

