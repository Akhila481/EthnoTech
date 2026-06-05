import java.util.Set;
import java.util.HashSet;
public class SetOperations {
	public static void main(String args[])
	{
		Set<Integer> set=new HashSet<>();
		//add() method
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		//remove() method
		set.remove(3);
		set.remove(6);
		//checks set is empty or not
		System.out.println(set.isEmpty());
		//accessing
		for(int num:set)
		{
			System.out.println(num+" ");
		}
		//size() method
		System.out.println("the size of set is:"+set.size());	
		//contains()
		System.out.println(set.contains(10));
	}
}