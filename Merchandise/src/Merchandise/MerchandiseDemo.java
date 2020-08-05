package Merchandise;
public class MerchandiseDemo {
	public static void main(String[] args)
	{
		Merchandise st = new Merchandise("Stan", 754548887.98787987);
		Merchandise dt = new Merchandise("Dan", 7);
		System.out.println(st.equals(dt));
		System.out.println(st.compareTo(dt));
		System.out.println(st.toString());
	}
}
