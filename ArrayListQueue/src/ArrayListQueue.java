/**
 * By: Kurtis Yoder
 * 
 * This class creates a queue ADT implementing the QueueInterface
 * along with utilizing the ArrayList class
 */


import java.util.ArrayList;
import ch04.queues.*;

public class ArrayListQueue<T> implements QueueInterface<T> {
	
	private final int DEFAULTMAX = 100;
	private ArrayList<T> elements;
	private int maxSize;
	private boolean status;
	
	/**
	 * No-arg constructor
	 * Initialize queue instance
	 */
	public ArrayListQueue() 
	{
	    elements = new ArrayList<T>(DEFAULTMAX);
	    status = true;
	}
	
	/**
	 * Constructor
	 * Tell queue how long it can get
	 * @param queueSize Size of queue
	 */
	public ArrayListQueue(int queueSize) 
	{
	    elements = new ArrayList<T>(queueSize);
	    maxSize = queueSize;
	    status = false;
	}
	
	/**
	 * Adds a value to the back of the queue
	 * @param element Value to be added to queue
	 */
	public void enqueue(T element)
	{  
	    if (isFull())
	      throw new QueueOverflowException("You cannot add "
	      		+ "another element to a full queue");
	    else
	    {
	      elements.add(element);
	    }
	}
	
	/**
	 * Remove value from the front of the queue
	 * and return that value
	 * @return Return value at the front of the queue
	 */
	public T dequeue()
	{   
	    if (isEmpty())
	      throw new QueueUnderflowException("You cannot remove an "
	      		+ "element from an empty queue");
	    else
	    {
	      T elementReturned = elements.get(0);
	      elements.remove(0);
	      return elementReturned;
	    }
	}
	
	/**
	 * Method that checks whether
	 * the queue is empty or not
	 * @return Boolean with true or false
	 */
	public boolean isEmpty()
	{              
	    return (elements.size() == 0);
	}
	
	/**
	 * Method that checks whether
	 * the queue is full or not
	 * @return Boolean with true or false
	 */
	public boolean isFull()
	{         
		if(status == true) 
		{
			return elements.size() == DEFAULTMAX;
	    }
		else
		{
			return elements.size() == maxSize;
	    }
	}
	
	/**
	 * Method that gets the size of the queue
	 * currently
	 * @return Queue size
	 */
    public int size()
	{
    	return elements.size();
	}

}
