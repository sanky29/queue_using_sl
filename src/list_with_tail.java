
//define list class to play operations on nodes
public class list_with_tail<Type> {
	
	  //the list is just location of head node and we can then achieve whole list
	  //so just define variable node
      private node<Type> head = new node<>();
      
      //one must have variable to store the length of list
      public int len = 0;
      
      //just define the tail node
      private node<Type> tail = new node<>();
      
      //also define function to add at tail
      public void add_at_tail(Type new_element) {
    	  
    	  //if len is zero link the head and tail
    	  if(len == 0) {
    		  
    		  //just link head and tail
    		  head.change_next(tail); 
    		  
    		  //change element of tail
    		  tail.change_element(new_element);
    		  
    		  //len ++
    		  len++;
    	  }
    	  
    	  //else change element
    	  else {
    		  //just define new node as
    		  node<Type> new_node = new node<>(new_element);
    	  
    		  //just change next of tail
    		  tail.change_next(new_node);
    	  
    		  //now change tail to new_node
    		  tail = new_node;
    	  
    		  //increase length
    		  len++;
    	  }
      }
           //make function to get i_th value of list
      public Type show_element() {
    	  
    	  //for heck of queue
    	  if(len  == 1) {
    		  
    		  //just return element in tail
    		  return(tail.show_element());
    	  }
    	  //else run for loop for current node and return its value
    	  else {
    		  
    		  //just return next to head
    		  return(head.show_next().show_element());
    	  }
      }
      
      //define function to delete the ith element in the list
      public void delete_element () {
    		  
    	  //just delete the 1st element
    	  node<Type> temp = head.show_next();
    	  
    	  //now just change head next to temp
    	  head = temp;
    	  
      }
}
