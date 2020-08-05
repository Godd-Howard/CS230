

public class QueueTest{
	

	public static void main(String[] args)
	{
		ArrayListQueue <String> st = new ArrayListQueue <String> (7);
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		st.enqueue("4");
		st.enqueue("3");
		st.enqueue("2");
		st.enqueue("67");
		st.enqueue("7");
		st.enqueue("1");
		st.enqueue("8");
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		st.enqueue("23");
		st.enqueue("9");
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		System.out.println(st.size());
		System.out.println(st.dequeue());
		st.enqueue("65");
		st.enqueue("1");
		System.out.println(st.size());
	}	
}
