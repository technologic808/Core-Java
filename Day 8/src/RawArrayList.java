import java.util.ArrayList;
import java.util.Date;

public class RawArrayList {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(100);
		l1.add("String");
		l1.add(new Date());
		String s = (String) l1.get(0);
		int in = (int) l1.get(0);
		for(Object o: l1)
		{
			if(o instanceof Integer)
			{
				System.out.println((int)o);
			}
			else if (o instanceof String)
			{
				System.out.println((String)o);
			}
			else if (o instanceof Date)
			{
				System.out.println((Date)o);
			}
		}
	}
}
